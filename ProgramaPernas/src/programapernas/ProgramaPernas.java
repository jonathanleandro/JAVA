
package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int pernas;
        String tipo;
        
        do{
        
            System.out.print("Quantas pernas tem?: ");
        pernas = entrada.nextInt();
        
        tipo = switch (pernas) {
            case 1 -> "saci";
            case 2 -> "Bípede";
            case 4 -> "Quadrúpede";
            case 6, 8 -> "Aranha";
            default -> "Et";
        };
        
        System.out.println(tipo);
        }while(pernas<=8);
        
    }
    
}
