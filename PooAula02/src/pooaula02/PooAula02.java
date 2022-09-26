
package pooaula02;

public class PooAula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "Bic";
        c1.cor  = "azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        //c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        System.out.println(" ");
        
        c2.modelo = "FC";
        c2.cor  = "Vermelho";
        c2.ponta = 1.0f;
        c2.carga = 50;
        //c2.tampada = false;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
