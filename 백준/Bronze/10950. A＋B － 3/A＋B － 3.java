import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int []arr = new int[T];
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int i1 = A + B;
            arr [i] = i1; 
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
}
