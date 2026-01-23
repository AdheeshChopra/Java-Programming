package Arrays.TwoDimensional;

public class Test {
    public static void main(String[] args){
//        int[] arr=new int[3]; 1D ARRAY

        int[][] arr= new int[3][3];

        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(nums[1][2]);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

//        JAGGED ARRAYS
        char[][] arr1 =new char[3][];

        arr1[0] = new char[2];
        arr1[1] = new char[3];
        arr1[2] = new char[2];
        arr1[0][0]='a';
        arr1[0][1]='b';
        arr1[1][0]='c';
        arr1[1][1]='d';
        arr1[1][2]='d';
        arr1[2][0]='e';
        arr1[2][1]='f';

        for(int i=0; i<arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
