// Principio: Responsabilidad Unica (SRP)
// Cada clase tiene una única responsabilidad definida por la interfaz Asesoria. Esto
// permite que cada clase cambie y evolucione de manera independiente, sin afectar a las
// demás clases.
// Principio: Principio de Inversion de Dependencia (DIP)
// La clase Administrativo dependen de la abstracción
// Asesoria (interfaz) en lugar de depender de clases concretas. Esto permite una mayor
// flexibilidad y extensibilidad en el diseño, ya que se pueden agregar más implementaciones
// de Asesoria sin afectar el código existente.
package model;
import java.lang.String;



public class Administrativo extends Usuario{
  private String area;
  private String experiencia;

  public Administrativo(String nombre, String fechaNacimiento, String area) {
    super(nombre, fechaNacimiento);
    this.area = area;
  }

  public Administrativo(String nombre, String fechaNacimiento,int run, String area, String experiencia) {
    super(nombre, fechaNacimiento, run);
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
  // Llama al método de la clase padre (Usuario)
  // Despliega el área y la experiencia previa del administrativo
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

