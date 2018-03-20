package com.example.usuario.ejercicio1;

/**
 * Created by Usuario on 20/03/2018.
 */

class PersonaSingleton {
    private static final PersonaSingleton ourInstance = new PersonaSingleton();
    private String nombre;
    private String apellido;
    private Direccion direccion;

    static PersonaSingleton getInstance() {

        return ourInstance;
    }

    private PersonaSingleton() {
    }

    public PersonaSingleton(String nombre, String apellido, Direccion direccion) {
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

        PersonaSingleton that = (PersonaSingleton) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null)
            return false;
        return direccion != null ? direccion.equals(that.direccion) : that.direccion == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        return result;
    }
}
