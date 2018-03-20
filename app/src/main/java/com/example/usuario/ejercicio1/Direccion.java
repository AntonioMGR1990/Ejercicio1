package com.example.usuario.ejercicio1;

import java.io.Serializable;

/**
 * Created by Usuario on 15/03/2018.
 */

public class Direccion implements Serializable{

    private String direccion;
    private int cp;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public Direccion() {
    }

    public Direccion(String direccion, int cp) {
        this.direccion = direccion;
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direccion direccion1 = (Direccion) o;

        if (cp != direccion1.cp) return false;
        return direccion != null ? direccion.equals(direccion1.direccion) : direccion1.direccion == null;
    }

    @Override
    public int hashCode() {
        int result = direccion != null ? direccion.hashCode() : 0;
        result = 31 * result + cp;
        return result;
    }
}
