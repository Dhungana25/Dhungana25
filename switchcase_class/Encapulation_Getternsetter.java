package switchcase_class;
class Sensitive_Information
{
	private String username= "customer@info.com"; //private access specifier we will not be able to access.//global variable
     public void setusername(String un) { //un is a local variable
    	this.username=un; //assign the value of local to globle
     }
     public String getusername()
     {
    	 return username;
    	 
     }
     private int age=18;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     
}

public class Encapulation_Getternsetter {

	public static void main(String[] args) {
		Sensitive_Information s1=new Sensitive_Information();
		s1.setusername("sarmila.mehta73@gmail.com");
		System.out.println(s1.getusername());
		s1.setAge(40);
		System.out.println(s1.getAge());

	}

}
