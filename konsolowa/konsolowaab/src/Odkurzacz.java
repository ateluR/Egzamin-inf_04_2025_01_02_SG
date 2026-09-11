public class Odkurzacz extends Urzadzenie{
    private boolean stanOdkurzacza = false;
    public void on(){
        if (stanOdkurzacza == false){
            stanOdkurzacza = true;
            wyswietlKomunikat("odkurzacz wlaczony");
        }
    }
    public void off(){
        if (stanOdkurzacza == true){
            stanOdkurzacza = false;
            wyswietlKomunikat("odkurzacz wylaczony");
        }
    }
}
