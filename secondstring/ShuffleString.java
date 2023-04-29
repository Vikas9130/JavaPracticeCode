package secondstring;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        
        int[] indices = {4,5,6,7,0,2,1,3};
        char[] arr = new char[indices.length];
        for(int i=0; i<indices.length;i++){
            int temp = indices[i];
            arr[temp] = s.charAt(i);
        }
        String str = "";
        for(char c:arr){
            str+=c;
        }
        System.out.println(str);
    }
    
}
