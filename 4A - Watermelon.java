http://codeforces.com/problemset/problem/4/A

import java.io.*;
import java.util.*;

public class Simple {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		if(input == 2)
			System.out.println("NO");
		else{				
			if(input%2 ==0)
					System.out.println("YES");			
			else
				System.out.println("NO");
		}		
	}
}