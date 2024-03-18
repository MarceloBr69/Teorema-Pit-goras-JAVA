public class PitagorasTest {
    public static void main(String [] args){
        Pitagoras iD = new Pitagoras(); //id tomado de Pitagora

        int catetoA = 20;
        int catetoB = 10;

        double hipotenusa = iD.CalculoHipotenusa(catetoA, catetoB); //Toma calculohipotenusa del ID.
        System.out.println(hipotenusa);
    }
}
