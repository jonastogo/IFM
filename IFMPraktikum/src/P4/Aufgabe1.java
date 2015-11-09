package P4;

public class Aufgabe1 {
	public static void main(String[] args) {
		int[] mOA = {10, 3, 5, 7, 8, 11, 1, 9, 6 ,2};
		System.out.println(maxOfArray(mOA));
	}
	public static int maxOfArray(int[] mOA){;
		int maximum = 0;
		for(int max : mOA){
			if(max > maximum)
				maximum = max;
		}
		return maximum;
	}
}
