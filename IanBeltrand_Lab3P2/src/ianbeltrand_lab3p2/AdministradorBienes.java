
package ianbeltrand_lab3p2;

import javax.swing.JOptionPane;

public class AdministradorBienes {
    
    //Variables
    BienesInmuebles BienesInmuebles = new BienesInmuebles();
    Residencial Residencial = new Residencial();
    
    //Constructor
    public AdministradorBienes(){
        
    }
    
    //Funciones
    public void AgregarResidencial(){
        
        String NombreResi = JOptionPane.showInputDialog("Nombre de la Residencial: ");
        
        if(BuscarResidencial(NombreResi) == null){
            Residencial residencial = new Residencial(NombreResi);
        
            BienesInmuebles.Residenciales.add(residencial);
            
            JOptionPane.showMessageDialog(null, "~~~RESIDENCIAL AGREGADA~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~RESIDENCIAL YA EXISTENTE~~~");
        }

    }
    
    public Residencial BuscarResidencial(String Nombre){
        for(Residencial residencial:BienesInmuebles.Residenciales){
            if(Nombre.equals(residencial.getNombreResidencial())){
                return residencial;
            }
        }
        
        return null;
    }
    
    public void EliminarResidencial(){
        String Nombre = JOptionPane.showInputDialog("Nombre de la residencial a eliminar: ");
        
        if(BuscarResidencial(Nombre) != null){
            BienesInmuebles.Residenciales.remove(BuscarResidencial(Nombre));
            
            JOptionPane.showMessageDialog(null, "~~~RESIDENCIAL ELIMINADA~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~RESIDENCIAL NO ENCONTRADA~~~");
        }
    }
    
    public void ImprimirResidencial(){
        String Nombre = JOptionPane.showInputDialog("Nombre de la residencial a Imprimir: ");
        
        Residencial residencial = BuscarResidencial(Nombre);
        
        String Salida = "~~~Residencial~~~" + ""
                + "\nNombre: " + residencial.getNombreResidencial();
        
        JOptionPane.showMessageDialog(null, "Salida");
    }
    
    public void ImprimirResidenciales(){
        String Salida = "*****RESIDENCIALES*****";
        
        for(Residencial residencial:BienesInmuebles.Residenciales){
            Salida = Salida + "\n\nNombre: " + residencial.getNombreResidencial();
        }
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
    //Casas
    public Casa BuscarCasa(String ID){
        for(Casa casa:Residencial.Casas){
            if(ID.equals(casa.getID())){
                return casa;
            }
        }
        return null;
    }
    
    public void AgregarCasa(){
        int NumeroCasa = Integer.parseInt(JOptionPane.showInputDialog("Numero de la casa: "));
        String ReferenciaResidencial = JOptionPane.showInputDialog("Residencial: ");
        String Direccion = JOptionPane.showInputDialog("Direccion: ");
        float Dimension = Float.parseFloat(JOptionPane.showInputDialog("Metros Cuadrados: "));
        String ID = JOptionPane.showInputDialog("ID: ");
        
        if(BuscarCasa(ID) == null){
            Casa casa = new Casa(Direccion, Dimension, ID, NumeroCasa, ReferenciaResidencial);
            
            Residencial.Casas.add(casa);
            
            JOptionPane.showMessageDialog(null, "~~~CASA AGREGADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~CASA YA EXISTENTE~~~");
        }
    }
    
    public void EliminarCasa(){
        String ID = JOptionPane.showInputDialog("ID: ");
        
        if(BuscarCasa(ID) != null){
            Casa casa = BuscarCasa(ID);
            
            Residencial.Casas.remove(casa);
            
            JOptionPane.showMessageDialog(null, "~~~CASA ELIMINADA EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~CASA NO EXISTENTE~~~");
        }
    }
    
    public void ImprimirCasa(){
        String ID = JOptionPane.showInputDialog("ID de la casa a Imprimir: ");
        
        Casa casa = BuscarCasa(ID);
        
        String Salida = "***** CASA *****" + 
                "\nID: " + casa.getID() + 
                "\nNumero Casa: " + casa.getNumeroCasa() + 
                "\nResidencial: " + casa.getReferenciaResi() + 
                "\nDireccion: " + casa.getDireccion() + 
                "\nDimension: " + casa.getDimensiones();
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
    public void ImprimirCasas(){
        String Salida = "*****CASAS*****";
        
        for(Casa casa:Residencial.Casas){
            Salida = Salida + "\n\n***** CASA *****" + 
                "\nID: " + casa.getID() + 
                "\nNumero Casa: " + casa.getNumeroCasa() + 
                "\nResidencial: " + casa.getReferenciaResi() + 
                "\nDireccion: " + casa.getDireccion() + 
                "\nDimension: " + casa.getDimensiones();
        }
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
    //Edificios
    public Edificio BuscarEdificio(String ID){
        for(Edificio edificio:Residencial.Edificios){
            if(ID.equals(edificio.getID())){
                return edificio;
            }
        }
        return null;
    }
    
    public void AgregarEdificio(){
        String ID =JOptionPane.showInputDialog("ID: ");
        String Nombre = JOptionPane.showInputDialog("Nombre: ");
        String ReferenciaResi = JOptionPane.showInputDialog("Residencial: ");
        String Direccion = JOptionPane.showInputDialog("Direccion: ");
        float Dimension = Float.parseFloat(JOptionPane.showInputDialog("Metros Cuadrados: "));
        
        if(BuscarEdificio(ID) == null){
            Edificio edificio = new Edificio(Direccion, Dimension, ID, Nombre, ReferenciaResi);
            
            Residencial.Edificios.add(edificio);
            
            JOptionPane.showMessageDialog(null, "~~~EDIFICIO AGREGADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~EDIFICIO YA EXISTENTE~~~");
        }
    }
    
    public void EliminarEdificio(){
        String ID = JOptionPane.showInputDialog("ID del Edificio a Eliminar: ");
        
        if(BuscarEdificio(ID) != null){
            Edificio edificio = BuscarEdificio(ID);
            
            Residencial.Edificios.remove(edificio);
            
            JOptionPane.showMessageDialog(null, "~~~EDIFICIO ELIMINADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~EDIFICIO NO EXISTENTE~~~");
        }
    }
    
    public void ImprimirEdificio(){
        
        String ID = JOptionPane.showInputDialog("ID del Edificio a Imprimir: ");
        
        Edificio edificio = BuscarEdificio(ID);
        
        String Salida = "*****EDIFICIO*****" + 
                "\nNombre: " + edificio.getNombre() + 
                "\nID: " + edificio.getID() + 
                "\nResidencial: " + edificio.getReferenciaResi() + 
                "\nDireccion: " + edificio.getDireccion() + 
                "\nDimension: " + edificio.getDimensiones() + " metros cuadrados";
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
    public void ImprimirEdificios(){
        String Salida = "*****EDIFICIOS*****";
        
        for(Edificio edificio:Residencial.Edificios){
            Salida = Salida + "\n\n*****EDIFICIO*****" + 
                "\nNombre: " + edificio.getNombre() + 
                "\nID: " + edificio.getID() + 
                "\nResidencial: " + edificio.getReferenciaResi() + 
                "\nDireccion: " + edificio.getDireccion() + 
                "\nDimension: " + edificio.getDimensiones() + " metros cuadrados";
        }
        
        JOptionPane.showMessageDialog(null, Salida);
    }
}
