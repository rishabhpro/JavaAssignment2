package java_assignment2;
import java.util.*;
public class Assignment2_question6_code {
	public static boolean isSubset(int[] arr , int[] brr) {
		for(int i = 0 ; i < brr.length ; i++) {
			for(int j  = 0 ; j < arr.length ; j++) {
				if(brr[i] == arr[j])break;
				if(j == arr.length)return false;
			}
		}
		
		
		
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = s.nextInt();
		}
		int m = s.nextInt();
		int[] brr = new int[m];
		for(int i = 0 ; i < n ; i++) {
			brr[i] = s.nextInt();
		}
		
		boolean flag = isSubset(arr,brr);
		System.out.println(flag);

	}

}
