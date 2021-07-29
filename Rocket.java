import java.util.Scanner;

public class Rocket{
		public static void main(String[] args) {
			System.out.println("Enter the Total Mass:");
			Scanner readinput=new Scanner(System.in);
			float mass = readinput.nextFloat();
			
			System.out.println("Enter the Total Thrust:");
			float thrust = readinput.nextFloat();
			
			float weight = mass*(float)9.8;
			float resultant_force=thrust-weight;
			float acceleration = resultant_force/mass;
			
			System.out.println("Acceleration is "+acceleration+" ms^(-2)");
		}
}