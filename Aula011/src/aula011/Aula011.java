
package aula011;

public class Aula011 {

    public static void main(String[] args) {
       //Pessoa p1 = new Pessoa();
       
       Visitante v1 = new Visitante();
       
       v1.setNome("Juvenal");
       v1.setIdade(22);
       v1.setSexo("M");
       
        System.out.println(v1.toString());
        
       Aluno a1 = new Aluno();
       
       a1.setNome("Cláudio");
       a1.setMatricula(1111);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();
       
       Bolsista n1 = new Bolsista();
       
       n1.setMatricula(2222);
       n1.setNome("Jubileu");
       n1.setBolsa(12.5f);
       n1.setSexo("M");
       n1.pagarMensalidade();
    }
    
}
