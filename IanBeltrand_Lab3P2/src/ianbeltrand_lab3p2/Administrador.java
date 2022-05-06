
package ianbeltrand_lab3p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administrador {
    
    //Variables
    ArrayList<Cliente> Clientes = new ArrayList();
    
    //Constructor
    public Administrador(){
        
    }
    
    //Funciones
    public void AgregarCliente(){
        String Nombre = JOptionPane.showInputDialog("Nombre Completo: ");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        String ID = JOptionPane.showInputDialog("ID: ");
        String Usuario = JOptionPane.showInputDialog("Usuario: ");
        String Password = JOptionPane.showInputDialog("Password: ");
        
        if(BuscarCliente(Usuario, Password) == null){
            Cliente cliente = new Cliente(Nombre, Edad, ID, Usuario, Password);
        
            Clientes.add(cliente);
        
            JOptionPane.showMessageDialog(null, "~~~CLIENTE AGREGADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~CLIENTE YA EXISTENTE~~~");
        }
        
    }
    
    public Cliente BuscarCliente(String Usuario, String Password){
        for(Cliente cliente:Clientes){
            if(Usuario.equals(cliente.getUsuario()) && Password.equals(cliente.getPassword())){
                return cliente;
            }
        }
        return null;
    }
    
    public void EliminarCliente(){
        String Usuario = JOptionPane.showInputDialog("Usuario: ");
        String Password = JOptionPane.showInputDialog("Password: ");
        
        if(BuscarCliente(Usuario, Password) != null){
            Clientes.remove(BuscarCliente(Usuario, Password));
            
            JOptionPane.showMessageDialog(null, "~~~CLIENTE ELIMINADO EXITOSAMENTE~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~ERROR: CREDENCIALES NO CONCUERDAN~~~");
        }
    }
    
    public void ImprimirCliente(String Usuario, String Password){
        Cliente cliente = BuscarCliente(Usuario, Password);
        
        String Salida = "***** DATOS CLIENTE *****" +
                "\nNombre: " + cliente.getNombre() + 
                "\nEdad: " + cliente.getEdad() +
                "\nID: " + cliente.getID() +
                "\nUsuario: " + cliente.getUsuario() + 
                "\nPassword: " + cliente.getPassword();
        
        JOptionPane.showMessageDialog(null, Salida);
        
    }
    
    public void ImprimirClientes(){
        String Salida = "*****CLIENTES*****";
        
        for(Cliente cliente:Clientes){
            Salida = Salida + "\n\n***** DATOS CLIENTE *****" +
                "\nNombre: " + cliente.getNombre() + 
                "\nEdad: " + cliente.getEdad() +
                "\nID: " + cliente.getID() +
                "\nUsuario: " + cliente.getUsuario() + 
                "\nPassword: " + cliente.getPassword();
        }
        
        JOptionPane.showMessageDialog(null, Salida);
    }
    
    public void Comprar(){
        String Usuario = JOptionPane.showInputDialog("Usuario: ");
        String Password = JOptionPane.showInputDialog("Password: ");
        
        if(BuscarCliente(Usuario, Password) != null){
            JOptionPane.showMessageDialog(null, "~~~COMPRA EXITOSA~~~");
        }else{
            JOptionPane.showMessageDialog(null, "~~~LAS CREDENCIALES NO CONCUERDAN~~~");
        }
    }
}
