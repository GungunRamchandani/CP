//package Implementation;

import java.util.Scanner;

public class Bit {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
////            char ch=sc.next().charAt(0);
////            while(ch!='\n'){
////
////            }
////            x=x+(op); how to store op?cant store
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        sc.nextLine();//for enter
        for(int i=0;i<n;i++){
            String line=sc.nextLine();
            if(line.equals("++X") || line.equals("X++")){
                x=x+1; //or x++
            }
            else x-=1;
        }
        System.out.println(x);


    }
}
