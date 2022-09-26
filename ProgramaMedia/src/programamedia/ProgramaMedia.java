
package programamedia;

import java.util.Scanner;


public class ProgramaMedia {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float n1;
        float n2;
        
        System.out.print("Digite a nota 1: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite a nota 2: ");
        n2 = entrada.nextFloat();
        
        float m = (n1+n2)/2;
        
        System.out.println("Sua média foi: " +m);
        
       if(m>9){
           System.out.println("Parabéns");
       }
    }
    
}
