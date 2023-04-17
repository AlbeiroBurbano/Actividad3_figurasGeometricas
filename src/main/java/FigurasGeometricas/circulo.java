
package FigurasGeometricas;

public class circulo {
    public static double calcularArea (double radio){
        double area;
        area = Math.PI*Math.pow(radio,2);
        return area;
    }
    
    public static double calcularPerimetro(double radio){
        double perimetro;
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
}
