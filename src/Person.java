public class Person
{
	private String name;
	private Bday birthday;
	
	public Person(String name, Bday birthday ){
		this.name = name;
		this.birthday = birthday;
	}
	
	private void setName(String name){
		this.name = name;
	}
	
	public String Name(){
		return String.format("%s", name);
	}
	
	public String Day(){
		return birthday.BirthDate();
	}
}
