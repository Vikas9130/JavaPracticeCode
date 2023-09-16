package array;

import java.util.ArrayList;

public class FindCommonNumFromSortedArray {

    public static void main(String[] args) {
        int arr1[]={1,5,10,20,40,80};
        int arr2[]={6,7,20,80,100};
        int arr3[]={3,4,15,20,30,70,80,120};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }



        for(int i=0; i<list.size(); i++){
            for(int j=0; j<arr3.length; j++){
                if(list.get(i)==arr3[j]){
                    list1.add(arr3[j]);
                }
            }
        }
        for(int k:list1){
            System.out.print(k+" ");
        }
    }
    
}
