package complexo;

public class NumeroComplexo {

    private double a;
    private double bi;

    public NumeroComplexo() {
        this(0, 0);
    }

    public NumeroComplexo(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }

    public boolean eIgual(NumeroComplexo n) {
        return this.a == n.a && this.bi == n.bi;
    }

    public NumeroComplexo somar(NumeroComplexo n) {
        return new NumeroComplexo(this.a + n.a, this.bi + n.bi);
    }

    public NumeroComplexo subtrair(NumeroComplexo n) {
        return new NumeroComplexo(this.a - n.a, this.bi - n.bi);
    }

    public NumeroComplexo multiplicar(NumeroComplexo n) {
        //(a + b) x (c + d)        
        //(ac - bd) + (ad + bc)i
        return new NumeroComplexo(((this.a * n.a) - (this.bi * n.bi)), ((this.a * n.bi) + (this.bi * n.a)));
    }

    public NumeroComplexo dividir(NumeroComplexo n) {
        //((AC + BD)/(c2 + d2)) + ((BC-AD)/(c2 + d2) i
        NumeroComplexo divisao = new NumeroComplexo();
        divisao.a = ((this.a*n.a)+(this.bi*n.bi))/((n.a*n.a) + (n.bi*n.bi));
        divisao.bi = ((this.bi*n.a)-(this.a*n.bi))/((n.a*n.a) + (n.bi*n.bi));
        
        return divisao;
    }

    @Override
    public String toString() {
        return "(" + getA() + " + " + getBi() + ")";
    }

    public double getA() {
        return this.a;
    }

    public double getBi() {
        return this.bi;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setBi(double bi) {
        this.bi = bi;
    }
}
