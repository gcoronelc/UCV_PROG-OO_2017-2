package app.util;

import java.awt.Component;
import javax.swing.JOptionPane;


public final class Mensaje {
  
  private final static String APP = "EDUTEC";

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