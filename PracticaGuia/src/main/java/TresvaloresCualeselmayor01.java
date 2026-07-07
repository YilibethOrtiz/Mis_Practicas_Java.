
import javax.swing.JOptionPane;
public class TresvaloresCualeselmayor01 {

    public static void main(String[] args) {
        
        
   String v1 = JOptionPane.showInputDialog("Ingrese primer número:");
String v2 = JOptionPane.showInputDialog("Ingrese segundo número:");
String v3 = JOptionPane.showInputDialog("Ingrese tercer número:");

int n1= Integer.parseInt(v1);
int n2= Integer.parseInt(v2);
int n3= Integer.parseInt(v3);

if(n1 > n2 && n2 > n3){
  JOptionPane.showInputDialog(null, "El mayor es : "+n1);  
}else if(n2 > n1 && n2 > n3){
  JOptionPane.showInputDialog(null,"El mayor es : "+n2);  
}else{
    JOptionPane.showInputDialog(null,"El mayor es : "+n3); 
}       
              
        
    }
}
