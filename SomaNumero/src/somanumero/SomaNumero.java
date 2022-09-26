
package somanumero;

import java.util.Scanner;


public class SomaNumero {
    
    public static void imprimeNome(String nome) {
	   if(!nome.isEmpty()){
		    System.out.println("Tudo bem " + nome + "?");
	   } else { 
		    System.out.println("O nome é " + nome + "?");
	   }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
      /*  String res;
        int n;  
        int soma = 0;
        
        do{
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        
        soma = soma + n;
        
        System.out.print("Quer continuar? S/N ");
        res = entrada.next();
        
        }while(res.equals("S"));
       
        System.out.println("A soma deu: " +soma);*/
      
       String nome = "João";
	   imprimeNome("Empty");
           
           
         int v0 = 3;
int v1 = v0++;
int v2 = ++v1;
v1 += v0;
v2 += --v1;

        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        
}

                      
    }
    

