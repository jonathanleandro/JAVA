
package pooaula02ex;

public class Garrafa {
    
    String modelo;
    String cor;
    String tamanho;
    int volume;
    boolean tampa;
    
    
    void status(){
        System.out.println("Modelo: " +modelo);
        System.out.println("Cor: " +cor);
        System.out.println("Tamanho: " +tamanho);
        System.out.println("Volume: " +volume);
}
    
    void bocal(){
        if(this.tampa == true){
            System.out.println("ERRO, Garrafa fechada");
        }else{
            System.out.println("Garrafa aberta, bebendo agua");
        }
    }
    
    void aberta(){
        this.tampa = false;
    }
    
    void fechada(){
        this.tampa = true;
    }
    
    
}

