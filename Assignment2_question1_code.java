package java_assignment2;
import java.util.*;
public class Assignment2_question1_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		List<Integer> li = new LinkedList<>();
		for(int i = 0 ; i < n - 1; i++) {
			if(arr[i] == arr[i+1] && li.lastIndexOf(arr[i]) == -1) {
				li.add(arr[i]);
			}
		}
		for(int i = 0 ; i < li.size() ; i++) {
			System.out.print(li.get(i));
		}
	}

}
