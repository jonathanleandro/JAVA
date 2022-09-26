
package calcfatorial;

import java.util.Scanner;


public class CalcFatorial {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      
      int i = 2; 
      int fat = 1;
      int valor;
      
        System.out.print("Digite o número: ");
        valor = entrada.nextInt();
        
        while(i<=valor){
                fat *= i;
                   i++;
            }
       
            System.out.println( "O fatorial de " + valor + " é igual a " + fat );
}
    }
    

