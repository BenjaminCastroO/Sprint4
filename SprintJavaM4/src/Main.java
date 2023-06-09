import model.Administrativo;
import model.Capacitacion;
import model.Cliente;
import model.Usuario;
import java.sql.Date;
public class Main {
  public static void main(String[] args) {

    Usuario user1 = new Usuario("benjamin castro","07/06/1996",19489083);
    user1.analizarUsuario();
    user1.mostrarEdad();
    Usuario user2 = new Cliente();
    user2.analizarUsuario();
    Usuario user3 = new Administrativo();
    user3.analizarUsuario();
    Capacitacion cap1 = new Capacitacion(1,12,"lunes","12:39","casa jejejej",12,
            33);
    System.out.println(cap1.mostrarDetalle());
  }
}