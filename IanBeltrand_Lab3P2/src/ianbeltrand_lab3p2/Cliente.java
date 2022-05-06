
package ianbeltrand_lab3p2;

import java.util.ArrayList;

public class Cliente {
    
    //Variables
    private String Nombre = "";
    private int Edad = 0;
    private String ID = "";
    private String Usuario = "";
    private String Password = "";
    
    ArrayList<BienesInmuebles> BienesInmuebles = new ArrayList();
    
    //Constructor
    public Cliente() {
        
    }
    
    public Cliente(String Nombre, int Edad, String ID, String Usuario, String Password){
        this.Edad = Edad;
        this.ID = ID;
        this.Nombre = Nombre;
        this.Password = Password;
        this.Usuario = Usuario;
    }
    
    //Funciones

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<BienesInmuebles> getBienesInmuebles() {
        return BienesInmuebles;
    }

    public void setBienesInmuebles(ArrayList<BienesInmuebles> BienesInmuebles) {
        this.BienesInmuebles = BienesInmuebles;
    }
    
}
