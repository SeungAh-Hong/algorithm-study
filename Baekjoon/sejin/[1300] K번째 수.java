import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		long start = 1;
		long end = K;
		
		while(start < end) {
			
			long mid = (start + end) / 2;	
			long count = 0;

			for(int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}
			
			if (K <= count) end = mid;
			else start = mid + 1;
		}
		
		System.out.println(start);
	}
}
