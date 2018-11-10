package elpuig;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Alimentación extends Productos {

    private LocalDate Data;

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


    public Period getDiasRestantes() {
        LocalDate startDateInclusive = LocalDate.now();
        LocalDate lastDateInclusive = LocalDate.of(getAño(), getMes(), getDia());

        Period periodo = Period.between(startDateInclusive, lastDateInclusive);
        periodo.getYears();
        periodo.getMonths();
        periodo.getDays();
        return periodo;
    }

        public double PrecioFinalA(Period periodo){

            double preciofinal = getpreu() - getpreu() * (1 / (periodo.getDays() + 1)) + (getpreu() * 0.1);

            return preciofinal;

        }

    }

