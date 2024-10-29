//package Implementation;
//kal wala que not accepted kyA?
import java.util.Scanner;

public class RobinHelps {
    //4 2
    //1 1 0 0
    //na lungi na dungi wala case
    //0 5 ,5 0 or 0 3 0 0
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int th=sc.nextInt();
            int curr=0,people=0;
            for(int i=0;i<n;i++){
                int gold=sc.nextInt();
                if(gold>=th) curr+=gold;
                else if(gold==0 && curr>0) {
                    curr-=1;
                    people++;
                }
                //if bich ka kn kro
            }
            System.out.println(people);
        }
    }

}
