
package exerciciovetor;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String res = null;
        
        int v[] = new int[4];
        
        Arrays.fill(v, 0);
        
        while(res != "O"){
            System.out.println("--------------------------------------------");
            System.out.print("Adicionar(A) / Remover(R) / Ordenar(O): ");
        res = entrada.next();
        
        if(res.equals("A")){
            System.out.print("Digite o numero a ser adicionado: ");
            int n = entrada.nextInt();
            
            System.out.print("Digite a posição a desejada: ");
            int i = entrada.nextInt();
            
            v[i] = n;
            
             for(int num: v){
                    System.out.print(num + " ");
                }
            
        }else{
            if(res.equals("R")){
            System.out.print("Digite a posição a ser removida: ");
            int i = entrada.nextInt();
            
            v[i] = 0;
            
             for(int num: v){
                    System.out.print(num + " ");
                }      
            
        }else{
                break;
            }
        }
          
    }
                Arrays.sort(v);
               
                for(int num: v){
                    System.out.print(num + " ");
                }
    
}
}