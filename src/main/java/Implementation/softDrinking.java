//package Implementation;

import java.util.Scanner;

public class softDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),p=sc.nextInt(),nl=sc.nextInt(),np=sc.nextInt();
        int litres=k*l;
        int grpsGlasses=litres/nl;
        int eachGlass=grpsGlasses/n;
        int slices=c*d; //=grp
        int eachSlices=slices/n;
        int grpSalt=p/np;
        int eachSalt=grpSalt/n;
        System.out.println(Math.min(eachGlass,Math.min(eachSlices,eachSalt)));


    }
}
