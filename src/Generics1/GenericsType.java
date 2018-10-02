package Generics1;


import java.util.ArrayList;
import java.util.List;

public class GenericsType <T>{
    private T value;

    public T get(){
        return this.value;
    }
    public void set (T value){
        this.value = value;
    }

    public static void main(String[] args)
    {
        List <String> list1 = new ArrayList<String>();
        list1.add("String1");

        List <Integer> list2 = new ArrayList<Integer>();
        list2.add(45);

        GenericsType <String> list3 = new GenericsType<String>();
        list3.set("String3");
        String str3 = list3.get();
        System.out.println(str3);

        GenericsType <Integer> list4 = new GenericsType<Integer>();
        list4.set(99);
        Integer int4 = list4.get();
        System.out.println(int4);
    }
}
