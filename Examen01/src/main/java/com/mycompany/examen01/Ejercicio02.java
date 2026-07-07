
package com.mycompany.examen01;
import javax.swing.JOptionPane;
public class Ejercicio02 {
    public static void main(String[] args){
        
//  2) Ingrese a traves de ventana 6 valores numericos primero sumarlos 
//segundo multiplicarlo y obtener promedio

String n1= JOptionPane.showInputDialog("Ingrese el primer numero: ");
String n2= JOptionPane.showInputDialog("Ingrese el segundo numero: ");
 String n3= JOptionPane.showInputDialog("Ingrese el tercer numero: ");
 String n4= JOptionPane.showInputDialog("Ingrese el cuarto numero: ");
 String n5= JOptionPane.showInputDialog("Ingrese el quinto numero: ");
  String n6= JOptionPane.showInputDialog("Ingrese el sexto numero: ");
        
   int numero1= Integer.parseInt(n1);
   int numero2= Integer.parseInt(n2);
   int numero3= Integer.parseInt(n3);
   int numero4= Integer.parseInt(n4);
   int numero5= Integer.parseInt(n5);     
   int numero6= Integer.parseInt(n6);    
        
   int suma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6;     
    int resultado= suma;
  int multiplicar=  numero1 * numero2 * numero3 * numero4 * numero5 * numero6; 
  int promedio= resultado / 6;
  
  
    System.out.println(" Resultado de la Suma: "+resultado);
    System.out.println("Resultado de la Multiplicacion: "+multiplicar);
    System.out.println("Resultado del Primedio : "+promedio);
   
    }
    
}
