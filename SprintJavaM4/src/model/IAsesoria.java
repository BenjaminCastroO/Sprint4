// Principio: Segregacion de Interface (ISP)
// Se utiliza una interfaz específica para la funcionalidad de análisis de usuarios,
// de modo que las clases solo implementen los métodos que necesitan.
package model;

public interface IAsesoria {
  public void analizarUsuario();// Método común de análisis de usuarios

}
