/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornoGraficoYBaseDeDatos;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SonidoFondo extends Thread {

    Clip sonido;
    boolean estado = true;

    public void run() {
        while (estado) {
            try {
                sonido = AudioSystem.getClip();
                File a = new File("C:\\Users\\Samuel\\Downloads\\123.wav");
                sonido.open(AudioSystem.getAudioInputStream(a));
                sonido.start();
                Thread.sleep(51000); // (60segundos)
                sonido.close();
            } catch (Exception tipoError) {
                System.out.println("" + tipoError);
            }
        }
        
}
    public void Mute() {
        estado = false;
        sonido.close();
    }
}

