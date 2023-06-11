package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;

public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    public Profesional(String nombre, String fechaNacimiento, String titulo) {
        super(nombre, fechaNacimiento);
        this.titulo = titulo;
    }

    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        setTitulo(titulo);
        setFechaIngreso(fechaIngreso);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() >=10 && titulo.length()<=50){
            this.titulo = titulo;
        }else {
            throw new IllegalArgumentException("El Titulo debe tener entre 10 y 50 caracteres");
        }
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Titulo = '" + titulo + '\'' + ", Fecha de Ingreso = " + fechaIngreso);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} " + super.toString();
    }
}
