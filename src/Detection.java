import java.util.Scanner;

public class Detection {
	static double o2_percentage =  0.93 ;
	static double co2_percentage = 0.04 ; 
	 public void main(int argc,char argv[]) {
		 double o2 ; 
		 double co2 ;
		 Scanner scan = new Scanner(System.in);
	     o2 = scan.nextDouble();/* will be later modified so that be taken from air sensor */
		 co2 = scan.nextDouble();
		 detect_fire(o2 , co2);
		 
	 }
	private void detect_fire(double o2 , double co2) {
		// TODO Auto-generated method stub
		double o2_percent = o2 ; 
		double co2_percent = co2 ; 
		if(o2_percent < o2_percentage && co2_percent > co2_percentage ) {
			pump_water();
		}
		
	}
	private void pump_water() {
		// TODO Auto-generated method stub
		
	}
			 }
