
import java.util.Random;


// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		Random rand = new Random();
		int random1 = rand.nextInt(0,number);
		int random2 = rand.nextInt(0,number);
		int random3 = rand.nextInt(0,number);
		System.out.println(random1 + " " + random2 + " " + random3);
		int min = Math.min(random1, random2);
		if (min > random3){
			min = random3;
		}
		int max = Math.max(random1, random2);
		if (max < random3){
			max = random3;
		}
		if(min == random1 ){
			if(max == random2){
				System.out.println(random2 + " " + random3 + " " + random1);
			}
			else if(max == random3){
				System.out.println(random3 + " " + random2 + " " + random1);
			}
		}
		if(min == random2 ){
			if(max == random1){
				System.out.println(random1 + " " + random3 + " " + random2);
			}
			else if(max == random3){
				System.out.println(random3 + " " + random1 + " " + random2);
			}
		}
		if(min == random3 ){
			if(max == random2){
				System.out.println(random2 + " " + random1 + " " + random3);
			}
			else if(max == random1){
				System.out.println(random1 + " " + random2 + " " + random3);
			}
		}
	}
}
