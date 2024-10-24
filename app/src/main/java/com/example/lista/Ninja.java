package com.example.lista;

public class Ninja {
    private String nombre;
    private String arma;
    private String caracteristica;
    private int imagen;

    public Ninja(String nombre, String arma, String caracteristica, int imagen) {
        this.nombre = nombre;
        this.arma = arma;
        this.caracteristica = caracteristica;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArma() {
        return arma;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public int getImagen() {
        return imagen;
    }
}
