/*
Faca uma thread Java que realize a leitura de um arquivo
texto com frases e exiba as frases a cada 10 segundos.
Vitor Cimetan de Souza
*/ 
public class Main2 {

   public static void main(String[] args) {

      new Thread(new ArquivoThread()).start();
      
   } 
}