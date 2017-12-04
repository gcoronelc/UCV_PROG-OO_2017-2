package util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class Mensaje {
  
  private final static String APP = "EDUTEC";

  /**
   * Constructor privado para que no se puedan crear instancias.
   */
  private Mensaje() {
  }

  public static void showInfo(Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message,
            APP + " - Info", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void showError(Component parent, String message) {
    JOptionPane.showMessageDialog(parent, message,
            APP + " - Error", JOptionPane.ERROR_MESSAGE);
  }

}