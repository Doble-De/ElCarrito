package elpuig;

import elpuig.Widgets.MenuWidget;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MenuWidget menu = new MenuWidget();
        Gestor gestor = new Gestor();
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
                                gestor.insertarAlimentacion();
                                break;
                            case 2:
                                gestor.intoducirtextil();
                                break;
                            case 3:
                                gestor.intoducirElectronica();
                                break;
                        }
                    }
                case 2:
                    gestor.generartiquet();
                    break;
                case 3:
                    gestor.mostrarCarro();
                    break;
            }
        }

    }
}
