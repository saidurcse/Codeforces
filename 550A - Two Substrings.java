http://codeforces.com/problemset/problem/550/A

import java.io.*;
import java.util.*;

public class Simple {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String subString = in.nextLine();
		//char arr[] = subString.toCharArray();

		if (subString.contains("AB") && subString.contains("BA")) {
			if (subString.replaceFirst("AB", "N").contains("BA")
					|| subString.replaceFirst("BA", "N").contains("AB")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			if (subString.replaceFirst("AB", "N").contains("BA")
					&& subString.replaceFirst("BA", "N").contains("AB")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}