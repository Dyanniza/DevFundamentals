package Generics1;

public class GenericsMethods {
    public static <T> boolean isEqual
            (GenericsType<T> g1,GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String[] args)
    {
        GenericsType <String> g1 = new GenericsType<String>();
        g1.set("Test1");
        GenericsType <String> g2 = new GenericsType<String>();
        g2.set("Test1");

        //boolean isEqual = GenericsMethods.<String>isEqual(g1,g2);
        //System.out.println(isEqual);

        boolean isEqual = GenericsMethods.isEqual(g1,g2);
        System.out.println(isEqual);
    }
}
