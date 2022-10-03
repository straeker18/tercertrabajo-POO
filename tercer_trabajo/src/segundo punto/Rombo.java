public class Rombo {
    double D,d,a;
    Rombo(int D,int d){
        this.D = D;
        this.d = d;
        a=Math.sqrt(Math.pow(D/2, 2)+Math.pow(d/2,2));
    }
    double calcularArea() {
        return (D*d)/2;
    }
    double calcularPerímetro() {
        return 4*a;
    }
}
