package elpuig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestor {
    Scanner scanner = new Scanner(System.in);
    boolean existe = false;
    List<Alimentación> alimentacións = new ArrayList<>();
    List<Textil> textils = new ArrayList<>();
    List<Electronica> electronics = new ArrayList<>();
    Alimentación alimentación = new Alimentación();
    Textil textil = new Textil();
    Electronica electronica = new Electronica();


    public void intoducirtextil(){


        System.out.println("Introduce el nombre");
        textil.setnom(scanner.nextLine());
        System.out.println("Introduce el precio");
        textil.setpreu(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Introduce la composición");
        textil.setComposicion(scanner.nextLine());
        System.out.println("Introduce el codigo de barras");
        textil.setcodi(scanner.nextInt());
        scanner.nextLine();
        textils.add(textil);
    }

    public void intoducirElectronica(){

        System.out.println("Introduce el nombre");
        electronica.setnom(scanner.nextLine());
        System.out.println("Introduce el precio");
        electronica.setpreu(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Introduce la composición");
        electronica.setDiesGarantia(scanner.nextInt());
        System.out.println("Introduce el codigo de barras");
        electronica.setcodi(scanner.nextInt());
        scanner.nextLine();
        electronics.add(electronica);
    }
}
