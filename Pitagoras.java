import java.util.Scanner;
public class Pitagoras {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese valor del cateto A");
        double a = input.nextDouble();

        System.out.println("Ingrse valor del segundo cateto (Cateto B)");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a + b*b); //sqrt = raiz cuadrada

        System.out.println("La longitud de la hipotenusa es:" + c);
    }
    

    
}


