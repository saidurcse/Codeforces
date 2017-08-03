http://codeforces.com/problemset/problem/71/A

import java.io.*;
import java.util.*;

public class Simple{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
				
		for(int i=0;i<=input;i++){
			
			String word = in.nextLine();
			int len = word.length();
			
			if(len>10){
				System.out.print(word.charAt(0));
				System.out.print(len-2);
				System.out.println(word.charAt(len-1));
			}else{
				System.out.println(word);
			}
		}
	}
}