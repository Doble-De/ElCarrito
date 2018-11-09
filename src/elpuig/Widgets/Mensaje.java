package elpuig.Widgets;

public class Mensaje {

    public void mostrarHint(String hint){
        System.out.println("\033[100m ✎ "+hint + "\033[0m");
    }
    public void mostrarError(String texto){
        System.out.println("\033[31m \uD83D\uDEAB " + texto + "\033[0m");
    }
}
