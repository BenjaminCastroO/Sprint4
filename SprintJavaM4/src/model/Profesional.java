// Principio: Responsabilidad Unica (SRP)
// Cada clase tiene una única responsabilidad definida por la interfaz Asesoria. Esto
// permite que cada clase cambie y evolucione de manera independiente, sin afectar a las
// demás clases.
// Principio: Principio de Inversion de Dependencia (DIP)
// La clase Profesional dependen de la abstracción
// Asesoria (interfaz) en lugar de depender de clases concretas. Esto permite una mayor
// flexibilidad y extensibilidad en el diseño, ya que se pueden agregar más implementaciones
// de Asesoria sin afectar el código existente.
package model;
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
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);  // no permite fechas inválidas
            this.fechaIngreso = fechaIngreso;
                try {
                            String.valueOf(dateFormat.parse(fechaIngreso).toLocaleString());
                } catch (Exception e) {
                    System.out.println("La fecha de ingreso debe estar en el formato " +
                            "DD/MM/AAAA.");}
    }
    // Llama al método de la clase padre (Usuario)
    // Despliega el título y la fecha de ingreso del profesional
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
