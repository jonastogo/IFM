package P4;

import java.awt.Point;

public class Aufgabe3 {
	
	private static Point bruch;
	private static Point var;
	private static Point ergeb;
	
	public static void main(String[] args) {
		bruch = new Point();
		var = new Point();
		ergeb = new Point();
		definieren(bruch, 15,16);
		addieren(bruch, 5);
		multiplizieren(bruch, 5);
		fliesskomma(bruch);
		kehrwert(bruch);
	}
	public static void definieren(Point p, int a, int b){
		p.x = a;
		p.y = b;
		ergeb.x = p.x;
		ergeb.y = p.y;
		kuerzen(ergeb);
		System.out.println(p.x +"/"+ p.y + " wurde eingegeben!");
		System.out.println("Gekürzt mit ggT: " + ergeb.x + "/" + ergeb.y);
	}
	public static void addieren(Point p, int a){
		var.x = a*p.y;
		var.y = p.y;	
		ergeb.x = var.x+p.x;
		ergeb.y = p.y;
		kuerzen(ergeb);
		System.out.println("("+ p.x +"/"+ p.y + ")+"+ a + " = " + (var.x+p.x) + "/" + p.y + " = " + ergeb.x + "/" + ergeb.y);
	}
	public static void multiplizieren(Point p, int a){
		var.x = a*p.y;
		var.y = p.y;
		ergeb.x = var.x*p.x;
		ergeb.y = var.y*p.y;
		kuerzen(ergeb);
		System.out.println("("+ p.x +"/"+ p.y + ")*"+ a + " = " + var.x*p.x +"/"+ var.y*p.y + " = " + ergeb.x + "/" + ergeb.y);
	}
	public static void fliesskomma(Point p){
		double a = p.x;
		double b = p.y;		
		double c = a/b;
		System.out.println(p.x + "/" + p.y +" als Fließkommazahl ist: " + c);
	}
	public static void kehrwert(Point p){
		int a = p.x;
		p.x = p.y;
		p.y = a;
		ergeb.x = p.x;
		ergeb.y = p.y;
		kuerzen(ergeb);
		System.out.println("Der Kehrwert lautet: " + p.x + "/" + p.y);
	}
	public static Point kuerzen(Point p){
		int a = ggT(p.x, p.y);
		p.x /= a;
		p.y /= a;
		return p;
	}
	public static int ggT(int a, int b){
	    int x;
	    do{
	       x = a%b;
	       a = b;
	       b = x;
	    }while(b!=0);
	    return a;
	}
}
