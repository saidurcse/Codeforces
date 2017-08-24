http://codeforces.com/problemset/problem/750/A

import java.io.*;
import java.util.*;

public class Simple {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		int timeLeft = 240 - k;
		int count = 0, temp= 0;

		for (int i = 1; i <= n; i++) {
			temp = (temp + (i * 5));
			//System.out.println(temp);

			if (temp <= timeLeft)
				count++;
		}
		System.out.println(count);
	}
}
