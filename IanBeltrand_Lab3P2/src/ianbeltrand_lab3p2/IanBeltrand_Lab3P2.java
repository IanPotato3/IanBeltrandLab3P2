
package ianbeltrand_lab3p2;

import javax.swing.JOptionPane;

public class IanBeltrand_Lab3P2 {

    public static void Menu(){
        Administrador administrador = new Administrador();
        AdministradorBienes administradorbienes = new AdministradorBienes();
        Edificio administradorapa = new Edificio();
        int Opcion = 0;
        
        while(Opcion != 7){
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****" + 
                    "\n1 - Administrar Clientes" + 
                    "\n2 - Administrar Residenciales" + 
                    "\n3 - Administrar Casas" + 
                    "\n4 - Administrar Edificios" + 
                    "\n5 - Administrar Apartamentos" + 
                    "\n6 - Comprar" +
                    "\n7 - Salir"));
            
            switch(Opcion){
                case 1:

                    int Opcion1 = 0;
                    
                    while(Opcion1 != 5){
                        Opcion1 = Integer.parseInt(JOptionPane.showInputDialog("***** ADMINISTRAR CLIENTES *****" + 
                                "\n1 - Agregar Cliente" + 
                                "\n2 - Eliminar Cliente" + 
                                "\n3 - Imprimir Cliente" + 
                                "\n4 - Imprimir Clientes" + 
                                "\n5 - Salir"));
                        
                        switch(Opcion1){
                            case 1:
                                administrador.AgregarCliente();
                                break;
                            case 2:
                                administrador.EliminarCliente();
                                break;
                            case 3:
                                String Usuario = JOptionPane.showInputDialog("Usuario: ");
                                String Password = JOptionPane.showInputDialog("Password: ");
                                administrador.ImprimirCliente(Usuario, Password);
                                break;
                            case 4:
                                administrador.ImprimirClientes();
                                break;
                        }
                    }
                    
                    break;
                case 2:
                    
                    int Opcion2 = 0;
                    
                    while(Opcion2 != 5){
                        Opcion2 = Integer.parseInt(JOptionPane.showInputDialog("*****ADMINISTRADOR RESIDENCIALES*****" + 
                                "\n1 - Agregar Residencial" + 
                                "\n2 - Eliminar Residencial" + 
                                "\n3 - Imprimir Residencial" + 
                                "\n4 - Imprimir Residenciales" + 
                                "\n5 - Salir"));
                        
                        switch(Opcion2){
                            case 1:
                                administradorbienes.AgregarResidencial();
                                break;
                            case 2:
                                administradorbienes.EliminarResidencial();
                                break;
                            case 3:
                                administradorbienes.ImprimirResidencial();
                                break;
                            case 4:
                                administradorbienes.ImprimirResidenciales();
                                break;
                                
                        }
                    }
                    
                    break;
                case 3:
                    
                    int Opcion3 = 0;
                    
                    while(Opcion3 != 5){
                        Opcion3 = Integer.parseInt(JOptionPane.showInputDialog("*****ADMINISTRAR CASAS*****" + 
                                "\n1 - Agregar Casa" + 
                                "\n2 - Eliminar Casa" + 
                                "\n3 - Imprimir Casa" + 
                                "\n4 - Imprimir Casas" + 
                                "\n5 - Salir"));
                        
                        switch(Opcion3){
                            case 1:
                                administradorbienes.AgregarCasa();
                                break;
                            case 2:
                                administradorbienes.EliminarCasa();
                                break;
                            case 3:
                                administradorbienes.ImprimirCasa();
                                break;
                            case 4:
                                administradorbienes.ImprimirCasas();
                                break;
                        }
                    }
                    break;
                case 4:
                    
                    int Opcion4 = 0;
                    
                    while(Opcion4 != 5){
                        Opcion4 = Integer.parseInt(JOptionPane.showInputDialog("***** Administrar Edificios *****" + 
                                "\n1 - Agregar Edificio" + 
                                "\n2 - EliminarEdificio" + 
                                "\n3 - ImprimirEdificio" + 
                                "\n4 - Imprimir Edificios" + 
                                "\n5 - Salir"));
                        
                        switch(Opcion4){
                            case 1:
                                administradorbienes.AgregarEdificio();
                                break;
                            case 2:
                                administradorbienes.EliminarEdificio();
                                break;
                            case 3:
                                administradorbienes.ImprimirEdificio();
                                break;
                            case 4:
                                administradorbienes.ImprimirEdificios();
                                break;
                        }
                    }
                    break;
                case 5:
                    
                    
                    int Opcion5 = 0;
                    
                    while(Opcion5 != 5){
                        Opcion5 = Integer.parseInt(JOptionPane.showInputDialog("*****ADMINISTRAR APARTAMENTOS*****" + 
                                "\n1 - Agregar Apartamento" + 
                                "\n2 - Eliminar Apartamento" + 
                                "\n3 - Imprimir Apartamento" + 
                                "\n4 - Imprimir Apartamentos" + 
                                "\n5 - Salir"));
                        
                        switch(Opcion5){
                            case 1:
                                administradorapa.AgregarApartamento();
                                break;
                            case 2:
                                administradorapa.EliminarApartamento();
                                break;
                            case 3:
                                administradorapa.ImprimirApartamento();
                                break;
                            case 4:
                                administradorapa.ImprimirApartamentos();
                                break;
                        }
                    }
                    break;
                case 6:
                    
                    
                    administrador.Comprar();
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Menu();
    }
    
}
