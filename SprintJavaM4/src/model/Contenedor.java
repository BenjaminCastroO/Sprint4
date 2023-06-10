package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  model.Profesional;
public class Contenedor {

  private List<IAsesoria> listAsesoria = new ArrayList<>();
  private List<Capacitacion> listCapacitaciones = new ArrayList<>();

  public void almacenarCliente(){}
  public void almacenarProfesional(){}
  public void almacenarAdministrativo(){}
  public void almacenarCapacitacion(){}
  public void eliminarUsuario(){}
  public void listarUsuarios(){}
  public void listarUsuariosPorTipo(){}
  public void listarCapacitaciones(){}

  private Profesional agregarProfesional(){

    Profesional profesional = new Profesional();
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingresa el nombre:");
    profesional.setNombre(entrada.nextLine());

    System.out.println("Ingresa Fecha Nacimiento:");
    profesional.setFechaNacimiento(entrada.nextLine());

    System.out.println("Ingresa run:");
    profesional.setRun(entrada.nextInt());

    entrada.nextLine();
    System.out.println("Ingresa Titulo:");
    profesional.setTitulo(entrada.nextLine());

    System.out.println("Ingresa Fecha Ingreso:");
    profesional.setFechaIngreso(entrada.nextLine());

    return profesional;
  }
  private Administrativo agregarAdministrativo(){

    Administrativo administrativo = new Administrativo();
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingresa el nombre:");
    administrativo.setNombre(entrada.nextLine());

    System.out.println("Ingresa Fecha Nacimiento:");
    administrativo.setFechaNacimiento(entrada.nextLine());

    System.out.println("Ingresa run:");
    administrativo.setRun(entrada.nextInt());

    entrada.nextLine();
    System.out.println("Ingresa Area:");
    administrativo.setArea(entrada.nextLine());

    System.out.println("Ingresa Experiencia");
    administrativo.setExperiencia(entrada.nextLine());

    return administrativo;
  }
  private Capacitacion agregarCapacitacion(){

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
}
