
package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        
       /* int n[] = new int[4];
        n[0] = 1;
        n[1] = 2;
        n[3] = 3;
        n[4] = 4;
        n[5] = 5;   */
        
      /*  int x[] = {3,2,8,7,5,4};
        
        System.out.println("Numero de posições: " +x.length);
        for(int i=0; i<=x.length-1; i++){
            System.out.print(x[i] + " ");
        }*/
      
      String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", 
          "Set", "Out", "Nov", "Dez"};
      
         int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         
         for(int i =0; i<=mes.length-1; i++){
             System.out.println("O mes de " +mes[i]+ " tem " +tot[i]+ " dias ao todo");
         }
    }
    
}
