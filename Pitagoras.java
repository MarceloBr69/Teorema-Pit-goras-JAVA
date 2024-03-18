public class Pitagoras {
    
    public double CalculoHipotenusa(int catetoA, int catetoB) {
        
        double catetoC = catetoA*catetoA + catetoB*catetoB; //sqrt = raiz cuadrada
        double ResultadoHipotenusa = Math.sqrt(catetoC);
        return ResultadoHipotenusa; 
        
    }
}


