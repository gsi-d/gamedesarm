package gamedesarm;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SomExemplo {
    public static void main(String[] args) {
        try {
            // Carrega o arquivo de som
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(SomExemplo.class.getResource("explosion-sound-effect-1-241821.mp3"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            // Toca o som
            clip.start();

            // Mantém o programa em execução para que o som possa ser ouvido
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
