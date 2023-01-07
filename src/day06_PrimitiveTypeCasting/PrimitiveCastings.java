package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 11;
        short b = (short)a;

        double af = 2.3;

        int v = (int)af;

        double l = 2.3;
        int m = (int)l;

        double dab = 2.5;
        short newdab = (short)dab;

        int d = 100;
        double ff = (double)d/3;

        char star = 9734;
        char star2 = 8471;

        String starstr = Character.toString(star);
        String star2str = Character.toString(star2);

        System.out.println(starstr+star2str);
    }
}
