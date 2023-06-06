package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        if (nombre.length() >=10 && nombre.length()<=50){
            this.titulo = titulo;
        }else {
            throw new IllegalArgumentException("El Titulo debe tener entre 10 y 50 caracteres");
        }
        this.fechaIngreso = fechaIngreso;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);  // no permite fechas inválidas
        try {
            this.fechaIngreso = String.valueOf((Date) dateFormat.parse(fechaIngreso));
        } catch (ParseException e) {
            throw new IllegalArgumentException("La fecha de Ingreso debe estar en el formato DD/MM/AAAA.");
        }

        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} " + super.toString();
    }
}
