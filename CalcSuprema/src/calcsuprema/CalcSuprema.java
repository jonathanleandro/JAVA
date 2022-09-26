
package calcsuprema;

import java.util.Scanner;

public class CalcSuprema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float n;
        
        System.out.print("Digite um número: ");
        n = entrada.nextFloat();
        
        System.out.format("Resto da divisão por 2: " +n%2);
        System.out.format("Elevado ao cubo: " +Math.pow(n,3));
        System.out.format("Raiz quadrado: " +Math.sqrt(n));
        System.out.format("Raiz ao cubo: " +Math.cbrt(n));
        System.out.format("Valor Absoluto: " +Math.abs(n));
    }
    
}
