package Arrays.OneDimensional;

public class Test {
    public static void main(String[] args) {
//        type[] variableName;

        int[] arr = new int[15]; //15 is size of array


        arr[3]= 34;
        arr[6]= 76;

        System.out.println(arr.length);

//        Traversing in array
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr1 = {1, 2, 3, 4};
      

        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
      

        for(int i: arr1){
            System.out.println(i);
        }

    }
}
