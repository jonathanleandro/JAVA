
package jogodogenio;

import java.util.Scanner;


public class JogoDoGenio {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
       char l = 'y';
       
        while(l!='n'){
            
        int n = (int) (1 + Math.random() * (4-0));      
       
        System.out.println("Vou pensar em um valor entre 1 e 5. Tente adivinhar");
        System.out.print("Digite o valor: ");
        int valor = entrada.nextInt(); 
        
        if(valor!=n){
            System.out.println("Você errou, eu estava pensando no valor: " +n);
        }else{
            System.out.println("Você acertou");
        }
         System.out.println("Tente novamente? y/n");
        l = entrada.next().charAt(0);
        }
        
        System.out.println("Fim de Jogo");        
    }
    }

