/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Validacion {
    
    String nombre;
    String apellido;
    String id;   
    String fecha;
    Persona p=new Persona();
    
    //Code for validate name of the person
    public void ValidateNamePerson(String titulo) {
        try{
        nombre = titulo;        

        while (nombre.matches("") || !nombre.matches("[A-Za-z ]*$")) {

            System.out.println(titulo);

            nombre = JOptionPane.showInputDialog(null, "Digite un nombre valido"
                    + "", "HOSPITAL GENERAL", JOptionPane.ERROR_MESSAGE);              
        }
        }catch(HeadlessException e){
        }
    }
    
    //Code for validate lastname of the person
    public void ValidateLastNamePerson(String titulo2){
        try{
        apellido=titulo2;
        
        while (apellido.matches("") || !apellido.matches("[A-Za-z ]*$")) {

            System.out.println(titulo2);

            apellido = JOptionPane.showInputDialog(null, "Digite un apellido "
                    + "valido"
                    + "", "HOSPITAL GENERAL", JOptionPane.ERROR_MESSAGE);            
        }
        }catch(HeadlessException e){                   
        }
    }
    
    //Catch name of the validation
    public String getValidateNamePerson() {
        return nombre;
    }
    
    //Catch lastname of the validation
    public String getValidateLastNamePerson() {
        return apellido;
    }

    //Code for validate ID of the person
    public int getValidateIdPerson(String ide) {
        try{
        id = ide;

        while (id.matches("")||!id.matches("[0-9]{5}")) {

            System.out.println(ide);

            id = JOptionPane.showInputDialog(null, "Digite un id"
                    + " valido", "HOSPITAL GENERAL"
                    + "", JOptionPane.WARNING_MESSAGE);           
        }        
        }catch(HeadlessException | NumberFormatException e){
        }
        return Integer.parseInt(id);
    }
    
    //Catch ID of the validation
    public int getIdentification(){       
        return  Integer.parseInt(id);  
    }
    
    //Code for validate the date of a person
    public boolean validateDate(String fch){
        
        try{
            
        fecha=fch;
        
            while(fecha.contains("[A-Za-z ]*$")) {
                JOptionPane.showMessageDialog(null,"Fecha incorrecta",""
                    + "HOSPITAL GENERAL",JOptionPane.WARNING_MESSAGE);
            fecha="";
            fecha=JOptionPane.showInputDialog(null,"Digite una fecha valida",
                    "HOSPITAL GENERAL",JOptionPane.DEFAULT_OPTION);
            }
        
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);                                                
        } catch (ParseException e) {
            return false;            
        }
        }catch(Exception e){
        }
        return true;
    }
     
    //Code for catch the date
    public String getDate(){
        
        try{
        boolean res=true;
        res=this.validateDate(fecha);
        
        if (res==true) {
            System.out.println("fecha valida");
        }else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta",""
                    + "HOSPITAL GENERAL",JOptionPane.WARNING_MESSAGE);
            fecha="";
            fecha=JOptionPane.showInputDialog(null,"Digite una fecha valida",
                    "HOSPITAL GENERAL",JOptionPane.DEFAULT_OPTION);            
        }
        }catch(HeadlessException e){
        }
    return String.valueOf(fecha);
    }
        
}
