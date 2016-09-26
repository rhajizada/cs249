/*  ghp3 part 3
 This program outputs formatted feet to meter and meter to feet conversion table
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class ghp3_3 {
 public static void main(String[] args) {
         System.out.println("Feet\tMeters\t|\tMeters\tFeet");
	        double feet = 1.0;
		     double meters = 20.0;
			 while ( feet < 10.1 && meters  < 65.1 ){
				        System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f\n", feet, footToMeter(feet),meters,meterToFoot(meters));
						 feet+=1;
						 meters+=5;
						}
	}

	public static double footToMeter(double foot){ // converts feet to meter
		double meter = 0.305 * foot;
		return meter;
	 }

	public static double meterToFoot(double meter){ // converts meterr to feet
		double foot = 3.279 * meter;
		return foot;
	}
}
