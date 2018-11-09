package elpuig;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Alimentación {

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


    public Period getFechaActual(){
        LocalDate startDateInclusive = LocalDate.now ();
        LocalDate lastDateInclusive = LocalDate.of(getAño(),getMes(),getDia());

        Period periodo =Period.between(startDateInclusive,lastDateInclusive);
        periodo.getYears();
        periodo.getMonths();
        periodo.getDays();
        return periodo;
    }

}
