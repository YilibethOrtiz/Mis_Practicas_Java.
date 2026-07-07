import javax.swing.JOptionPane;
public class TablasDeMultiplicar {
    public static void main(String[] args){
        
//Escribe un programa en Java que utilice un bucle for para mostrar
//la tabla de multiplicar de un número ingresado por el usuario (del 1 al 10).        
        
  String v1= JOptionPane.showInputDialog("Ingrese un numero del 1 al 10");
     int numero= Integer.parseInt(v1);
     
      for(int i=1; i<=10; i++){
          int resultado= numero * i;
                  
          JOptionPane.showMessageDialog(null, numero + " X " +i+ "=" +resultado);
      }  
        
        
        
        
        
        
        
    }
    
}
