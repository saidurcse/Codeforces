http://codeforces.com/problemset/problem/96/A

import java.util.*;

public class Simple {
    public static final void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);
    	
    	String input = in.nextLine();
    	/*char arr[] = input.toCharArray();
    	
    	int zero=0, one=0 , max=0;
    	
    	for(int i=0;i<arr.length;i++){
    		
    		zero=0;
    		while(i<arr.length && arr[i]=='0'){
    				zero++;  
    				i++;
    		}   
    		if(zero > max){
    			max = zero;
    			//System.out.println(zero);
    		}   		   		
    		
    		one=0;
    		while(i<arr.length && arr[i]=='1'){
    				one++;  
    				i++;
    		}   
    		if(one > max){
    			max = one;
    			//System.out.println(one);
    		}
    		
    		if(zero >=7 || one >=7)
    			break;
    	}
    	if(zero >= 7 || one >= 7){
			System.out.println("YES");			
    	}
		else{
			System.out.println("NO");
		}	*/
    	
    	if(input.contains("1111111") || input.contains("0000000")){
    		System.out.println("YES");
    	}else{
    		System.out.println("NO");
    	}
    }
}