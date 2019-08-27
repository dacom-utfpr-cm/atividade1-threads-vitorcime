
public class Main1 {

    public static void main(String[] args){
        new Thread(new RandomTime()).start();
        new Thread(new RandomTime()).start();
        new Thread(new RandomTime()).start();
    }
    
}