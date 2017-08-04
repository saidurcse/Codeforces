http://codeforces.com/problemset/problem/118/A

import java.util.*;

public class Simple {
    public static final void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);
    	
    	String task1 = in.nextLine();
    	String task = task1.toLowerCase();
    	task = task.replaceAll("[aeiouy]", "");
    	//System.out.println(task);
    	char arr[] = task.toCharArray();
    	   	
    	for(int i=0;i<arr.length;i++){
    		System.out.print("."+arr[i]);
    	}    	
    	System.out.println();
    }
}