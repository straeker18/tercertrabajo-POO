public class Trapecio {
    Double BaseMenor,BaseMayor,Altura,LadoDerecho,LadoIzquierdo;
    Trapecio(Double BaseMayor,Double BaseMenor,Double Altura,Double LadoDerecho,Double LadoIzquierdo){  
        this.BaseMayor=BaseMayor;
        this.BaseMenor=BaseMenor;
        this.Altura=Altura;
        this.LadoDerecho=LadoDerecho;
        this.LadoIzquierdo=LadoIzquierdo;

    }
    double calcularArea() {
        return ((BaseMayor+BaseMenor)*Altura)/2;
    }
   double calcularPerímetro() {
        return LadoDerecho+LadoIzquierdo+BaseMayor+BaseMenor;
    }
}