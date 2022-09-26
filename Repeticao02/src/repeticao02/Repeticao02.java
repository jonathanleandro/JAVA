
package repeticao02;

import java.util.Scanner;

public class Repeticao02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        int n;
        
        System.out.print("Digite o número de cambalhotas: ");
        n = entrada.nextInt();
        
        for(int i =1; i<=n; i++){
            System.out.println("Cambalhota " +i);
        }
    }
    
}
