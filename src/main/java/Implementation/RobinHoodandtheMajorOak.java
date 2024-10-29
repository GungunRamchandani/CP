//package Implementation;

import java.util.Scanner;

public class RobinHoodandtheMajorOak {
    public static void main(String[] args) {
        //1 sec kaise purenga
        //find 1st such year jiska end time is >=n
        Scanner sc = new Scanner(System.in);
//    double t=sc.nextDouble();
//    while(t-->0d){
        int t = sc.nextInt();
        while (t-- > 0) {
            Double n = sc.nextDouble();
            Double k = sc.nextDouble();
            Double lo = 1d, hi = n;
            Double leaves = 0d;
            Double cand = n;//bacuse k is atleast 1
            while (lo <= hi) {
                Double mid = (lo + (int)((hi - lo) / 2));
                if (exceedsN(mid, k, n)) {
                    cand = mid;
                    hi = mid - 1;
                } else lo = mid + 1;
            }
//            System.out.println(cand);

            for (Double year = cand; year <= n; year++) {
                leaves += (Math.pow(year, year));
            }
            System.out.println((leaves%2==0)?"YES":"NO");
        }
    }

    public static  boolean exceedsN(Double mid,Double k,Double n) {
        //mid year ka end time is
        Double end=mid+k-1;
        return (end>=n);
    }





}
