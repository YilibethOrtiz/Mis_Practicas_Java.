import javax.swing.JOptionPane;
public class ControlDeAcceso02 {
    public static void main(String[] args){
        
    for (int i = 1; i <= 2; i++) {    
String v1= JOptionPane.showInputDialog("Ingrese el nombre del conductor :");
String v2= JOptionPane.showInputDialog("Ingrese Tipo de carnet:");
String v3= JOptionPane.showInputDialog("Ingrese la hora (0-24):");

int autorizacion = Integer.parseInt(JOptionPane.showInputDialog("¿Tiene autorización? \n 1. Sí \n 2. No"));
String c1= v1;
int c2= Integer.parseInt(v2);
int c3= Integer.parseInt(v3);


int est= 1;
int prof= 2;
int visi= 3;

if(c2==prof){
        JOptionPane.showMessageDialog(null,"Acceso al lote A");
}else if(c2==est){
  JOptionPane.showMessageDialog(null,"Hora de Ingreso: ");
 if(c3< 8){
   JOptionPane.showMessageDialog(null,"Acceso al lote B");
 }else if(c2==visi){
     JOptionPane.showMessageDialog(null,"Tienes Autorizacion");
 }
  if(autorizacion==1){
      JOptionPane.showMessageDialog(null,"Acceso al lote C");
 }else{
    JOptionPane.showMessageDialog(null, "Acceso denegado");
  }
  }
  }
    
    
    }
    
    }
