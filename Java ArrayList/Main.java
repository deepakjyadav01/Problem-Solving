import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        ArrayList arl = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        while(num>0){
            arl.add(num);
            num = 0;
            num = s.nextInt();
        }
        int N = arl.size();
        for(int i=0;i<N;i++){
          System.out.print(arl.get(N-1-i) +" ");
        }
    }
}