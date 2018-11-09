package elpuig.Widgets;

public class WindowTitle {
    public void show(String title){

        System.out.println("\n\033[97;44m"+String.format("%-64s", title.toUpperCase())+"\033[0m\n");
    }
}
