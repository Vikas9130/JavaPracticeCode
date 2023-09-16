package array;

public class FindPairWithGivenDifference {
    public static void main(String[] args) {
        int arr[]={5,20,3,2,50,80};
        int n=78;
        int ele1=0;
        int ele2 = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]-arr[j]==n||arr[j]-arr[i]==n){
                    ele1 = arr[i];
                    ele2 = arr[j];
                }
            }
        }
        System.out.println(ele1+" "+ele2);
    }
    
}
