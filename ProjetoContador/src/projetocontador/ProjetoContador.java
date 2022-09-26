
package projetocontador;

import java.util.Scanner;

public class ProjetoContador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int ini;
        int fim;
        int passo;
        
        System.out.print("Digite o número inicial: ");
        ini = entrada.nextInt();
        
        System.out.print("Digite o número final: ");
        fim = entrada.nextInt();
        
        System.out.print("Digite o número de passos: ");
        passo = entrada.nextInt();
        
        for(int i = ini; i<=fim; i = i + passo){
            System.out.println("Número: " +i);
        }
    }
    
}
