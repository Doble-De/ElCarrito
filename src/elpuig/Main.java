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
            System.out.println("|---------------------------|");
            System.out.println("|Bienvenido a \033[34mCarrofour\033[0m \033[31m\uD83D\uDED2x4\033[0m|");
            System.out.println("|---------------------------|");
            switch (menu.crearMenu("Seleccona una opcion", "Introducir Producto \uD83D\uDCC4", "Pasar por caja \033[36m\uD83D\uDCE0\033[0m", "Mostrar carro de la compra\033[31m\uD83D\uDED2\033[0m")) {

                case 0: exit = false;
                    System.out.println("Hasta la vista");
                    break;

                case 1:
                    boolean salir = true;
                    while (salir) {
                        switch (menu.crearMenu("¿De que categoria quieres añadir productos?", "Alimentacion\033[35m\uD83C\uDF47\033[0m", "Textil\033[31m\uD83E\uDDE5\033[0m", "Electronica\033[34m\uD83D\uDCBB\033[0m")) {
                            case 0:
                                salir = false;
                                System.out.println("Volviendo al menú anterior\n\n");
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
                    break;
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
