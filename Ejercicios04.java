
package practicas;

public class Ejercicios04 {
    public static void main(String[] args){
   String cod_Producto1= "A001-HL-2026";
 String nombre= "Choco Ramo";
 String categoria= "Postre";
 String proveedor= "Helados Cali";
    int stock_Inicial= 50;
    int unidades_Vendidas= 24;
    int unidades_Dañadas= 5;
    int stock_minimo_permitido= 10;
double costo_unitario= 12.50;
double precio_venta= 25.00;
double gasto_envio_total= 50.00;

     int stock_Actual= (stock_Inicial-unidades_Dañadas);
     double invercion_Total= (costo_unitario*stock_Inicial)+ gasto_envio_total;
     double Ganancias_potenciales= (precio_venta-costo_unitario)*stock_Actual;

        boolean necesita_Reponer= stock_Actual <=stock_minimo_permitido;
        
   System.out.println("Producto : "+cod_Producto1);
   System.out.println("Nombre : "+nombre);
   System.out.println("Categoria : "+categoria);
   System.out.println("Proveedor : "+proveedor);
   System.out.println("Cantidad de "+stock_Inicial+ " Helados mas cantidad de  "+unidades_Vendidas);
   System.out.println("Tu invercion Fue $"+invercion_Total);
   System.out.println("Tuviste un total de $"+Ganancias_potenciales+ " en Ganancias");
   System.out.println("¿ tengo que reponer? :  "+necesita_Reponer);     
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
