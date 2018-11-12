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

    public void generartiquet(){

        boolean primero = true;
        for (int i = 0; i <textils.size() ; i++) {
            Carro tx = new Carro();
            tx.nom = textils.get(i).nom;
            tx.preu = textils.get(i).preu;
            tx.codi_barres = textils.get(i).codi_barres;
            if (!primero) {
                boolean existe = false;
                for (int j = 0; j <carros.size(); j++) {
                    if (carros.get(j).preu == tx.preu && carros.get(j).codi_barres == tx.codi_barres){
                        carros.get(j).total ++;
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

        primero = true;
        for (int i = 0; i <alimentacións.size() ; i++) {
            Carro al = new Carro();
            al.nom = alimentacións.get(i).nom;
            al.preu = alimentacións.get(i).preu;
            al.codi_barres = alimentacións.get(i).codi_barres;
            if (!primero) {
                boolean existe = false;
                for (int j = 0; j <carros.size(); j++) {
                    if (carros.get(j).preu == al.preu && carros.get(j).codi_barres == al.codi_barres){
                        carros.get(j).total ++;
                        existe = true;
                    }
                }
                if (!existe){
                    al.total ++;
                    carros.add(al);
                }

            }
            else{
                al.total ++;
                carros.add(al);
                primero = false;
            }

        }


        primero = true;
        for (int i = 0; i <electronics.size() ; i++) {
            Carro el = new Carro();
            el.nom = electronics.get(i).nom;
            el.preu = electronics.get(i).preu;
            el.codi_barres = electronics.get(i).codi_barres;
            if (!primero) {
                boolean existe = false;
                for (int j = 0; j <carros.size(); j++) {
                    if (carros.get(j).preu == el.preu && carros.get(j).codi_barres == el.codi_barres){
                        carros.get(j).total ++;
                        existe = true;
                    }
                }
                if (!existe){
                    el.total ++;
                    carros.add(el);
                }

            }
            else{
                el.total ++;
                carros.add(el);
                primero = false;
            }

        }


        for (int i = 0; i <carros.size() ; i++) {
            System.out.println(carros.get(i).nom);
            System.out.println(carros.get(i).codi_barres);
            System.out.println(carros.get(i).preu);
            System.out.println(carros.get(i).total);
        }
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
                    if (carros.get(j).nom.equals(tx.nom) && carros.get(j).codi_barres == tx.codi_barres){
                        carros.get(j).total ++;
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

        primero = true;
        for (int i = 0; i <alimentacións.size() ; i++) {
            Carro al = new Carro();
            al.nom = alimentacións.get(i).nom;
            al.codi_barres = alimentacións.get(i).codi_barres;
            if (!primero) {
                boolean existe = false;
                for (int j = 0; j <carros.size(); j++) {
                    if (carros.get(j).nom.equals(al.nom) && carros.get(j).codi_barres == al.codi_barres){
                        carros.get(j).total ++;
                        existe = true;
                    }
                }
                if (!existe){
                    al.total ++;
                    carros.add(al);
                }

            }
            else{
                al.total ++;
                carros.add(al);
                primero = false;
            }

        }


        primero = true;
        for (int i = 0; i <electronics.size() ; i++) {
            Carro el = new Carro();
            el.nom = electronics.get(i).nom;
            el.codi_barres = electronics.get(i).codi_barres;
            if (!primero) {
                boolean existe = false;
                for (int j = 0; j <carros.size(); j++) {
                    if (carros.get(j).nom.equals(el.nom) && carros.get(j).codi_barres == el.codi_barres){
                        carros.get(j).total ++;
                        existe = true;
                    }
                }
                if (!existe){
                    el.total ++;
                    carros.add(el);
                }

            }
            else{
                el.total ++;
                carros.add(el);
                primero = false;
            }

        }


        for (int i = 0; i <carros.size() ; i++) {
            System.out.println(carros.get(i).nom);
            System.out.println(carros.get(i).codi_barres);
            System.out.println(carros.get(i).total);
        }
    }

}
