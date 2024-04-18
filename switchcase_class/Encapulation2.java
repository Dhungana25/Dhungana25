package switchcase_class;
class Amazonlogin
{
	private int age=20;
	private String un="studentinfo@gmail.com";
	private String pwd="sarmila@45";
	private int otp=123;
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age; //if we want the get the set value we can use return keyword (void will have to change to return type
	}
	public void setun(String username)
	{
		this.un=username;
		
	}
	public String getun() {
		return un;
	}
	public void setpwd(String password)
	{
		this.pwd=password;
	}
	public String getpwd() {
		return pwd;
		
	}
	public void setotp(int otp) {
		this.otp=otp;
		
	}
	public int getotp()
	{
		return otp;
		
	}
}

public class Encapulation2 {

	public static void main(String[] args) {
		Amazonlogin a1=new Amazonlogin();
		a1.setage(86);
		System.out.println(a1.getage());
		a1.setun("karuna65@gmai.com");
		System.out.println(a1.getun());
		a1.setpwd("earth@123");
		System.out.println(a1.getpwd());
        a1.setotp(2345);
        System.out.println(a1.getotp());
	}

}
