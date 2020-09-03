package complexo;

public class TestarComplexo {

    public static void main(String[] args) {

        NumeroComplexo z1, z2, z3, z4, z5, z6, z7, z8,z9;
        NumeroComplexo zSoma, zSub, zMult, zDiv;

        z1 = new NumeroComplexo(2, 3);
        z2 = new NumeroComplexo(1, 2);

        z3 = new NumeroComplexo(5, -2);
        z4 = new NumeroComplexo(-3, 2);

        z5 = new NumeroComplexo(2, 3);
        z6 = new NumeroComplexo(1, -4);

        z7 = new NumeroComplexo(5, 2);
        z8 = new NumeroComplexo(7, 4);
        
        z9 = z1;

        zSoma = z1.somar(z2);
        zSub = z3.subtrair(z4);
        zMult = z5.multiplicar(z6);
        zDiv = z7.dividir(z8);

        System.out.println("SOMA: "); //3 + 5i
        System.out.println(zSoma);
        System.out.println("SUBT: "); //8 - 4i
        System.out.println(zSub);
        System.out.println("MULT: "); //14 - 5i
        System.out.println(zMult);
        System.out.println("DIV: ");  //0,66 - 0,09i
        System.out.println(zDiv);
        
        System.out.println("É igual? => "+z1.eIgual(z9));
    }
}
