package leetcode;

public class IntervalsBWIdenticalElements {
    public static void main(String[] args) {
        int[] arr = {2,1,3,1,2,3,3};//5,0,3,4
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int sum = 0;//4
            for(int j=0; j<arr.length; j++){

                if(arr[i]==arr[j]){
                    if(j>i){
                        sum = sum +(j-i);
                    }else{
                        sum = sum +(i-j);
                    }
                }
            }
            ans[i] = sum;
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
