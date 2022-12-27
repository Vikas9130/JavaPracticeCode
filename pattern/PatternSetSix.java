package pattern;

public class PatternSetSix {
    public static void main(String[] args) {
        pattern3(5);
}
/*
    *
   ***
  *****
 *******
*********
 */
public static void pattern3(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i>j){
                System.out.print("   ");
            }else{
                System.out.print(" * ");
            }
        }
        System.out.println();
    }

}
/*
 *
 **
 ***
 ****
 *****
 */
public static void pattern2(int n){
    for(int i=1; i<=n; i++){
        for( int j=1; j<=n; j++){
            if(i>=j){
                System.out.print(" * ");
            }
        }
        System.out.println();
    }

}

/*
 *****
  ****
   ***
    **
     *
 */
public static void pattern1(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i>j){
                System.out.print("   ");
            }else{
                System.out.print(" * ");
            }
        }
        System.out.println();
    }

}
    
}
