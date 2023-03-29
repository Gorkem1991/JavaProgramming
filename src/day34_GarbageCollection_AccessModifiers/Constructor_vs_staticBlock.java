package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_staticBlock {
    static{
        System.out.println("Static Block");
    }

    public Constructor_vs_staticBlock()
    {
        System.out.println("Constrctor");
    }

    public static void main(String[] args) {
        new Constructor_vs_staticBlock();
    }
}
