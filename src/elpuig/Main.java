package elpuig;

import elpuig.Widgets.MenuWidget;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alimentación> alimentacións = new ArrayList<>();
        List<Textil> textils = new ArrayList<>();
        List<Electronica> electronics = new ArrayList<>();

        MenuWidget menu = new MenuWidget();
        boolean exit = true;

        while (exit) {
            System.out.println("|----------------------|");
            System.out.println("|Bienvenido a Correfour|");
            System.out.println("|----------------------|");
            switch (menu.crearMenu("Seleccona una opcion", "Introducir Producto", "Pasar por caja", "Mostrar carro de la compra")) {

                case 0: exit = false;
                    System.out.println("Hasta la vista");
                    break;

                case 1:
                    boolean salir = true;
                    while (salir) {
                        switch (menu.crearMenu("¿De que categoria quieres añadir productos?", "Alimentacion", "Textil", "Electronica")) {
                            case 0:
                                salir = false;
                                System.out.println("Volviendo al menú anterior");
                                break;
                            case 1:
                                //Alimentacion
                                break;
                            case 2:
                                //Textil
                                break;
                            case 3:
                                //Electronica
                                break;
                        }
                    }
                case 2:
                    //Pasar Por caja
                    break;
                case 3:
                    //Mostrar carro
                    break;
            }
        }

    }
}
