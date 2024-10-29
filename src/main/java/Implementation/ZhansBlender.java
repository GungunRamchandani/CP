//package Implementation;

import java.util.Scanner;

public class ZhansBlender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long x=sc.nextInt();
            long y=sc.nextInt();
            long perSec=Math.min(x,y);
            if(n%perSec==0) System.out.println(n/perSec);
            else System.out.println((n/perSec)+1);
        }

    }
}
