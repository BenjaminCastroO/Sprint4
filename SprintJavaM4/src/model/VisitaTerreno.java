package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



//Estamos en break 21:06 -> 21:20




public class VisitaTerreno {
    private int idVisita;
    private int rut;
    private String diaVisita;
    private String horaVisita;
    private String lugarVisita;
    private String comentario;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int idVisita, int rut, String diaVisita, String horaVisita, String lugarVisita, String comentario) {
        setIdVisita(idVisita);
        this.rut = rut;
        setDiaVisita(diaVisita);
        setHoraVisita(horaVisita);
        setLugarVisita(lugarVisita);
        setComentario(comentario);
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        if (idVisita < 0)
            throw new IllegalArgumentException("El id interno del Accidente " +
                    "debe ser mayor a cero.");
        this.idVisita = idVisita;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDiaVisita() {
        return diaVisita;
    }

    public void setDiaVisita(String diaVisita) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);  // no permite fechas inválidas
        try {
            this.diaVisita = String.valueOf((Date) dateFormat.parse(diaVisita));
        } catch (ParseException e) {
            throw new IllegalArgumentException("La fecha de nacimiento debe estar en el formato DD/MM/AAAA.");
        }

    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        DateTimeFormatter tiempo = DateTimeFormatter.ofPattern("HH:mm");
        try {
            this.horaVisita = String.valueOf((LocalTime) tiempo.parse(horaVisita));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("La Hora debe estar ingresada en el " +
                    "formato HH:mm ");
        }
    }

    public String getLugarVisita() {
        return lugarVisita;
    }

    public void setLugarVisita(String lugarVisita) {
        if (!(lugarVisita.length() >= 10 && lugarVisita.length() <= 50))
            throw new IllegalArgumentException("El lugar ingresado debe tener " +
                    "como mínimo 10 caracteres y 50 como máximo. Ingrese de nuevo.");
        this.lugarVisita = lugarVisita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        if (!(comentario.length()  <= 100))
            throw new IllegalArgumentException("Los Comentarios Ingresada debe tener " +
                    "como máximo 100 caracteres. Ingrese de nuevo.");
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "idVisita=" + idVisita +
                ", rut=" + rut +
                ", diaVisita='" + diaVisita + '\'' +
                ", horaVisita='" + horaVisita + '\'' +
                ", lugarVisita='" + lugarVisita + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
