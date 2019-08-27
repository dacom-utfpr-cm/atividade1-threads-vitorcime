/*Faca um programa em Java que inicie trˆes threads e, cada
thread, espere um tempo aleat´orio para terminar.
Vitor Cimetan de Souza
*/
public class Main1 {

    public static void main(String[] args){
        new Thread(new RandomTime()).start();
        new Thread(new RandomTime()).start();
        new Thread(new RandomTime()).start();
    }
    
}