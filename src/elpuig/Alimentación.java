package elpuig;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Alimentación extends Productos {

    public LocalDate Data;

    private int dia;
    private int mes;
    private int año;


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public double getpreu() {
        return preu;
    }

    public void setpreu(double preu) {
        this.preu = preu;
    }

    public int getcodi() {
        return codi_barres;
    }

    public void setcodi(int codi) {
        this.codi_barres = codi;
    }


    public int getDiasRestantes() {
        LocalDate startDateInclusive = LocalDate.now();
        LocalDate lastDateInclusive = LocalDate.of(getAño(), getMes(), getDia());

        int dias = (int) ChronoUnit.DAYS.between(startDateInclusive, lastDateInclusive);
        return dias;
    }


        public double PrecioFinalA(int periodo){


            double temp=getpreu();
            double preciofinal = temp - temp * ((double)1 / (periodo + 1.0)) + (temp * 0.1);
            return preciofinal;

        }

    }

