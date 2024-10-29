//package Implementation;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        int row=0,col=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    row=i+1;
                    col=j+1;
                }
            }
        }
        System.out.println(Math.abs(row-3)+Math.abs(col-3));

    }
}
