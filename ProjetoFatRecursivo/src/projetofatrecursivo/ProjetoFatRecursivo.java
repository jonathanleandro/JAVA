
package projetofatrecursivo;

import java.util.Scanner;

public class ProjetoFatRecursivo {
    
    static void fat(int n){
        int soma = 1;
        
        for(int i = n; i>=1; i--){
             soma = soma*i;
            
            System.out.print(i + " x ");
           
        }
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = entrada.nextInt();
        
        fat(n);
    }
    
}
