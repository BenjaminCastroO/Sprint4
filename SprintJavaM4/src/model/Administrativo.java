package model;

import java.sql.Date;

public class Administrativo extends Usuario{
  private String area;
  private String experiencia;

  public Administrativo(String nombre, String fechaNacimiento, String area) {
    super(nombre, fechaNacimiento);
    this.area = area;
  }

  public Administrativo(String nombre, String fechaNacimiento, String area, String experiencia) {
    super(nombre, fechaNacimiento);
    this.area = area;
    this.experiencia = experiencia;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    if (!(area.length() >= 5 && area.length() <= 20))
      throw new IllegalArgumentException("El área ingresada debe tener como mínimo 5 " +
              "caracteres y 20 como máximo.");
    this.area = area;
  }

  public String getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(String experiencia) {
    if (!( experiencia.length() <= 100))
      throw new IllegalArgumentException("La información ingresada en experiencia debe " +
              "tener como máximo 100 caracteres. Ingrese de nuevo.");
    this.experiencia = experiencia;
  }

  @Override
  public void analizarUsuario(){
    super.analizarUsuario();
    System.out.println("Área = '" + area + '\'' + ", experiencia = " + experiencia);
  }
  @Override
  public String toString() {
    return "model.Administrativo " +
            "area='" + area + '\'' +
            ", experiencia='" + experiencia + '\'' +
            ' ';
  }
}

