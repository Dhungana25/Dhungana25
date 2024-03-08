package fifteenclass;
//Assignment36 Ab batch 39
public class Practice_Methodover {
	int age; // 0
	String name; //null
	double salary; //0.0
	void add(int age, String name, double salary)
	{this.age=age; //assigning the value of local variable to globle vairable. it can be used only in nonstatuc method
	this.name=name;
	this.salary=salary;
	
		}
	public static void main(String[] args) {
		Practice_Methodover p1=new Practice_Methodover();
		//p1.add(24, "siya", 7869);
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.salary);

	}

}
