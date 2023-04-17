
package FigurasGeometricas;

public class trapecio {
   public static double calcularArea(double baseMenor, double baseMayor, double altura){
       double area;
       area = ((baseMenor + baseMayor)*altura)/2;
       return area;
   } 
   
   public static double calcularPerimetro(double baseMenor, double baseMayor, double altura){
       double perimetro,a, c;
       a = (baseMayor-baseMenor)/2;
       c = Math.sqrt(Math.pow(a, 2)+Math.pow(altura, 2));
       perimetro = baseMayor+baseMenor+(c*2);
       return perimetro;
   }
}
