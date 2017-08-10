http://codeforces.com/problemset/problem/58/A

import java.util.*;
import java.io.*;

public class Simple {
    public static final void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);    	
    	String input = in.nextLine();
    	
    	String matcher = "hello";
    	
    	int count = 0;
    	
    	for(int i=0;i<input.length();i++){
    		if(count == matcher.length())
    			break;
    		
    		if(input.charAt(i) == matcher.charAt(count))
    			count++;
    	}
    	
    	if(count>=5)
    		System.out.println("YES");
    	else
    		System.out.println("NO");
    }
}