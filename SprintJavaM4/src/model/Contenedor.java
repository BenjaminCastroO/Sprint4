package model;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  model.Profesional;
public class Contenedor {

  private List<IAsesoria> listAsesoria = new ArrayList<>();
  private List<Capacitacion> listCapacitaciones = new ArrayList<>();


  public void agregarCliente(){
    listAsesoria.add(Validacion.validarCliente());
  }

  public void agregarProfesional(){
     listAsesoria.add(Validacion.validarProfesional());
  }
  public void agregarAdministrativo(){
    listAsesoria.add(Validacion.validarAdministrativo());
  }
  /*public Capacitacion agregarCapacitacion(){

    Capacitacion capacitacion = new Capacitacion();
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingresa el Id Capacitación:");
    capacitacion.setId(entrada.nextInt());
    entrada.nextLine();

    System.out.println("Ingresa el RUT:");
    capacitacion.setRut(entrada.nextInt());
    entrada.nextLine();

    System.out.println("Ingresa Fecha Capacitacion:");
    capacitacion.setDia(entrada.nextLine());

    System.out.println("Ingresa Hora Capacitacion:");
    capacitacion.setHora(entrada.nextLine());

    System.out.println("Ingresa Lugar Capacitacion:");
    capacitacion.setLugar(entrada.nextLine());

    System.out.println("Ingresa Duración:");
    capacitacion.setDuracion(entrada.nextInt());
    entrada.nextLine();

    System.out.println("Ingresa Cantidad Asistentes:");
    capacitacion.setRut(entrada.nextInt());
    entrada.nextLine();


    return capacitacion;
  }


  public void listarUsuarios() {
    System.out.println("Lista de usuarios:");
    for (IAsesoria asesoria : listAsesoria) {
      if (asesoria instanceof Cliente) {
        Cliente cliente = (Cliente) asesoria;
        System.out.println("Cliente: " + cliente.getNombres() + cliente.getApellidos());
        System.out.println("RUT: " + cliente.getRun());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("AFP: " + cliente.getAfp());
        System.out.println("Sistema de Salud: " + cliente.getSistemaDeSalud());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Comuna: " + cliente.getComuna());
        System.out.println("Edad: " + cliente.getEdad());
      }else if (asesoria instanceof Profesional) {
          Cliente cliente = (Cliente) asesoria;
          System.out.println("Cliente: " + cliente.getNombres() + cliente.getApellidos());
          System.out.println("RUT: " + cliente.getRun());
          System.out.println("Teléfono: " + cliente.getTelefono());
          System.out.println("AFP: " + cliente.getAfp());
          System.out.println("Sistema de Salud: " + cliente.getSistemaDeSalud());
          System.out.println("Dirección: " + cliente.getDireccion());
          System.out.println("Comuna: " + cliente.getComuna());
          System.out.println("Edad: " + cliente.getEdad());
        } else if (asesoria instanceof Administrativo) {
        Cliente cliente = (Cliente) asesoria;
        System.out.println("Cliente: " + cliente.getNombres() + cliente.getApellidos());
        System.out.println("RUT: " + cliente.getRun());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("AFP: " + cliente.getAfp());
        System.out.println("Sistema de Salud: " + cliente.getSistemaDeSalud());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Comuna: " + cliente.getComuna());
        System.out.println("Edad: " + cliente.getEdad());
      }
    }
  }


  public void listarUsuariosPorTipo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el tipo de usuario (cliente, profesional, administrativo):");
    String tipoUsuario = scanner.nextLine();

    for (IAsesoria asesoria : listAsesoria) {
        if (tipoUsuario.equalsIgnoreCase("cliente") && asesoria instanceof Cliente) {
          Cliente cliente = (Cliente) asesoria;
          System.out.println("Rut: " + cliente.getRun());
          System.out.println("Nombres: " + cliente.getNombres());
          System.out.println("Apellidos: " + cliente.getApellidos());
          System.out.println("Teléfono: " + cliente.getTelefono());
          System.out.println("AFP: " + cliente.getAfp());
          System.out.println("Sistema de Salud: " + cliente.getSistemaDeSalud());
          System.out.println("Dirección: " + cliente.getDireccion());
          System.out.println("Comuna: " + cliente.getComuna());
          System.out.println("Edad: " + cliente.getEdad());
        } else if (tipoUsuario.equalsIgnoreCase("profesional") && asesoria instanceof Profesional) {
          Profesional profesional = (Profesional) asesoria;
          System.out.println("Nombre: " + profesional.getNombre());
          System.out.println("Fecha de Nacimiento: " + profesional.getFechaNacimiento());
          System.out.println("Run: " + profesional.getRun());
          System.out.println("Título: " + profesional.getTitulo());
          System.out.println("Fecha de Ingreso: " + profesional.getFechaIngreso());
        } else if (tipoUsuario.equalsIgnoreCase("administrativo") && asesoria instanceof Administrativo) {
          Administrativo administrativo = (Administrativo) asesoria;
          System.out.println("Nombre: " + administrativo.getNombre());
          System.out.println("Fecha de Nacimiento: " + administrativo.getFechaNacimiento());
          System.out.println("Run: " + administrativo.getRun());
          System.out.println("Área: " + administrativo.getArea());
          System.out.println("Experiencia: " + administrativo.getExperiencia());
        }
    }
  }


  public void listarCapacitaciones() {
    System.out.println("Lista de Capacitaciones:");

    for (Capacitacion capacitacion : listCapacitaciones) {
      System.out.println("ID Capacitación: " + capacitacion.getId());
      System.out.println("RUT Cliente: " + capacitacion.getRut());
      System.out.println("Fecha Capacitación: " + capacitacion.getDia());
      System.out.println("Hora Capacitación: " + capacitacion.getHora());
      System.out.println("Lugar Capacitación: " + capacitacion.getLugar());
      System.out.println("Duración: " + capacitacion.getDuracion());
      System.out.println("Cantidad Asistentes: " + capacitacion.getCantAsistentes());

      Cliente cliente = buscarClientePorRut(capacitacion.getRut());
      if (cliente != null) {
        System.out.println("Datos del Cliente:");
        System.out.println("RUT: " + cliente.getRun());
        System.out.println("Nombres: " + cliente.getNombres());
        System.out.println("Apellidos: " + cliente.getApellidos());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("AFP: " + cliente.getAfp());
        System.out.println("Sistema de Salud: " + cliente.getSistemaDeSalud());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Comuna: " + cliente.getComuna());
        System.out.println("Edad: " + cliente.getEdad());
      }
    }
  }

  private Cliente buscarClientePorRut(int rut) {
    for (IAsesoria asesoria : listAsesoria) {
      if (asesoria instanceof Cliente) {
        Cliente cliente = (Cliente) asesoria;
        if (cliente.getRun() == rut) {
          return cliente;
        }
      }
    }
    return null;
  }

  public void eliminarUsuario() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el RUN del usuario que desea eliminar:");
    int run = scanner.nextInt();

    IAsesoria usuarioEliminado = null;

    for (IAsesoria asesoria : listAsesoria) {
      if (asesoria instanceof Cliente && ((Cliente) asesoria).getRun() == run) {
        usuarioEliminado = asesoria;
        break;
      } else if (asesoria instanceof Profesional && ((Profesional) asesoria).getRun() == run) {
        usuarioEliminado = asesoria;
        break;
      } else if (asesoria instanceof Administrativo && ((Administrativo) asesoria).getRun() == run) {
        usuarioEliminado = asesoria;
        break;
      }
    }

    if (usuarioEliminado != null) {
      listAsesoria.remove(usuarioEliminado);
      System.out.println("Usuario eliminado exitosamente.");
    } else {
      System.out.println("No se encontró un usuario con el RUN especificado.");
    }
  }
*/

}
