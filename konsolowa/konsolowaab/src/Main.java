import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Pralka pralka = new Pralka();
        Odkurzacz odkurzacz = new Odkurzacz();
        System.out.println("Podaj numer prania: 1...12");
        Scanner scanner = new Scanner(System.in);
        int numerPrania = scanner.nextInt();
        if(pralka.ustawProgram(numerPrania) == 0){
            pralka.wyswietlKomunikat("bledny numer pgramu");
        }
        else{
            pralka.wyswietlKomunikat("program ustaiwono");
        }
        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.wyswietlKomunikat("odkurzacz sie wyladowal");
        odkurzacz.off();
    }
}