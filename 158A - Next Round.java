http://codeforces.com/problemset/problem/158/A

import java.io.*;
import java.util.*;

public class Simple{
	public static void main(String[] args) {
		
		//Taking user input
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		//Main logic for next round
				
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i] == 0){
				continue;
			}
			if(arr[i] >= arr[k-1]){					
				count++;
			}
		}
		
		//Output for the problem of next round
		System.out.println(count);
	}
}