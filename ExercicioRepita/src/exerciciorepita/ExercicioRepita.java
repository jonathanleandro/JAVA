
package exerciciorepita;

import java.util.Scanner;

public class ExercicioRepita {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       String res;
       int n;
       int i = 0;
       int iPar = 0;
       int iImpar = 0;
       int iCem = 0;
       int media = 0;
       
       do{
           System.out.println("Digite um número: ");
           n = entrada.nextInt();
        
           System.out.println("Quer continuar: S/N");
           res = entrada.next();
           
           i++;
           
           if(n%2==0){
               iPar++;
           }else{
               iImpar++;
           }
           
           if(n>=100){
               iCem++;
           }
           
           media = (media + n)/i;
           
       }while(res.equals("S"));
       
        System.out.println("RESULTADO");
        System.out.println("-------------------------");
        System.out.println("Total de valores: " +i);
        System.out.println("Total de Par: " +iPar);
        System.out.println("Total de Impar: " +iImpar);
        System.out.println("Média dos valores: " +media);
    }
    
}
