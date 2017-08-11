http://codeforces.com/problemset/problem/41/A

import java.util.*;
import java.io.*;

public class Simple {
    public static final void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);    	
    	String input1 = in.nextLine();
    	String input2 = in.nextLine();
    	
    	String reverse = new StringBuffer(input2).reverse().toString();
    	
    	/*String reverse = "";
    	for(int i=input2.length()-1;i>=0;i--){
    		reverse = reverse + input2.charAt(i);
    	}*/
    	//System.out.println(reverse);
    	
    	if(input1.equals(reverse)){
    		System.out.println("YES");
    	}else{
    		System.out.println("NO");
    	}
    }
}