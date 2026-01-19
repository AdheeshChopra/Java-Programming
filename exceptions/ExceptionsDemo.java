package exceptions;

import java.io.*;

public class ExceptionsDemo {
    public static void show(){

//        ---UNCHECKED EXCEPTIONS
//        sayHello(null);

//        ---CHECKED EXCEPTIONS
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
}
