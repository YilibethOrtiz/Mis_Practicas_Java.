package practicas;
import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
     
    System.out.println("---CALCULADORA DE VENTAS---");
    System.out.print("Nombre del Cliente :");
    String cliente=teclado.nextLine();
    
    System.out.println("Producto a Vender");
    String producto=teclado.nextLine();
    
    System.out.println("Precio unitario");
    double precio=teclado.nextDouble();
    
    System.out.println("Cantidad");
   int cantidad=teclado.nextInt();
   
   double total=precio * cantidad;
   
   System.out.println("\n---------------------");
   System.out.println("CLIENTE : "+cliente);
System.out.println("PRODUCTO : "+producto);
System.out.println("TOTAL : "+total+ "$");
System.out.println("---------------");
System.out.println("¡Ventea con exito!");
teclado.close();


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
