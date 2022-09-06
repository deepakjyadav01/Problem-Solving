
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,m;
        n = inp.nextInt();
        m = inp.nextInt();
        inp.nextLine();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = inp.nextInt();
            }
            inp.nextLine();
        }
        inp.close();
        
        int[] colSum = new int[m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                colSum[j] += arr[i][j];
            }
        }
        for(int i = 0; i < m; i++)
            System.out.print(colSum[i] + " ");
        System.out.println();
    }
}