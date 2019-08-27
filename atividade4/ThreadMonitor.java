/**
 * ThreadMonitor
 */
public class ThreadMonitor implements Runnable {
    Thread myThreads[] = new Thread[3];

    public ThreadMonitor(Thread myThreads[]) {
        this.myThreads = myThreads;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3 ; i++) {
                if(myThreads[i].isInterrupted()){
                    System.out.println("Thread " + myThreads[i].getName() + " interrompida");
                }
                
                if(i == 2){
                    i = 0;
                }
            }
        } catch (Exception e) {
            
        }
    }

}