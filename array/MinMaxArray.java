package array;

public class MinMaxArray {
    public static void main(String[] args) {
        double[] salary = {4000,3000,1000,2000};
        double min = 0;
        double max = 0;
        for(int i=0; i<salary.length;i++){
            for(int j=0; j<salary.length; j++){
                if(salary[i]<salary[j]){
                    min = salary[i];
                }
                if(salary[i]>salary[j]){
                    max = salary[i];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    
}
