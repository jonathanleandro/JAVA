
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        
        System.out.print("Digite a nota: ");
        
         nota = entrada.nextFloat();
     
        
        System.out.printf("A nota é: %.2f \n", nota);
    }
    
}
