package parallelogram;


class Diamond extends Parallelogram{

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

		String output = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+ "Diamond:\n"+"Side: "+side1+"\nAngle: "+convertToRadians(angle)+"\nArea: "+getArea()+"\nCircumference: "+getCircumference();

		return output;

	}

}
