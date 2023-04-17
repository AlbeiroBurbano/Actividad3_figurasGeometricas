
package FigurasGeometricas;

public class rombo {
    public static double calcularArea (double dMayor, double dMenor){
        double area;
        area = (dMayor*dMenor)/2;
        return area;
    }
    
   public static double calcularLado (double dMayor, double dMenor){
       double lado;
       lado = Math.sqrt(Math.pow(dMayor, 2)+Math.pow(dMenor, 2))/2;
       return lado;
   }
   
   public static double calcularPerimetro (double dMayor, double dMenor){
       double perimetro;
       perimetro = 4*calcularLado(dMayor,dMenor);
       return perimetro;
   }
}
