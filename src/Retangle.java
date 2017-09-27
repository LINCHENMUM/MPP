
public class Retangle {
	double side1, side2,diagonal;
	private Retangle(double side1,double side2){
		this.side1=side1;
		this.side2=side2;
		this.diagonal=Math.sqrt(side1*side1+side2*side2);
	}
	public Retangle(double side1,double diagonal){
		this.side1=side1;
		this.diagonal=diagonal;
		this.side2=Math.sqrt(diagonal*diagonal-side1*side1);
	}

}
