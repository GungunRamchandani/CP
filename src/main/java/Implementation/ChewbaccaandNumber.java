//package Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ChewbaccaandNumber { //how 1 sec limit tha n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=0;
//        int[] arr=new int[n];
        ArrayList<Integer> al=new ArrayList<>();
        while(n>0){
//            if(n>=0 && n<=9){
//                //last digit
//
//            }
            //if n==0 case imp
            if(n==9) {
                al.add((int)n);
                n/=10;
            }
            else {
                int lastDigit =(int) (n % 10);
                n = n / 10;
                if (9 - lastDigit < lastDigit) lastDigit = 9 - lastDigit;
//            lastDigit*ans. ->ans length u dont know
                al.add(lastDigit);
            }


        }
        for(int i=al.size()-1;i>=0;i--){
            ans=ans*10+al.get(i);
        }
        System.out.println(ans);

    }
}
//423
//423
