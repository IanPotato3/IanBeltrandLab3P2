
package ianbeltrand_lab3p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Edificio extends BienesInmuebles{
     
    //Variables
    private int CantidadLocales = 0;
    private String Nombre = "";
    private String ReferenciaResi = "";
    ArrayList<Apartamento> Apartamentos = new ArrayList();

    //Constructor
    public Edificio() {  
        
    }

    public Edificio(String Direccion, float Dimension, String ID, String Nombre, String ReferenciaResi) {
        super(Direccion, Dimension, ID);
        this.Nombre = Nombre;
        this.ReferenciaResi = ReferenciaResi;
    }

    //Funciones
    public int getCantidadLocales() {
        return CantidadLocales;
    }

    public void setCantidadLocales(int CantidadLocales) {
        this.CantidadLocales = CantidadLocales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return Apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> Apartamentos) {
        this.Apartamentos = Apartamentos;
    }

    public String getReferenciaResi() {
        return ReferenciaResi;
    }

    public void setReferenciaResi(String ReferenciaResi) {
        this.ReferenciaResi = ReferenciaResi;
    }
    
    //Apartamentos
    public Apartamento BuscarApartamento(String ID){
        for(Apartamento apartamento:Apartamentos){
            if(ID.equals(apartamento.getID())){
                return apartamento;
            }
        }
        return null;
    }
    
    public void AgregarApartamento(){
        String ID = JOptionPane.showInputDialog("ID: ");
        int NumeroLocal = Integer.parseInt(JOptionPane.showInputDialog("Numero Local: "));
        String ReferenciaEdi = JOptionPane.showInputDialog("Edificio: ");
        String Direccion = JOptionPane.showInputDialog("Direccion: ");
        float Dimension = Float.parseFloat(JOptionPane.showInputDialog("Metros Cuadrados:"));
        
        if(BuscarApartamento(ID) == null){
            Apartamento apartamento = new Apartamento(Direccion, Dimension, ID, NumeroLocal, ReferenciaEdi);
            
            JOptionPane.showMessageDialog(null, "~~~APARTAMENTO AGREGADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~APARTAMENTO YA EXISTENTE~~~");
        }
    }
    
    public void EliminarApartamento(){
        String ID = JOptionPane.showInputDialog("ID del apartamento a eliminar: ");
        
        if(BuscarApartamento(ID) != null){
            Apartamento apartamento = BuscarApartamento(ID);
            
            Apartamentos.remove(apartamento);
            
            JOptionPane.showMessageDialog(null, "~~~APARTAMENTO ELIMINADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~APARTAMENTO NO EXISTENTE~~~");
        }
    }
    
    public void ImprimirApartamento(){
        String ID = JOptionPane.showInputDialog("ID del apartamento a imprimir: ");
        
        Apartamento apartamento = BuscarApartamento(ID);
        
        String Salida = "*****APARTAMENTO*****" + 
                "\nID: " + apartamento.getID() + 
                "\nNumero Local: " + apartamento.getNumeroLocal() + 
                "\nEdificio: " + apartamento.getReferenciaEdi() + 
                "\nDireccion: " + apartamento.getDireccion() + 
                "\nDimension: " + apartamento.getDimensiones() + " metros cuadrados";
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
    public void ImprimirApartamentos(){
        String Salida = "*****APARTAMENTOS*****";
        
        for(Apartamento apartamento:Apartamentos){
            Salida = Salida + "\n\n*****APARTAMENTO*****" + 
                "\nID: " + apartamento.getID() + 
                "\nNumero Local: " + apartamento.getNumeroLocal() + 
                "\nEdificio: " + apartamento.getReferenciaEdi() + 
                "\nDireccion: " + apartamento.getDireccion() + 
                "\nDimension: " + apartamento.getDimensiones() + " metros cuadrados";
        }
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
}
