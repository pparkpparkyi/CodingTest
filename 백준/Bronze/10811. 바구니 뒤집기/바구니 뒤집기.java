import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," "); //다음줄로 넘김
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= i+1;
        }
        for(int x=0; x<M;x++){
            st=new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            while(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //인덱스 업데이트
                i++;
                j--;
            }
        }
        br.close();

        for(int i=0;i<N;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}