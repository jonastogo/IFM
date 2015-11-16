package P6;

public class Mathe {
	final static int[] arr = {22, 24, 20, 17, 10, 23, 4, 9, 19, 10, 17, 21, 1, 16, 19, 5, 0, 21, 1, 6, 14, 18, 20, 2, 1};
	Mathe(){
		
	}
	public static void main(String[] args) {
		printArray(arr);
		System.out.println("Der Durschnitt ist:  " + getAverage(arr));
		System.out.println("Der Median ist:      " + getMedian(arr));
		getUpperQuartile(arr);
		getLowerQuartile(arr);
	}
	
	public static void printArray(final int array[]){
		for(int value : array)
			System.out.print(value+ "  ");
		System.out.println();
	}
	
	public static int getMedian(final int array[]){
		int median = array.length/2;
		return bubblesort(array)[median];
	}
	
	public static double getAverage(final int array[]){
		double all = 0.0;	
		for(int value : array)
			all += (double)(value);
		return all/=array.length;
	}
	
	public static int getUpperQuartile(final int array[]){
		int quart = array.length-array.length/4;
		System.out.print("Das obere Quartil:   ");
		for(int i = quart; i<array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		return quart;	
	}
	public static int getLowerQuartile(final int array[]){
		int quart = (int) (array.length/4);
		System.out.print("Das untere Quartil:  ");
		for(int i = 0; i<quart; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		return quart;
		
	}
	
	public static int[] bubblesort(int[] array) {
	    int temp;	 
	    boolean aenderung = false;
	    for (int j=array.length; j > 1; j--){
	    	System.out.println();
	        for (int i=0; i < j-1; i++) {
	        	if (array[i] > array[i+1]) { 
	        		aenderung = true;
	        		System.out.print("|" + array[i] + "," + array[i+1] +"| ");
	        		temp = array[i];
	        		array[i] = array[i+1];
	        		array[i+1] = temp;
	            } 
	        }
	        System.out.println();
	        if(aenderung)
	        	printArray(array);
	        aenderung = false;
	    }
	    return array;
	}
}
