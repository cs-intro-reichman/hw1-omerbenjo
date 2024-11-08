// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
		String[] parts = time.split(":");
		int hours = Integer.parseInt(parts[0]);
		String minutes = parts[1];
		if (hours>12){
			hours = hours- 12;
			System.out.println(hours+":"+minutes+" PM");
		}
		else{
			System.out.println(hours+":"+minutes+" AM");
		}
	}
}