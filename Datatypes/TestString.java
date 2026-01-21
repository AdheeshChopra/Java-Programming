package Datatypes;

public class TestString {
    public static void main(String[] args){
        String name = "Adheesh";
        System.out.println(name);
        int length = name.length();
        System.out.println(length);
        System.out.println(name.charAt(length-1));
        String name2 = "AdheeshChopra";
        System.out.println(name.equals(name2)); //false
        System.out.println(name.substring(4));
    }
}

