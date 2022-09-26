
package contador01;

import java.util.Scanner;


public class Contador01 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int cc = 1;
        int i;
        
        System.out.print("Quantidade de Cambalhotas: ");
        i = entrada.nextInt();
       
        while(cc<i){
            System.out.println("Cambalhota");
            cc++;
        }
 
    }
    
}
