package Recursion;

public class SumOfNaturalNos {
    public static void main(String[] args){
        System.out.println(SumOfnNaturalNos(7));
    }
    public static int SumOfnNaturalNos(int n){

        if (n==1) return 1;

        return n + SumOfnNaturalNos(n-1);
    }
}
