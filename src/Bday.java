public class Bday
{
	private int day, month, year;
	
	public Bday(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String BirthDate(){
		return String.format("%d/%d/%d", day, month, year); 
	}
	
}
