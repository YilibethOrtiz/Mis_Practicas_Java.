import javax.swing.JOptionPane;
public class ControlDeAhorro {
    public static void main(String[] args){
        
//     Crea un programa en Java que le permita al usuario
//ingresar cantidades de dinero que desea depositar en 
// su alcancía. El programa debe utilizar un bucle while para sumar 
// los depósitos.   
        
      double totalAhorrado= 0.0;  //esto funciona como un acomulador para sumar el deposito 
        int cantidadDedeposito= 0;//esto es un acomulador para saber cuantos depositos se hisieron 
        
        
        String v1= JOptionPane.showInputDialog("Ingrese el monto a depositar");
        double monto= Double.parseDouble(v1);
        
        while (monto >= 0){//El ciclo se repetirá una y otra vez mientras el usuario ingrese números positivos o cero.
            totalAhorrado += monto;//sumamos el monto al total
            cantidadDedeposito++;//contamos cuantos depositos se hicieron
            
            //aqui pedimos si continua con otro deposito o cerramos el ciclo 
            v1= JOptionPane.showInputDialog("Ingrese el siguiente monto(o un numero negativo para salir):");
            monto = Double.parseDouble(v1);
                    }
        //aqui tenemos el final de cuanto se ahorro y cuantas veses se deposito
        JOptionPane.showMessageDialog(null, "Total ahorrado: $" + totalAhorrado+
                "\nTotal de deposito realizados: " + cantidadDedeposito);
        
        
       
    }
    
}
