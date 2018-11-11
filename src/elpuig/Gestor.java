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
    List<Carro> carros = new ArrayList <>();





    public void intoducirtextil(){

        Textil textil = new Textil();
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

        Electronica electronica = new Electronica();
        System.out.println("Introduce el nombre");
        electronica.setnom(scanner.nextLine());
        System.out.println("Introduce el precio");
        electronica.setpreu(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Introduce los dias de garantia");
        electronica.setDiesGarantia(scanner.nextInt());
        electronica.setpreu(electronica.PrecioFinalE());
        System.out.println("Introduce el codigo de barras");
        electronica.setcodi(scanner.nextInt());
        scanner.nextLine();
        electronics.add(electronica);
    }

    public void insertarAlimentacion(){

        Alimentación alimentación = new Alimentación();
        System.out.println("Introduce el nombre");
        alimentación.setnom(scanner.nextLine());
        System.out.println("Introduce el precio");
        alimentación.setpreu(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Introduce el año de caducidad");
        alimentación.setAño(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Introduce el mes de caducidad");
        alimentación.setMes(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Introduce el dia de caducidad");
        alimentación.setDia(scanner.nextInt());
        scanner.nextLine();
        alimentación.setpreu(alimentación.PrecioFinalA(alimentación.getDiasRestantes()));
        System.out.println("Introduce el codigo de barras");
        alimentación.setcodi(scanner.nextInt());
        scanner.nextLine();
        alimentacións.add(alimentación);
    }

    public void mostrarCarro(){

        boolean primero = true;
        for (int i = 0; i <textils.size() ; i++) {
            Carro tx = new Carro();
            tx.nom = textils.get(i).nom;
            tx.codi_barres = textils.get(i).codi_barres;
            if (!primero) {
                boolean existe = false;
                for (int j = 0; j <carros.size(); j++) {
                    System.out.println(carros.get(i).nom);
                    if (carros.get(i).nom.equals(tx.nom)){
                        carros.get(i).total ++;
                        existe = true;
                    }
                }
                if (!existe){
                    tx.total ++;
                    carros.add(tx);
                }

            }
            else{
                tx.total ++;
                carros.add(tx);
                primero = false;
            }

        }
        for (int i = 0; i <alimentacións.size() ; i++) {
            Carro al = new Carro();
            al.nom = textils.get(i).nom;
            al.codi_barres = textils.get(i).codi_barres;
            carros.add(al);
        }
        for (int i = 0; i <electronics.size() ; i++) {
            Carro el = new Carro();
            el.nom = textils.get(i).nom;
            el.codi_barres = textils.get(i).codi_barres;
            carros.add(el);
        }


        for (int i = 0; i <carros.size() ; i++) {
            System.out.println(carros.get(i).nom);
            System.out.println(carros.get(i).codi_barres);
            System.out.println(carros.get(i).total);
        }
    }

}
