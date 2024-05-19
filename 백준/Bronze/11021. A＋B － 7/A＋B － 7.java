import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            //readline()은 한 줄을 읽는 메소드
            //한줄을 읽어서, 그 글자를 int 값으로 반환함.
            st = new StringTokenizer(br.readLine()); //다음줄로 넘김
            //파일에 작성하는 부분. 따로 다음줄로 넘어가지 않기 때문에 \n을 사용함.
            bw.write(String.format("Case #%d: ", i+1)+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");

        }
        bw.flush(); // 버퍼에 남아있는 내용을 모두 출력한다. // 꼭 필요한과정
        bw.close(); //파일을 닫는다.
    }
}
