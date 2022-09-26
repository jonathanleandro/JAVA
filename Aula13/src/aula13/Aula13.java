
package aula13;

public class Aula13 {

    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        c.reagir("Olá"); //abanar e latir
        c.reagir("Vai apanhar"); //rosnar
        c.reagir(11, 45); //abanar
        c.reagir(21, 00); //ignorar
        c.reagir(true); //abanar
        c.reagir(false); //rosnar e latir
        c.reagir(2, 12.5f); //latir
        c.reagir(17, 4.5f); //rosnar
    }
    
}
