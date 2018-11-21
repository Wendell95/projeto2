
package pp;

import javax.swing.JOptionPane;


public class Aguardoatendimentoinstituição<E> {

    private int preferencia;
    private Numero primeiro;
    private Numero segundo;

    public Aguardoatendimentoinstituição(){
        primeiro = segundo = null;
        preferencia = 0;
    }

    public int preferencia() {
        return preferencia;
    }

    public boolean FilaVazia() {
        return preferencia == 0;
    }

    private void procurarPessoa(Numero a) {

        if (a != null) {
            JOptionPane.showMessageDialog(null,"Pessoa:"+a.nf+ "Preferencia:"+a.pref);
           

            procurarPessoa(a.proximo);
        }

    }

    public void segundoChamado() {
        Numero i = segundo;

        procurarPessoa(i);

    }

   
    public void removerpessoa(int pref) {
        Numero i = segundo;
        while (i != null) {
            if (i.pref == pref) {
                JOptionPane.showMessageDialog(null, i.nf + " ja saiu" );
 
                if(i == segundo && i.proximo == null){
                segundo = primeiro = null;
                }else 
                    
                    if (i.proximo == null) {
                    i.ag.proximo = null;
                } else  
                        if(i.ag == null){
                segundo = i.proximo;
                }
                        
                        else{
                    i.ag.proximo = i.proximo;
                    i.proximo.ag = i.ag;
                }
                break;
            }
            i = i.proximo;

        }

        preferencia--;
    }

    public void ChamarProximo() {
        Numero i = segundo;
        while (i != null) {
            JOptionPane.showMessageDialog(null, i.nf);
           
            i = i.proximo;
        }
    }

    public void adicionarPreferencial(E a, int pref) {
        if (FilaVazia()) {
            segundo = primeiro = new Numero(a, segundo, primeiro, pref);
        } else {
            Numero maisum = new Numero(a, null, null, pref);
            primeiro.proximo = maisum;
            maisum.ag = segundo;
            segundo = maisum;
        }
        preferencia++;
    }

   

   
}
