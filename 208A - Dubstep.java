http://codeforces.com/problemset/problem/208/A

import java.util.*;
import java.io.*;

public class Simple {
    public static final void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);    	
    	String input = in.nextLine();
    	
    	if(input.contains("WUB")){
    		input = input.replace("WUB", " ").trim();
    		input = input.replaceAll(" +", " ").trim();    		
    	}
    	
    	System.out.println(input);
    }
}