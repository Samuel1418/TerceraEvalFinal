/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornoGraficoYBaseDeDatos;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author cromerofajar
 */
public class SonidoFondo extends Thread {

    Clip sonido;
    boolean estado = true;

    public void run() {
        while (estado) {
            try {
                sonido = AudioSystem.getClip();
                File a = new File("/home/local/DANIELCASTELAO/cromerofajar/NetBeansProjects/proyectoTrime3/123.wav");//pc clase
                sonido.open(AudioSystem.getAudioInputStream(a));
                sonido.start();
                Thread.sleep(25500); // (30segundos)
                sonido.close();
            } catch (Exception tipoError) {
                System.out.println("" + tipoError);
            }
        }
}
}

