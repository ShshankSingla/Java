import java.util.Scanner;
import java.util.Arrays;

public class Lec9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rollNo = new int[]{1,2,3};
        for(int i=0;i<3;i++){
            System.out.println(rollNo[i]);
        }

        System.out.println(Arrays.toString(rollNo));

        System.out.println(rollNo.length);

        int[][] arr = {
                        {1, 2},
                        {3, 4, 5},
                        {6}
        };

        for(int[] it: arr){
            for(int j: it){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}