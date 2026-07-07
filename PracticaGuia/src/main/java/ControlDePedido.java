import javax.swing.JOptionPane;
public class ControlDePedido {
    public static void main(String[] args){
        
// Una tienda online necesita un programa para procesar 3 
//pedidos de clientes y determinar el costo o beneficio de cada uno. 
//Para cada pedido, el programa debe pedir al usuario mediante ventanas       
   double mayorMonto= 0.0;
  String clienteMayor= "";   
    
    for(int i =1; i<=3; i++){   
  String v1= JOptionPane.showInputDialog("Pedido " + i + "-Nombre del cliente ");
  String v2= JOptionPane.showInputDialog("Pedido " + i + "-1 para Estandar, 2 para Express ");
  String v3= JOptionPane.showInputDialog("Pedido " + i + "-Monto ");
 
  String nombre= v1;
  double monto= Double.parseDouble(v3);
  int c2= Integer.parseInt(v2);
  
double montoFinal= monto;
 
  
  if(c2 == 2 && monto > 50){
      montoFinal= monto * 0.90;
    JOptionPane.showMessageDialog(null,"Tienes un descuento del 10%, tu monto es "+montoFinal);  
  }else if(c2 == 1 && monto <= 50){
      montoFinal= monto + 5;
    JOptionPane.showMessageDialog(null,"Se agrego costo de envio, Total: "+montoFinal);  
  }else{
      JOptionPane.showMessageDialog(null, "No aplica el descuento ni recargo, Total: "+montoFinal);
  }
    
  if(montoFinal > mayorMonto){
      mayorMonto = montoFinal;
      clienteMayor= nombre;
  }
      }
        
    JOptionPane.showMessageDialog(null,
            "---RESUMEN FINAL---\n\n" +
                    "El cliente con el mayor valor de compra es: "+clienteMayor+ " Con un total de $" +mayorMonto);    
        
    }
    
}
