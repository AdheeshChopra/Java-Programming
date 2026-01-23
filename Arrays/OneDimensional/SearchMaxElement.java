package Arrays.OneDimensional;

public class SearchMaxElement {
    public static void main(String[] args){
        int[] arr= {2, 12, 4322, -32, 22};

        int res= Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }

        System.out.println(res);
    }
}
