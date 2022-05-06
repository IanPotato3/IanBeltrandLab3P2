
package ianbeltrand_lab3p2;

public class Casa extends BienesInmuebles{
    
    //Variables
    private int NumeroCasa = 0;
    private String ReferenciaResi = "";

    //Constructor
    
    public Casa() {    
        
    }

    public Casa(String Direccion, float Dimension, String ID, int NumeroCasa, String ReferenciaCasa) {
        super(Direccion, Dimension, ID);
        this.NumeroCasa = NumeroCasa;
        this.ReferenciaResi = ReferenciaCasa;
    }

    //Funciones
    public int getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(int NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }

    public String getReferenciaResi() {
        return ReferenciaResi;
    }

    public void setReferenciaResi(String ReferenciaResi) {
        this.ReferenciaResi = ReferenciaResi;
    }
}
