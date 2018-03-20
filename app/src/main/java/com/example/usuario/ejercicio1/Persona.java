package com.example.usuario.ejercicio1;

import java.io.Serializable;

/**
 * Created by Usuario on 15/03/2018.
 */

public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        if (apellido != null ? !apellido.equals(persona.apellido) : persona.apellido != null)
            return false;
        return direccion != null ? direccion.equals(persona.direccion) : persona.direccion == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        return result;
    }
}
