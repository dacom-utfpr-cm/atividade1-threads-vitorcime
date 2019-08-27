/**
 * Fa¸ca uma Thread que monitora um conjunto de threads e
exiba quais threads receberam sinais de interrup¸c˜ao.
Vitor Cimetan de Souza
 */
public class Main4 {

    public static void main(String[] args) {
        Thread myThreads[] = new Thread[3];
        for (int i = 0; i < 3; i++) {
            myThreads[i] = new Thread(new ThreadEx());
            myThreads[i].start();
        }
        new Thread(new ThreadMonitor(myThreads)).start();
        try {
            Thread.currentThread().sleep(5000);    
        } catch (Exception e) {
            System.out.println("Algo deu errado na main");
        }
        myThreads[0].interrupt();
        myThreads[1].interrupt();
        myThreads[2].interrupt();
    }
}