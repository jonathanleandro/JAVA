
package projetocaixamercado;

public class ProjetoCaixaMercado {

    public static void main(String[] args) {
        
        CaixaMercado p1 = new CaixaMercado();
        
        p1.setProduto("Bolacha");
        p1.setPreco(1.50f);
        p1.setValor(0.50f);
        p1.status();
        p1.pagar("D");
    }
    
}
