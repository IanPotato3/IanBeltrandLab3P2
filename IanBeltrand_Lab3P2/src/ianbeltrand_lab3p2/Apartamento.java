
package ianbeltrand_lab3p2;

public class Apartamento extends BienesInmuebles{
    
    //Variables
    private int NumeroLocal = 0;
    private String ReferenciaEdi = "";

    //Constructor
    public Apartamento() {   
        
    }

    public Apartamento(String Direccion, float Dimension, String ID, int NumeroLocal, String ReferenciaEdi) {
        super(Direccion, Dimension, ID);
        this.NumeroLocal = NumeroLocal;
        this.ReferenciaEdi = ReferenciaEdi;
    }

    //Funciones
    public int getNumeroLocal() {
        return NumeroLocal;
    }

    public void setNumeroLocal(int NumeroLocal) {
        this.NumeroLocal = NumeroLocal;
    }

    public String getReferenciaEdi() {
        return ReferenciaEdi;
    }

    public void setReferenciaEdi(String ReferenciaEdi) {
        this.ReferenciaEdi = ReferenciaEdi;
    }
}
