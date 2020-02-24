package com.pratikadrian.controler;

/*
Clase para guardar datos de la tabla de sessiones.
 */
public class SessionsColumns {
    public final String titol, data, localitat, comarca;

    public SessionsColumns(String titol, String data, String localitat, String comarca) {
        this.titol = titol;
        this.data = data;
        this.localitat = localitat;
        this.comarca = comarca;
    }

    public String getTitol() {
        return titol;
    }

    public String getData() {
        return data;
    }

    public String getLocalitat() {
        return localitat;
    }

    public String getComarca() {
        return comarca;
    }
}