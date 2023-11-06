package static_nonstatic;

public class static_method_example {

	public static void main(String[] args) {
	//classname objectname = new classname();
		
		static_method_example lucky = new static_method_example ();
		lucky.newyork();
		
		static_method_example.dhaka();	
	
		static_method_example sara = new static_method_example ();	
		sara.tom();
		
		static_method_example.jerry();
		
	}

public void newyork() {// non-static method
	
int a = 50;
int b = 60;
int d = a+b;
 System.out.println(d);
	
	
}
public static void dhaka () {
	
double s = 10.56;
double t = 78.25;
double total = s+t;
System.out.println(total);
	
	
}
public void tom () {
char s = 'm';
System.out.println(s);
	
	
}
public static void jerry() {
String jara = "mina jahan";	
System.out.println(jara);	
}

	
	
}
