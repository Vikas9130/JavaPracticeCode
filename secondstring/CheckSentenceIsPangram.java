package secondstring;



public class CheckSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean[] arr = new boolean[26];

        //char[] arr = {'a',b,c,d,e,f,g,h,i,j,k,'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}
        for(int i=0; i<sentence.length();i++){
            if(sentence.charAt(i)>=91&&sentence.charAt(i)<=122){
                arr[122-(int)sentence.charAt(i)] = true;
            }
        }
        boolean isPangram = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==false){
                isPangram = false;
                break;
            }else{
                isPangram = true;
            }
        }
        System.out.println(isPangram);
    
    
    }
    
}
