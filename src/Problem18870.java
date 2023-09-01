import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem18870 {

    /*
     * 풀이중
     */
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pos[] = new int[Integer.parseInt(br.readLine())];
        int sorted[] = new int[pos.length];
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        for(int i = 0; i < pos.length; i++) {
            pos[i] = Integer.parseInt(st.nextToken());
            sorted[i] = pos[i];
        }

        java.util.Arrays.sort(sorted);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int correction; // This variable is intended for duplicate value correction;

        if(pos[0] == sorted[0]) {
            bw.write(0 + "");
        }
        else {
            correction = 0;

            for(int i = 1; i < sorted.length; i++) {
                if(sorted[i] == sorted[i - 1]) {
                    correction++;
                    continue;
                }

                if(pos[0] == sorted[i]) {
                    bw.write((i - correction) + "");
                }
            }
        }

        for(int i = 1; i < pos.length; i++) {
            if(pos[i] == sorted[0]) {
                bw.write(" " + 0);
            }
            else {
                correction = 0;

                for(int j = 1; j < sorted.length; j++) {
                    if(sorted[j] == sorted[j - 1]) {
                        correction++;
                        continue;
                    }

                    if(pos[i] == sorted[j]) {
                        bw.write(" " + (j - correction));
                    }
                }
            }
        }

        bw.close();
    }
}
