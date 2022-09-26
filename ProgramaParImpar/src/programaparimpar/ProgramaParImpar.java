
package programaparimpar;

import java.util.Scanner;


public class ProgramaParImpar {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = 1;
        
        while(n!=0){
             System.out.print("Digite um número: ");
        n = entrada.nextInt();
        
        if(n%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        }
       
    }
    
}
