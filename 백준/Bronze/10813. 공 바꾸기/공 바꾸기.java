
import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr [] =new int[N];
        int tmp;
        for (int x = 0; x < N; x++) {
            arr[x]=x+1;
        }
        for(int x=0;x<M;x++){
            st = new StringTokenizer(br.readLine());
            int i =Integer.parseInt(st.nextToken());
            int j =Integer.parseInt(st.nextToken());
            tmp=arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=tmp;
        }
        for(int x=0;x<N;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
