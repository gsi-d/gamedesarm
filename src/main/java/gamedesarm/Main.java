package gamedesarm;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroFio = 0;
        Scanner s = new Scanner(System.in);
        try {
            int tentativas = 0;
            while (tentativas < 2) {
                System.out.println("Escolha o fio (1, 2, 3, 4, 5 ou 6): ");
                numeroFio = s.nextInt();
                geraNumero(numeroFio);

                tentativas++;
            }
            System.out.println("Parabéns, você desarmou a bomba!");
        } catch (BombaException be) {
            be.printStackTrace();
            System.out.println("A bomba explodiu.\nO jogo terminou.");
            new SomExemplo();
        }
    }

    public static void geraNumero(int numeroFio) throws BombaException {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(999);
        System.out.println("Número aleatório: " + numeroAleatorio);

        if (numeroAleatorio % 2 == 0) {
            throw new BombaException();
        }
    }
}