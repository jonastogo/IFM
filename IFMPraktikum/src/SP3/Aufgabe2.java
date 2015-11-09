package SP3;

public class Aufgabe2 {
	public static void main(String[] args) {
		for(int i = 1; i<=3; i++){
			String s = "";
			if(i==3)
				for(int a = 1; a<=2; a++){
					s += "*";
				}
			else
				for(int a = 1; a<=i; a++){
					s+= "*";
				}
			System.out.println(s);
		}
		for(int i = 1; i<=3; i++){
			String s = "";
			if(i%2==0)
				for(int a = 1; a<=3; a++){
					s += "#";
				}
			else
				for(int a = 1; a<=3; a++){
					s += "*";
				}
			System.out.println(s);
		}
		for(int i = 1; i<=4; i++){
			String s = "";
			for(int a = 1; a<=4; a++){
				s+="*";
			}
			System.out.println(s);
		}
	}
}



//Aufgabe4:
	
	/* while true:
	 * 		print (a)
	 * 		a+=1
	 * if a>=10:
	 * 		break 
	 */

//Aufgabe2.1

	/* *
	 * **
	 * ***
	 * ****
	 * ***** 
	 */