
public class ProyectoChinchulin {
    public static void main(String[] args) {

    areaTriangulo(12,16);
    areaCuadrado(3,3);
    areaCirculo(2);
    areaRectangulo();
    }
public static int areaTriangulo (int base, int altura){
	return base * altura / 2;
}
	
     public static int cuadrado(int lado1,int lado2){
	
	return lado1 * lado2; 


	}

public static double areaCirculo(double Radio){

return Math.PI * Math.pow(Radio,2); 

}

public static int areaRectangulo(int lado, int altura){
return lado * altura;
}

}
