import model.*;

import java.sql.Date;
public class Main {
  public static void main(String[] args) {

    Usuario user1 = new Usuario("Benjamín Castro","07/07/1997",11223344);
    Usuario user2 = new Usuario("Pedro Díaz","10/10/1990",123123);
    Usuario user3 = new Usuario("Gonzalo Mercado","31/03/1985",654321);
    Cliente clie1 = new Cliente(12345,"Eduardo Andrés", "Cavieres Alcayaga",
            56971783,"afp modelo",1,"el alazan 77","Quilpué",25);
    Cliente clie2 = new Cliente(54321,"Margot Javiera", "Alcaino Betancourt",
            56911111,"afp plan vital",2,"el rap es una porquería","Santiago",
            33);
    Cliente clie3 = new Cliente(98990,"Aron Francisco", "Ormeño Vidal",
            56922222,"afp chanta",1,"el mercado 8766","Ancud",77);
    Administrativo admin1 = new Administrativo("Tecnología y comunicaciones",
            "15 años como secretario del equipo de telecomunicaciones");

    Administrativo admin2 = new Administrativo("Departamento de ventas",
            "Basta experiencia como coordinador del departamento");

    Administrativo admin3 = new Administrativo("Capacitacion y formación " +
            "continua", "Lidera el equipo de diseño de capacitaciones");
    Profesional prof1 = new Profesional("Pablo toledo","15/03/2001",445552,
            "Capacitador", "17/12/2016");
    Profesional prof2 = new Profesional("Valentin Dante","23/06/1999",77331,
            "Asistente", "12/02/2010");
    Profesional prof3 = new Profesional("Pablo toledo","07/11/2011",99226,
            "Prevencionista de riesgo", "28/01/2013");

    Capacitacion cap1 = new Capacitacion(1,12,"lunes","12:39","casa jejejej",12,
            33);
    Capacitacion cap2 = new Capacitacion(1,12,"lunes","12:39","casa jejejej",12,
            33);
    Capacitacion cap3 = new Capacitacion(1,12,"lunes","12:39","casa jejejej",12,
            33);

    System.out.println(cap1.mostrarDetalle());
  }
}