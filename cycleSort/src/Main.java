import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);



            }
            else{
                i++;
            }
        }

    }
    static void swap(int[] arr,int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }

}