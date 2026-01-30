package Exceptions;

public class Test {

//    This Piece of code will explain what are EXCEPTIONS and how we can handle them.

   public static void main(String[] args){
       int[] numerator = {10, 200, 30, 40};
       int[] denominator = {1, 2, 0, 4};
       for(int i=0; i<numerator.length; i++){
           System.out.println(divide(numerator[i], denominator[i]));
       }
       System.out.println("Good Job");
   }
   public static int divide(int a, int b){
       try{
           return a/b;
       } catch (Exception e){
           System.out.println(e);
           return -1;
       }
   }

// This piece of code will explain STACK TRACING
   public static void main(String[] args){
       try{
           level1();
       } catch(Exception e){
           e.printStackTrace();
       }
   }
   public static void level3(){
       int[] array = new int[5];
       array[5] = 10;
   }
   public static void level2(){
       level3();
   }
   public static void level1(){
       level2();
   }

//    Explains THROW and THROWS keywords
   public static void main(String[] args){
       try {
           FileReader fileReader=new FileReader("a.txt");
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
   }

//  TRY - CATCH - FINALLY
   public static void main(String[] args){
       System.out.println(divide(1, 0));
   }
   public static int divide(int a, int b){
       try{
           return a/b;
       } catch(Exception e){
           return -1;
       } finally {
           System.out.println("Bye");
       }
   }


//    TRY with RESOURCES
   public static void main(String[] args){
       try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))){
           String line;
           while((line = reader.readLine()) != null){
               System.out.println(line);
           }
       }catch (Exception e){
           System.out.println("Exception caught: "+e.getMessage());
       }
   }

//    CUSTOM EXCEPTIONS
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(10);
        try{
            bankAccount.withdraw(11);
        } catch (InsufficentFundsException e) {
            System.out.println(e);
        }
    }
}
