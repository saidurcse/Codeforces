http://codeforces.com/problemset/problem/520/A

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer input = in.nextInt();
		String str = in.next();
		
		String newStr = str.toLowerCase();
		int count = 0;
		
		for(char ch='a'; ch<='z';ch++){			
			if(newStr.contains(String.valueOf(ch)))
				count++;
		}
		
		if(count == 26){					
			System.out.println("YES");			
		}else{
			System.out.println("NO");
		}
	}
}
