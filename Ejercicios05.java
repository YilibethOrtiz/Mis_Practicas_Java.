
package practicas;

public class Ejercicios05 {
    public static void main(String[] args){
       String materia= "Programacion Java";
    int totalClases= 20;
    int clasesVisitadas= 16;
    double costoInscripcion= 25.80;
    int clasesPagas= 5;
    int clasesPorPagar= 11;
    int clasesRestante= (totalClases-clasesVisitadas);
    double totalIngreso= (costoInscripcion*clasesPagas);
   double clasesEnDeuda= (costoInscripcion*clasesPorPagar);
    boolean estaSolvente= clasesPagas >=totalClases;
    
   System.out.println("Materia : "+materia);
   System.out.println("Progreso : llevas "+clasesVisitadas+ " de " +totalClases+ " clases");
   System.out.println("Te faltan "+clasesRestante+ "clases por dar");
   System.out.println("Tienes Un total de clases pagadas : "+clasesPagas+ " Y clases por pagar "+clasesPorPagar);
   System.out.println("Con un total de ingreso : "+totalIngreso);
   System.out.println("Con una deuda de: "+clasesEnDeuda);
   System.out.println("¿El alumno pago todo?: "+estaSolvente); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
