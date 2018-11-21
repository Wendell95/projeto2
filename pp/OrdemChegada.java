
package pp;

import pp.Aguardoatendimentoinstituição;


public class OrdemChegada {

    
    public static void main(String[] args) {
        Aguardoatendimentoinstituição<Integer> adicionarfila = new Aguardoatendimentoinstituição<>();
        
        adicionarfila.adicionarPreferencial(0, 3);
        adicionarfila.adicionarPreferencial(0, 3);
        adicionarfila.adicionarPreferencial(0, 2);
        adicionarfila.adicionarPreferencial(0, 1);
       
        
       adicionarfila.removerpessoa(2);
       adicionarfila.removerpessoa(3);
       adicionarfila.removerpessoa(3);
        
    
        adicionarfila.removerpessoa(3);
        
         adicionarfila.segundoChamado();
        
       
    }
    
}
