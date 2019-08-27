/**
 * Fa¸ca uma thread Java que fica aguardando uma sequˆencia
num´erica de tamanho arbitr´ario digitado por usu´ario para
realizar uma soma. Use o join().
Vitor Cimetan de Souza
 */
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        int soma = 0;
        System.out.println("Digite a quantidade de numeros a serem somados");
        Scanner ler = new Scanner(System.in);
        int quantidade = ler.nextInt();
        int[] numeros = new int[quantidade];
        Thread somaThread = new Thread(new SomaThread(quantidade, numeros));
        somaThread.start();
        try {
            somaThread.join();
        } catch (Exception e) {
            System.out.println("Erro no join da main");
        }

        for (int i = 0; i < quantidade; i++) {
            soma = soma + numeros[i];
        }
        System.out.println(soma);
        ler.close();
    }
}