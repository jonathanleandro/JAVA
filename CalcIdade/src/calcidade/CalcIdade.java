
package calcidade;

import java.util.Scanner;


public class CalcIdade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano em que nasceu: ");
      int idade = entrada.nextInt();
      
      int idade2 = 2022 - idade;
      
        if(idade2<0 || idade2>110){
            System.out.println("Idade Incompatível, tente novamente");
        }else{
            if(idade2> 0 && idade2 <11){
                System.out.println("Você tem: " +idade2+ " anos. Voce é uma criança");
            }else{
                if(idade2>9 && idade2 <18){
                    System.out.println("Você tem: " +idade2+ " anos. Voce é Jovem");
                }else{
                    if(idade2>17 && idade2 <60){
                        System.out.println("Você tem: " +idade2+ " anos. Voce é um Adulto");
                    }else{
                         System.out.println("Você tem: " +idade2+ " anos. Voce é um Velho");
                    }
                }
            }
        }
        
    }
    
}
