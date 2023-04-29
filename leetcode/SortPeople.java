package leetcode;

public class SortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                if(heights[i]<heights[j]){
                    int temp = heights[i];
                    String temp1 = names[i];
                    heights[i] = heights[j];
                    names[i] = names[j];
                    heights[j] = temp;
                    names[j] = temp1;
                }
            }
        }
        for(int i:heights){
            System.out.println(i);
        }
        for(String str:names){
            System.out.println(str);
        }
    }
    
}
