package Java_Algorithm;


public class RichestCustomer{
    public static void main (String[] args){
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {9,10,11}
        };
        System.out.println(richest(arr));


    }
    static int richest(int[][] arr){
        int count =0;
        int[] grp={};
        for(int i=0;i<arr.length;i++){
            for(int x=0;x<arr[i].length;x++){
                count=count+arr[i][x];

            }

            grp[i]=count;
            count=0;


        }
        int max =grp[0];
        for(int i=0;i< grp.length;i++){
            if(grp[i]>max){
                max=grp[i];
            }


        }
        return max ;
    }
}
