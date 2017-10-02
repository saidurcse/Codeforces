http://codeforces.com/problemset/problem/731/A

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char arr[] =str.toCharArray();
			
		char p='a';
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			
			if( (Math.abs(arr[i]-p)) > 13)
				sum += (26% (Math.abs(arr[i]-p)));
			else
				sum += (Math.abs(arr[i]-p));
			
			//System.out.println(Math.abs(arr[i]-p));
			
			p = arr[i];
		}
		
		System.out.println(sum);
	}
}
