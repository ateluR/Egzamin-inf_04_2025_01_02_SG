public class Pralka extends Urzadzenie{
    private int numerprogramu = 0;
    public int ustawProgram(int numerPr){
        if(numerPr>= 1 && numerPr<= 012){
            numerprogramu = numerPr;
        }
        else {
            numerprogramu = 0;
        }
        return numerprogramu;
    }
}