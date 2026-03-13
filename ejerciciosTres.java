
package practicas;

public class ejerciciosTres {
   public static void main(String[] args){
    String cliente= "Distribuidora los Olivos";
String servicio= "Diseño de Marca + Gestion de Tiktok ";
int mesesContratados= 6;
int videoProducidos= 12;
double costoMensual= 45.99;
        double impuestos= 7.50;  
        
double totalBruto= (costoMensual*mesesContratados);
double totalConImpuesto= (totalBruto+impuestos);
        System.out.println("REPORTE DE CLIENTE: "+cliente);
        System.out.println("SERVICIO "+servicio);
        System.out.println("DURACION: " +mesesContratados+ " meses ");
        System.out.println("TOTAL A PAGAR: $"+totalBruto);   
       System.out.println("tienes una cantidad de videos producidos : "+videoProducidos+ " que son un ingreso en $"+totalConImpuesto);
       
       
       
   } 
}
