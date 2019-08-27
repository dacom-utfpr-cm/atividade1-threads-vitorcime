/**
 * SomaThread
 */
import java.util.Scanner;
public class SomaThread implements Runnable{
    int quantidade = 0;
    int[] numeros = new int[quantidade];
    public SomaThread(int quantidade, int[] numeros){
        this.quantidade = quantidade;
        this.numeros = numeros;
    }

    @Override
    public void run() {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um numero");
            numeros[i] = ler.nextInt();
        }   
        ler.close();     
    }
}