/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones;

import javax.swing.JOptionPane;

public class Excepcion extends Exception {

    public void Excepcion(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
