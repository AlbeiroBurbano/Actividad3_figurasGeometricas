
package FigurasGeometricas;

public class rectangulo {
    public static double calcularArea (double base, double altura){
        double area;
        area = base*altura;
        return area;
    }
    
    public static double calcularPerimetro(double base, double altura){
        double perimetro;
        perimetro = (2*base)+(2*altura);
        return perimetro;
    }
}
