package Methods;

public class Test {
    public static void main(String[] args){
        int[] a = {1, 3, 6, 10, 4};
        System.out.println(sumOfArray(a));

        int[] b={10, 3, 40, 28, 76};
        System.out.println(sumOfArray(b));

        System.out.println(upperFun("   Adheesh Chopra   "));

        System.out.println(sum(3, 7));

        System.out.println(sum(10, 3, 2));

        int x=2;
        System.out.println(multiplyBy10(x));
        System.out.println(x);

        System.out.println(sum(2, 4, 6, 8));

    }

    public static int sumOfArray(int[] arr){
        int res = 0;
        for(int i: arr){
            res += i;
        }
        return res;
    }

    private static String upperFun(String str){
        return str.trim().toUpperCase();
    }

    private static int sum(int a, int b){
        return a+b;
    }

    private static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int multiplyBy10(int x){
        return x*10;
    }

    public static int sum(int ...a){
        int sum=0;
        for(int i: a){
            sum+=i;
        }
        return sum;
    }

}
