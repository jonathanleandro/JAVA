
package telavoto;

import java.util.Scanner;


public class TelaVoto {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nasc;
        
        
        System.out.print("Qual o ano que você nasceu?: ");
        nasc = entrada.nextInt();
        
        int i = 2022-nasc;
        
        System.out.println("Sua idade é: " +i);
        
        if(i<=16){
            System.out.println("Não Vota");
        }else{
            if(i>=16 && i<=18 || (i>70)){
            System.out.println("Opcional");
        }else{
            System.out.println("Obrigatório");
        }
        }
    }
    
}
