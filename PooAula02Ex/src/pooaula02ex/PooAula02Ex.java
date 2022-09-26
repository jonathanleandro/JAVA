
package pooaula02ex;

public class PooAula02Ex {

  
    public static void main(String[] args) {
       
        Garrafa g1 = new Garrafa();
        
        g1.modelo = "Noc";
        g1.cor = "Preto";
        g1.tamanho = "M";
        g1.volume = 550;
        
        g1.aberta();
        g1.status();
        g1.bocal();
    }
    
}
