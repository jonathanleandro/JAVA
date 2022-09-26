
package aula04ex;

public class Garrafa {
    
   private String modelo;
   private String cor;
   private String tamanho;
   private int volume;
   public boolean tampada;

    public Garrafa(String modelo, String cor, String tamanho, int volume) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.volume = volume;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
   
   public void status(){
       System.out.println("Modelo: " +this.getModelo());
       System.out.println("Cor: " +this.getCor());
       System.out.println("Tamanho: " +this.getTamanho());
       System.out.println("Volume: " +this.getVolume());
       System.out.println("Está tampada: " +this.isTampada());
   }
}
