
package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
     
       Video v[] = new Video[3];
        
       v[0] = new Video("Aula 1 de POO");
       v[1] = new Video("Aula 12 de PHP");
       v[2] = new Video("Aula 10 de HTML5");
  
       Gafanhoto g[] = new Gafanhoto[2]; 
        
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creusa", 12, "F", "creuzita");
        
        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Vizualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
       /* System.out.println("VIDEOS\n-----------------------------------------");
        System.out.println(v[0].toString()); 
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS-------------------------------------");
        System.out.println(g[0].toString()); 
        System.out.println(g[1].toString()); */
    }
    
}