import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();

        if(((B+C)/60)>0){
            A+=((B+C)/60);
            if(A<=23) {
                System.out.printf("%d %d",A,B+C-((B+C)/60)*60);
            }else{
                System.out.printf("%d %d",A-24,B+C-((B+C)/60)*60);
            }
        }else{
            if((B+C)==60){
                if(A<23){
                    System.out.printf("%d %d",A+1,0);
                }else{
                    System.out.printf("%d %d",A-24,0);
                }
            }else{
                System.out.printf("%d %d",A,B+C);
            }

        }
    }
}