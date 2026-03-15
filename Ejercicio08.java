package practicas;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){          
        Scanner teclado=new Scanner(System.in);
String codBotones= "A001";
String codCierres= "B002";
String codCierresJins= "C003";
    System.out.println("---BUSCADOR DE INVENTARIO---");
    System.out.println("Introduce el codigo del producto: ");
    String busqueda=teclado.nextLine();
    if (busqueda.equals(codBotones)){
     System.out.println("\n[DATOS DEL PRODUCTO]");
    System.out.println("Nombre: Botones");
    System.out.println("Stock Actual: 50"); 
    } else if (busqueda.equals(codCierres)){
        System.out.println("\n[DATOS DEL PRODUCTO]");
        System.out.println("Nombre : Cierres");
        System.out.println("Stock Actual : 20");
    } else if (busqueda.equals(codCierresJins)){
        System.out.println("\n[DATOS DEL PRODUCTO]");
        System.out.println("Nombre : Cierres Jins");
        System.out.println("Stock Actual : 50");
    }else{
        System.out.println("Codigo no encontrado");
    }
  
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
