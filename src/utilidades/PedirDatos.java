package utilidades;

import javax.swing.JOptionPane;


public class PedirDatos {
    
    public static int entero(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
    }
    public static String texto(String mensaje){
        return JOptionPane.showInputDialog(null,mensaje);
    }
    public static float decimalF(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(null,mensaje));
    }
}
