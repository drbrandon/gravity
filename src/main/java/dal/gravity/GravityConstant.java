package dal.gravity;

public class GravityConstant implements GravityModel{
	private double Gravity;
	
	public GravityConstant(){
		Gravity = 9.80665;
	}
	public GravityConstant(double g){
		Gravity = g;
	}
	
	public double getGravitationalField(){
		return Gravity;
	}
}