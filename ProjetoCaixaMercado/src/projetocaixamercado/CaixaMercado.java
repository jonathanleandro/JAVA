
package projetocaixamercado;

public class CaixaMercado {
    
   public String produto;
   public String pag;
   private float valor;
   private float preco;
   private float troco;
   
   public void status(){
       System.out.println("-------------------------------");
       System.out.println("Produto: " +this.getProduto());
       System.out.println("Preço: " +this.getPreco());
   }
    
   
   public void pagar(String p){
       this.setPag(p);
     
       if("C".equals(p)){
           System.out.println("Forma de pagamento: " +this.getPag());
           System.out.println("Produto pago com sucesso!");
       }else if(valor<preco){
           System.out.println("Forma de pagamento: " +this.getPag());
           System.out.println("Valor pago: " +this.getValor());
           System.out.println("ERRO, Valor insulficiente para pagamento");
       }else{
            troco = valor - preco;
            System.out.println("Forma de pagamento: " +this.getPag());
            System.out.println("Valor pago: " +this.getValor());
            System.out.println("Seu troco é de: " +this.getTroco());
            System.out.println("Produto pago com sucesso!");
       }
   }

    public String getPag() {
        return pag;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }
   
   
 
}
