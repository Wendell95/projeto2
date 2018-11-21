
package pp;


public class Numero {
    Object nf;
    Numero ag;
    Numero proximo;
    int pref;

    public Numero(Object nf,Numero ag, Numero proximo, int pref) {
     
        this.ag = ag;
        this.proximo = proximo;
        this.pref = pref;
    }
    
    
}
