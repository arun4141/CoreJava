
package lemrajava8;

import java.util.Arrays;

public class arraylis {
	
	public static void main(String[] args) {
		
		 int [] a = {12,25,22,47,6,3,8,4,5,6,2,5,8,5,6,8,5,6,};
		 
		 Arrays.parallelSort(a);
		 
		 for (int i : a) {
			System.out.println(i);
		}
	}

}
