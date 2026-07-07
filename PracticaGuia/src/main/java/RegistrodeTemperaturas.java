import javax.swing.JOptionPane;
public class RegistrodeTemperaturas {
    public static void main(String[] args){
        
        double sumarTemperatura= 0.0;
        double promedio= 0.0;
        int contador= 0;
        
        String t1= JOptionPane.showInputDialog("Ingrese la temperatura(O un numero negativo para salir)");
            double temperatura= Double.parseDouble(t1);
            
            while (temperatura > 0){
                sumarTemperatura += contador;
                contador++;
                
           t1= JOptionPane.showInputDialog("Ingrese la temperatura(O un numero negativo para salir )");
                temperatura= Double.parseDouble(t1);
            }
            if(contador > 0){
                promedio= sumarTemperatura / contador;
                
                JOptionPane.showMessageDialog(null, "--RESULTADO DEL MONITOREO--\n\n "
                        +"Cantidad de temperatura validas: "+contador+ "\n"
                        + "suma Total de temperatura: "+ sumarTemperatura+ "\n"
                                + "El promedio de temperatura es: "+promedio);
          
                
            }else{
                JOptionPane.showMessageDialog(null,"No se ingresaron temperaturas validas");
            }
        
            
    }
}
