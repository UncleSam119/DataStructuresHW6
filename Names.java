
public class Names {
	private String name;
	private int number;
	private String sex;
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.equals(""))
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
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex.equals("M") || sex.equals("F"))
			this.sex = sex;
//		else
//			System.out.println("Sex can only be 'M' or 'F'");
	}
	
	public boolean isEqual(String x, String y) {
		if(x.equals(y))
			return true;
		else
			return false;
	}
	
	
	
}
