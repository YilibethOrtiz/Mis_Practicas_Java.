
package com.mycompany.examen01;
import javax.swing.JOptionPane;
public class Ejercicio05 {
    public static void main(String[] args){
        
        String v1= JOptionPane.showInputDialog("Ingrese su cedula : ");
        String v2= JOptionPane.showInputDialog("Ingrese su nombre : ");
        String v3 = JOptionPane.showInputDialog("ingrese su apellido :");
        String v4= JOptionPane.showInputDialog("Ingrese su edad :");
       
        
        int cedula= Integer.parseInt(v1);
        String nombre= v2;
        String apellido= v3;
        int edad= Integer.parseInt(v4);
      
  
                
        System.out.println("Su cedula  es: "+cedula);
        System.out.println("Su nombre es : "+nombre);
        System.out.println("Su apellido es : "+apellido);
        System.out.println("Su edad es :" +edad);
        
        if(edad > 18 ==true){
            System.out.println("Si Es Mayor de Edad");
        }else if(edad < 18== false){
            System.out.println("No Es Mayor de Edad");
        }        
        
    }
    
}
