package view;

import model.Contenedor;

import java.util.Scanner;

public class Menu {
    public void muestraMenu(){
        System.out.println("===========================");
        System.out.println(" MENÚ PRINCIPAL");
        System.out.println("---------------------------");
        System.out.println("1. Almacenar Cliente");
        System.out.println("2. Almacenar Profesional");
        System.out.println("3. Almacenar Administrativo");
        System.out.println("4. Almacenar Capacitacion");
        System.out.println("5. Eliminar Usuario");
        System.out.println("6. Listar Todos los Usuarios");
        System.out.println("7. Listar Usuarios por Tipo");
        System.out.println("8. Listar Capacitaciones");
        System.out.println("0. Salir");
        System.out.println("---------------------------");
    }

    public int opcionDeMenu(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public void entregaMenu() {
        int op;
        Contenedor contenedor = new Contenedor();

        do {
            muestraMenu();
            System.out.println("Selecciona la opción del menú: ");
            op = opcionDeMenu();
            switch (op){
                case 1: {
                    contenedor.agregarCliente();
                    break;
                }
                case 2: {
                    contenedor.agregarProfesional();
                    break;
                }
                case 3: {
                    contenedor.agregarAdministrativo();
                    break;
                }
                case 4: {
                    contenedor.agregarCapacitacion();
                    break;
                }
                case 5: {
                    //eliminarUsuario();
                    break;
                }
                case 6: {
                    //listarUsuario();
                    break;
                }
                case 7: {
                    //listarUsuarioTipo();
                    break;
                }
                case 8: {
                    //listarCapacitacion();
                    break;
                }

                case 0: {
                    System.out.println("Saliendo del Sistema");
                    break;
                }
                default: {
                    System.out.println("Ingresar Datos Validos");
                }
            }
        } while (op != 0);

    }

}
