//package Implementation;

import java.util.Scanner;

public class meetingFriends {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a>c) {
            int temp=a;
            a=c;
            c=temp;
        }
        if(b>c) {
            int temp=b;
            b=c;
            c=temp;
        }
//        System.out.println(a+" "+b+" "+c);
        System.out.println((b-a)+(c-b));

    }
}
