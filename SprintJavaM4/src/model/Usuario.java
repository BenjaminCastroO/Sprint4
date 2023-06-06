package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Usuario {
private String nombre;
private  String fechaNacimiento;
private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        if (nombre.length() >=10 && nombre.length()<=50){
            this.nombre = nombre;
        }else {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres");
        }
        this.fechaNacimiento = fechaNacimiento;
        if (run < 99999999){
            this.run = run;
        }else{
            throw new IllegalArgumentException("El RUN debe ser menor a 99.999.999");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);  // no permite fechas inválidas
        try {
            this.fechaNacimiento = String.valueOf((Date) dateFormat.parse(fechaNacimiento));
        } catch (ParseException e) {
            throw new IllegalArgumentException("La fecha de nacimiento debe estar en el formato DD/MM/AAAA.");
        }
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }
}
