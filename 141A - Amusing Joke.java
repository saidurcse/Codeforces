http://codeforces.com/problemset/problem/141/A

import java.io.*;
import java.util.*;
 
public class Simple
{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String guestName = in.nextLine();
		String hostName = in.nextLine();
		String newLetter = in.nextLine();
		
		String addghInput = guestName + hostName;
		
		char []ghName = addghInput.toCharArray();
		Arrays.sort(ghName);
		String sortedGHName = new String(ghName);
		
		char []nLetter = newLetter.toCharArray();
		Arrays.sort(nLetter);
		String sortednewLetter = new String(nLetter);

		//System.out.println(sortedGHName);
		//System.out.println(sortednewLetter);
		if(sortedGHName.equals(sortednewLetter))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}