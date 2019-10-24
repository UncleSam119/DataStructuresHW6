
public class Names {
	private String name;
	private int number;
	private char sex;
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != "")
		this.name = name;
//		else
//			System.out.println("Name cannot be empty");
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number <= 0)
		this.number = number;
//		else
//			System.out.println("Number cannot be negative");
	}
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex == 'M' || sex == 'F')
		this.sex = sex;
//		else
//			System.out.println("Sex can only be 'M' or 'F'");
	}
	
	// 
	
	
	
}
