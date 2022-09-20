package Generics;

import java.util.Scanner;

public class Generics {

	public <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static <T> void main(String[] args) {
		System.out.println("GENERIC METHOD BASED PROBLEM");
		Generics g = new Generics();
		Scanner a = new Scanner(System.in);
		System.out.println("ENTER THE THREE NUMBER TO FIND LARGEST");
		int X1 = a.nextInt();
		int X2 = a.nextInt();
		int X3 = a.nextInt();

		System.out.println("ENTER THE THREE FLOAT NUMBER TO FIND LARGEST");
		float F1 = a.nextFloat();
		float F2 = a.nextFloat();
		float F3 = a.nextFloat();

		System.out.println("ENTER THE THREE STRING TO FIND LARGEST");
		String S1 = a.next();
		String S2 = a.next();
		String S3 = a.next();
		System.out.println("GREATEST NUMBER IS : " + g.maximum(X1,X2,X2));
		System.out.println("GREATEST FLOAT IS : " + g.maximum(F1,F2,F3));
		System.out.println("GREATEST WORD IS : " + g.maximum(S1,S2,S3));
		
	}
}