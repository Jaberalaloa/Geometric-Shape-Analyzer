package parallelogram;

class Rectangle extends Parallelogram{ 

	Rectangle(){

		super.angle = 90;

	}

	@Override

	public String toString(){

		String output = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+ "Rectangle:\n"+"Sides: "+side1+", "+side2+"\nArea: "+getArea()+"\nCircumference: "+getCircumference();

		return output;

	}

}
