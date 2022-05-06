
package ianbeltrand_lab3p2;

import java.util.ArrayList;

public class Residencial {
    
    //Variables
    ArrayList<Casa> Casas = new ArrayList();
    ArrayList<Edificio> Edificios = new ArrayList();
    String NombreResidencial = "";
    
    //Constructor

    public Residencial() {
        
    }
    
    public Residencial(String Nombre){
        this.NombreResidencial = Nombre;
    }
    
    //Funciones
    public ArrayList<Casa> getCasas() {
        return Casas;
    }

    public void setCasas(ArrayList<Casa> Casas) {
        this.Casas = Casas;
    }

    public ArrayList<Edificio> getEdificios() {
        return Edificios;
    }

    public void setEdificios(ArrayList<Edificio> Edificios) {
        this.Edificios = Edificios;
    }

    public String getNombreResidencial() {
        return NombreResidencial;
    }

    public void setNombreResidencial(String NombreResidencial) {
        this.NombreResidencial = NombreResidencial;
    }
    
}
