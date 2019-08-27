/**
 * . Faca um programa Java que envia interrup¸c˜oes para as
threads dos exerc´ıcios anteriores. As threads devem fazer o
tratamento dessas interrup¸c˜oes e realizar uma finaliza¸c˜ao
limpa.
Vitor Cimetan de Souza
 */
public class Main3 extends Thread{

    public static void main(String[] args) {
        Thread ex1 = new Thread(new ArquivoThread());
        Thread ex2 = new Thread(new RandomTime());

        ex1.start();
        ex2.start();

        try {
            currentThread().sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Algo ruim ocorreu");
        }

        ex1.interrupt();
        ex2.interrupt();

        
    }
}