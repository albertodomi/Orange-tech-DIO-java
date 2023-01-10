
import java.util.Scanner; 
public class DesafioDownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
           if(tamanho == 1){
           System.out.println("/");
          } else if(tamanho == 2){
           System.out.println("//");
          } else if(tamanho == 3){
           System.out.println("///");
          } else if(tamanho == 4){
           System.out.println("////");
          } else if(tamanho == 5){
           System.out.println("/////");
          } else if(tamanho == 6){
           System.out.println("//////");
          } else if(tamanho == 7){
           System.out.println("///////");
          } else if(tamanho == 8){
           System.out.println("////////");
          } else if(tamanho == 9){
           System.out.println("/////////");
          } else if(tamanho == 10){
           System.out.println("//////////");
          }
    }  
}
