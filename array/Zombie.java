public class Zombie {
    public static void main(String[] args) {
        int[] arr = {1,1,3,6,7,3};
        int city = 6;
        int per = 0;

        for(int i=0; i<arr.length-1; i++){
            // if(city == arr[i]){
                // per = arr[i];
                int a, b, gcd = 1;
                a = arr[i];
                b = arr[i+1];
                int min, max;
                min = a;
                if (min > b){
                    min = b;
                    max = a;
                }
                else{
                    min = a;
                    max = b;
                }
                while (max > min){
                    int r = max % min;
                    if (r == 0){
                        gcd = min;
                        break;
                    }else{
                        max = min;
                        min = r;
                    }
            }
            if (gcd != 1 && arr[i]>arr[i+1]){
                per = i;
            }
        }
    
    System.out.println(per);
}
}
