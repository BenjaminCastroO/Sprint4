package model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Capacitacion {
  private int id;
  private int rut;
  private String dia;
  private LocalTime hora;
  private String lugar;
  private int duracion;
  private int cantAsistentes;

  public Capacitacion(int id, int rut, String lugar, int cantAsistentes) {
    setId(id);
    this.rut = rut;
    setLugar(lugar);
    this.cantAsistentes = cantAsistentes;
  }

  public Capacitacion(int id, int rut, String dia, LocalTime hora, String lugar,
                      int duracion, int cantAsistentes) {
    setId(id);
    this.rut = rut;
    setDia(dia);
    setHora(hora);
    setLugar(lugar);
    setDuracion(duracion);
    setCantAsistentes(cantAsistentes);
  }

  public String mostrarDetalle(){
    String mensaje = "La capacitación será en " + lugar + " a las " + hora  +
            " del día " + dia + " y durará " + duracion + " minutos.";
    return mensaje;
  }

  public double getId() {
    return id;
  }

  public void setId(int id) {
    if (id < 0)
      throw new IllegalArgumentException("El id interno de  la capacitación " +
              "debe ser mayor a cero.");
    this.id = id;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    if(!(dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") ||
            dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves") ||
            dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado") ||
            dia.equalsIgnoreCase("domingo")))
      throw new IllegalArgumentException("Ingrese un día de la semana válido,"
              + " (lunes, martes, miercoles, jueves, viernes, sabado, domingo).");
    this.dia = dia;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora.format("HH:mm");
  }

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    if (!(lugar.length() >= 10 && lugar.length() <= 50))
      throw new IllegalArgumentException("El lugar ingresado debe tener " +
              "como mínimo 10 caracteres y 50 como máximo. Ingrese de nuevo.");
    this.lugar = lugar;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    if (!(duracion <= 70))
      throw new IllegalArgumentException("La información ingresada en " +
              "duración debe tener menos de 71 caracteres.");
    this.duracion = duracion;
  }

  public int getCantAsistentes() {
    return cantAsistentes;
  }

  public void setCantAsistentes(int cantAsistentes) {
    if (cantAsistentes < 1000 && cantAsistentes > -1)
    this.cantAsistentes = cantAsistentes;
    else throw new IllegalArgumentException("la cantidad de asistentes debe " +
            "ser un número positivo menor que 1000");
  }


  public int getRut() {
    return rut;
  }

  public void setRut(int rut) {
    this.rut = rut;
  }

  @Override
  public String toString() {
    return "Capacitacion{" +
            "cliente=" + cliente +
            ", id=" + id +
            ", rut=" + rut +
            ", dia='" + dia + '\'' +
            ", hora='" + hora + '\'' +
            ", lugar='" + lugar + '\'' +
            ", duracion=" + duracion +
            ", cantAsistentes=" + cantAsistentes +
            '}';
  }
}
