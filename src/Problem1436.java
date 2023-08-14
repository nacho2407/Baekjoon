import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1436 {
    public static void main(String[] args) throws Exception {
        final int THE_END = 666;

        // 응~ 그냥 때려 박으면 그만이야~
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        int[] numOfEnd = new int[cases];

        br.close();

        numOfEnd[0] = THE_END;
        int index = 1;

        for(int i = 1; i < cases; i++) {
            int tempInt = (int) Math.log10(i) + 2;
            for(int j = 0; j < tempInt; j++) {
                numOfEnd[index] = i % (10 * j) + THE_END * (10 * j)
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    }
}
