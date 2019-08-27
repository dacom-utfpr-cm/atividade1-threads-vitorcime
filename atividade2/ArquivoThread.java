import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * ArquivoThread
 */
public class ArquivoThread implements Runnable{

    FileReader arq;

    ArquivoThread(){
    try {
        
        this.arq = new FileReader("poema.txt");

    } catch (FileNotFoundException exception) {
        System.out.println("Arquivo nao encontrado");
    }
}
    @Override
    public void run() {
        try{
        BufferedReader lerArq = new BufferedReader(arq);

        String linha = lerArq.readLine();

        while (linha != null) {
            System.out.printf("%s\n", linha);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrompida");
            }
            linha = lerArq.readLine(); // lê da segunda até a última linha
          }
        
        }
        catch(IOException e){
            System.out.println("Algo de errado ocorreu");
        }
        }
    
}