package parallelogram;


class Square extends Rectangle{

	@Override

	void setSide2(double side2){ 

		super.side1 = side2;

		super.side2 = side2;

	}

	@Override

	void setSide1(double side1){ 

		super.side1 = side1;

		super.side2 = side1;

	}

	@Override

	public String toString(){

		String output = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+ "Square:\n"+"Side: "+side1+"\nArea: "+getArea()+"\nCircumference: "+getCircumference();

		return output;

	}

}
