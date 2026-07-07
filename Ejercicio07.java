
package practicas;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args){
        
Scanner teclado=new Scanner(System.in);
    System.out.println("¿codigo? ");
  String codigo=teclado.nextLine();
  String cod= "A001-PI-AAAA";
 String nombre= "Botones";
 int stock_Inicial= 100;
 int stock_Vendidos= 50;
    double precio_UNDD= 0.25;
    double precio_Vender= 0.50;
    
 int stock_Actual= (stock_Inicial-stock_Vendidos);
    double inversion= (stock_Inicial*precio_UNDD);
    double ganancias= (stock_Vendidos*precio_Vender);
System.out.println("Codigo : "+cod);
System.out.println("Nombre: "+nombre);
System.out.println("Pedido Inicial "+stock_Inicial+ " Unidades. ");
System.out.println("Unidades Actuales "+stock_Actual+ " unidades de "+stock_Inicial);
System.out.println("Mi Inversion Fue de "+inversion);
System.out.println("Mis Ganancias Actuales son "+ganancias);
teclado.close();







        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
