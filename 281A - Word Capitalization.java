http://codeforces.com/problemset/problem/281/A

import java.util.*;

public class Simple {
    public static final void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);    	
    	String input = in.nextLine();
    	
    	input = input.substring(0,1).toUpperCase() + input.substring(1);
    	
    	System.out.println(input);
    	
    }
}