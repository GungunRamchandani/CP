package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class RobinHoodInTown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<=2) System.out.println(-1);
            else{
                int sum=0,poor=0;
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                    sum+=arr[i];
                }
                double avg=sum/n;
                double avgHalf=avg/2;
                for(int i=0;i<n;i++){
                    if(arr[i]<avgHalf) poor++;
                }
                int half=(n%2==0?n/2:(n/2)+1);
                if(poor>half) System.out.println(0);
                else{
                    Arrays.sort(arr);
                    //atleast half means >half-1 idx
                    int req=arr[half-1];
                    int avgReq=req*2*n;
                    int ans=avgReq-sum;
                    System.out.println(ans+1);

                }
            }

        }
    }
}
