
public class OptimizedRetangle {
	double side1,side2,diagonal;
	private OptimizedRetangle(double side1,double side2){
		this.side1=side1;
		this.side2=side2;
		this.diagonal=Math.sqrt(side1*side1+side2*side2);
	}
	public static OptimizedRetangle createRetanglebySide(double side1,double side2){
		OptimizedRetangle retangle=new OptimizedRetangle(side1, side2);
		retangle.diagonal=Math.sqrt(side1*side1+side2*side2);
		retangle.side1=side1;
		retangle.side2=side2;
		return retangle;
		
	}
	public static OptimizedRetangle createRetanglebyDiagonal(double side1,double diagonal){
		double s2;
		s2=Math.sqrt(diagonal*diagonal-side1*side1);
		OptimizedRetangle retangle=new OptimizedRetangle(side1, s2);
		retangle.side1=side1;
		retangle.side2=s2;
		retangle.diagonal=diagonal;
		return retangle;
	}

}
