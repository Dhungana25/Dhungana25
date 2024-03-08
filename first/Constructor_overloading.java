package first.project;
//Assignments 19  constructor over loading using 10 constructor
public class Constructor_overloading {
        
	Constructor_overloading(){
		System.out.println("Good day");
	}
	Constructor_overloading(String a){
		System.out.println(" Good night");
	}
	Constructor_overloading(int a, double b, boolean c){
		System.out.println("Have a good day");
	}
	Constructor_overloading(char a,float b){
		System.out.println("Good Morning");
	}
	
	Constructor_overloading(double d,int e){
		System.out.println("Apple");
	}
	Constructor_overloading(int a){
		System.out.println("Fruit");
	}
	Constructor_overloading(boolean b){
		System.out.println("Leaptop");
	}
	Constructor_overloading(double d){
		System.out.println("Application");
	}
	Constructor_overloading(float f){
		System.out.println("Orange");
	}
	Constructor_overloading(char c){
		System.out.println("Nepal");
	}
	public static void main(String[] args) {
	new Constructor_overloading();
	new Constructor_overloading("Day");
	new Constructor_overloading(345,67.9,true);
	new Constructor_overloading('H',43.8f);
	new Constructor_overloading(876,76);
	new Constructor_overloading(890);
	new Constructor_overloading(true);
	new Constructor_overloading(45.98);
	new Constructor_overloading(890.8f);
	new Constructor_overloading('H');
	
	}

}
