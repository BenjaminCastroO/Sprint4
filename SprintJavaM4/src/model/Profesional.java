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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);  // no permite fechas inválidas
        try {
            this.fechaIngreso = String.valueOf((Date) dateFormat.parse(fechaIngreso));
        } catch (ParseException e) {
            throw new IllegalArgumentException("La fecha de Ingreso debe estar en el formato DD/MM/AAAA.");
        }
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} " + super.toString();
    }
}
