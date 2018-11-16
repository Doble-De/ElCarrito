package elpuig;

import elpuig.Widgets.EditText;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gestor {
        Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    private Random random = new Random();
        boolean existe = false;
        EditText editText = new EditText();
        List<Alimentación> alimentacións = new ArrayList<>();
        List<Textil> textils = new ArrayList<>();
        List<Electronica> electronics = new ArrayList<>();
        List<Carro> carros = new ArrayList <>();
        String numCodigo= "4 0902  "+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+ random.nextInt(10)+" "+random.nextInt(10) ;





        public void intoducirtextil(){

            Textil textil = new Textil();
            textil.setnom(editText.texto("Introduce el nombre"));
            textil.setpreu(editText.numdec("Introduce el precio"));
            textil.setComposicion(editText.texto("Introduce la composición"));
            textil.setcodi(editText.numero("Introduce el codigo de barras"));
            textils.add(textil);
        }

        public void intoducirElectronica(){

            Electronica electronica = new Electronica();
            electronica.setnom(editText.texto("Introduce el nombre"));
            electronica.setpreu(editText.numdec("Introduce el precio"));
            electronica.setDiesGarantia(editText.numero("Introduce los dias de garantia"));
            electronica.setpreu(electronica.PrecioFinalE());
            electronica.setcodi(editText.numero("Introduce el codigo de barras"));
            electronics.add(electronica);
        }

        public void insertarAlimentacion(){

            Alimentación alimentación = new Alimentación();
            alimentación.setnom(editText.texto("Introduce el nombre"));
            alimentación.setpreu(editText.numdec("Introduce el precio"));
            alimentación.setAño(editText.numero("Introduce el año de caducidad"));
            alimentación.setMes(editText.numero("Introduce el mes de caducidad"));
            alimentación.setDia(editText.numero("Introduce el dia de caducidad"));
            alimentación.setpreu(alimentación.PrecioFinalA(alimentación.getDiasRestantes()));
            alimentación.setcodi(editText.numero("Introduce el codigo de barras"));
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

            int precio_total=0;
            int precio_unitario=0;
            LocalDate startDateInclusive = LocalDate.now();


            System.out.println(String.format("%-40s", "*****************************************"));
            System.out.print("*");System.out.print(String.format("%-40s", "         Factura simplificada         "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "              Correfour               "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "           Fecha:"+startDateInclusive+"           "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "                                      "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "                                      "));System.out.println("*");

            for (int i = 0; i <carros.size() ; i++) {
                if (carros.get(i).total>1){
                    precio_unitario += (carros.get(i).preu * carros.get(i).total);
                }
                else {
                    precio_unitario += carros.get(i).preu;
                }

                System.out.print("*");System.out.print(String.format("%-40s", " "+carros.get(i).nom+String.format("%-10s",carros.get(i).total) +String.format("%-10s",df.format(carros.get(i).preu))+String.format("%-10s",df.format(precio_unitario))));System.out.println("*");
                precio_total += precio_unitario;
                precio_unitario = 0;
            }
            System.out.print("*");System.out.print(String.format("%-40s", "                                      "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "                       Total:   " +precio_total));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "                                      "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "          ▏ ▏▏ ▏ ▏▏▏ ▏  ▏▏ ▏ ▏▏▏▏ ▏ ▏                "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "          ▏ ▏▏ ▏ ▏▏▏ ▏  ▏▏ ▏ ▏▏▏▏ ▏ ▏                "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "          ▏ ▏▏ ▏ ▏▏▏ ▏  ▏▏ ▏ ▏▏▏▏ ▏ ▏                "));System.out.println("*");
            System.out.print("*");System.out.print(String.format("%-40s", "          "+numCodigo+"            "));System.out.println("*");
            System.out.println(String.format("%-40s", "******************************************"));
            carros.clear();
            alimentacións.clear();
            textils.clear();
            electronics.clear();

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


            System.out.print(String.format("%-40s", "Nombre del Articulo"));
            System.out.println(String.format("%-40s", "| Cantidad "));
            System.out.println("----------------------------------------------------------------------------------------");
            for (int i = 0; i <carros.size() ; i++) {
                System.out.print(String.format("%-40s", carros.get(i).nom));
                System.out.println (String.format("%-40s","| "+carros.get(i).total));
                System.out.println("----------------------------------------------------------------------------------------");
            }
            System.out.println("\n\n\n");
            carros.clear();
        }

    }