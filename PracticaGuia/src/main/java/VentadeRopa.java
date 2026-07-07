import javax.swing.JOptionPane;
public class VentadeRopa {
    public static void main(String[] args){
        
   double montoVenta= 0.0;
   int prenda= 0;
   
   String v1= JOptionPane.showInputDialog("Producto: ");
   String v2= JOptionPane.showInputDialog("Codigo :");
   String v3= JOptionPane.showInputDialog("Monto :");
   
   String c1= v1;
   int c2= Integer.parseInt(v2);
   double c3= Double.parseDouble(v3);
   
   while (c3 > 0){
       montoVenta += prenda;
       prenda++;
       
    v1= JOptionPane.showInputDialog("Producto: "); 
    v2= JOptionPane.showInputDialog("Codigo :");
    v3= JOptionPane.showInputDialog("Monto :");
     c1= v1;
     c2= Integer.parseInt(v2);
     c3= Double.parseDouble(v3);
   }
   if(c3 > 100){
       JOptionPane.showMessageDialog(null,"---¡ VENTA MAYORISTA REGISTRADA--\n\n"
       + "Total de monto: "+montoVenta+ "\n" 
       + "Cantidad de venta: "+prenda);
   }else {
       JOptionPane.showMessageDialog(null,"---¡VENTA REALIZADA--\n\n"
       + "Total de monto: "+montoVenta+ "\n" 
       + "Cantidad de venta: "+prenda); 
   }
        
        
        
        
        
    }
}
