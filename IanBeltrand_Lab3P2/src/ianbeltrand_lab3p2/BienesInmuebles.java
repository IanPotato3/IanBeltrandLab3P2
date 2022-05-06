
package ianbeltrand_lab3p2;

import java.util.ArrayList;

public class BienesInmuebles {
    
    //Variables
    String Direccion = "";
    float Dimensiones = 0;
    String ID = "";
    ArrayList<Residencial> Residenciales = new ArrayList();
    
    //Constructores
    public BienesInmuebles(){
        
    }
    
    public BienesInmuebles(String Direccion, float Dimension, String ID) {
        this.Dimensiones = Dimension;
        this.Direccion = Direccion;
        this.ID = ID;
    }
    
    //Funciones
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public float getDimensiones() {
        return Dimensiones;
    }

    public void setDimensiones(float Dimensiones) {
        this.Dimensiones = Dimensiones;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
