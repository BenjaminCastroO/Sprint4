import model.Usuario;
import java.sql.Date;
public class Main {
  public static void main(String[] args) {

    Usuario user1 = new Usuario("benjamin castro","06/12/1996",19489083);
    user1.analizarUsuario();
    user1.mostrarEdad();
  }
}