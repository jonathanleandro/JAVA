
package programaidade;

import java.util.Scanner;


public class ProgramaIdade {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int nasc;
        
        
        System.out.print("Digite o ano que nasceu: ");
        nasc = entrada.nextInt();
        
        int i = 2022-nasc;
        
        System.out.println("Em que ano você nasceu?: " +i);
        
        if(i>=18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
    }
    
}
