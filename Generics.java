package Generics;

public class Generics {

	public <T extends Comparable<T>> T maximum(T x, T y, T z) 
	{
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("GENERIC METHOD BASED PROBLEM");
		Generics g = new Generics();
		System.out.println("GREATEST NUMBER IS : " +g.maximum(10,78,45));
		System.out.println("GREATEST WORD IS : " +g.maximum("VARUN","KUMAR","BRIDELABZ"));
		System.out.println("GREATEST FLOAT IS : " +g.maximum(12.5,165.2,145.98));
	}
}