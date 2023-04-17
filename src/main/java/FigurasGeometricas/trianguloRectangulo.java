
package FigurasGeometricas;

public class trianguloRectangulo {
    public static double calcularArea(double base, double altura){
    double area;
        area = (base*altura)/2;
        return area;
    }
    
    public static double calcularPerimetro(double base, double altura){
        double perimetro;
        perimetro = base + altura + calcularHipotenusa(base,altura);
        return perimetro;
    }
    
    public static double calcularHipotenusa(double base, double altura){
        double hipotenusa;
        hipotenusa = Math.pow(base*base + altura*altura, 0.5);
        return hipotenusa;
    }
    
    public static String determinarTipoTriangulo(double base, double altura){
        String Tipo;
        if ((base == altura) && (base == calcularHipotenusa(base,altura)) && (altura == calcularHipotenusa(base,altura))){
            Tipo = "Es un triángulo equilátero"; 
        }else if ((base != altura) && (base != calcularHipotenusa(base,altura)) && (altura != calcularHipotenusa(base,altura))){
            Tipo = "Es un triángulo escaleno";
        }else{
            Tipo = "Es un triángulo isósceles"; 
        
        }
        
       return Tipo;
    }
}
