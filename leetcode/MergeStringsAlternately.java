package leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        int l1 = word1.length();
        int l2 = word2.length();
        int size = l1>l2?l1:l2;
        StringBuilder merge = new StringBuilder();
        for(int i=0; i<size;i++){
            if(i<l1){
                char temp1 = word1.charAt(i);
                merge.append(temp1);
            }
            if(i<l2){
                char temp2 = word2.charAt(i);
                merge.append(temp2);
            }  
        }
        System.out.println(merge);

    }
    
}
