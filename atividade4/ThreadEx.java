/**
 * ThreadEx
 */
public class ThreadEx implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Comecei");
            Thread.sleep((long)(Math.random() * 10000));
            System.out.println("Terminei");
        } catch (InterruptedException ex) {
            System.out.println("Something hapenned");
        }
    }
    
}