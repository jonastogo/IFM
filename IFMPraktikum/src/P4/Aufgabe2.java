package P4;

public class Aufgabe2 {
	public static void main(String[] args) {
		int[] histo = {1, 3, 4, 5, 8, 13, 0, 7, 2 ,4, 18};
		printHisto(histo);
	}
	
	public static void printHisto(int[] histo){		
		int maximum = 0;
		String h = " ";
		for(int max : histo){
			if(max > maximum)
				maximum = max;	
		}
		for(int a = maximum; a > 0; a--){
			for(int i=0; i<histo.length; i++){
				if(histo[i] < a)
					h += " ";
				else
					h += "x";				
			}
			if(a < 10)
				System.out.println(a+ ":   " + h);
			else 
				System.out.println(a+ ":  " + h);
			h = " ";
		}
	}
}
