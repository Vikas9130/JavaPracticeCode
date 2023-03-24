package array;
public class ValueOfVariable {
    public static int finalValueAfterOperations(String[] str) {
        int value = 0;
        for(int i=0; i<str.length;i++){
            if(str[i]=="--X"){
                --value;
            }else if(str[i]=="X--"){
               value--;
            }else if(str[i]=="X++"){
               value++;
            }else if(str[i]=="++X"){
               ++value;
            }
        }
        return value;

    }
    public static void main(String[] args) {
        String[] str = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(str));
    }

    
}
