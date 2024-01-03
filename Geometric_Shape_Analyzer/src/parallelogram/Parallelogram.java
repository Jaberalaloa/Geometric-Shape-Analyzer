package parallelogram;

import java.lang.Math;

class Parallelogram{

	double side1;
	double side2;
	double angle;

	double getSide1(){
		return side1;

	}

	double getSide2(){

		return side2;

	}

	double getAngle(){

		return angle;

	}


	void setSide1(double side1){

		this.side1 = side1;

	}

	void setSide2(double side2){

		this.side2 = side2;

	}

	void setAngle(double angle){

		this.angle = angle;

	}


	double getArea(){

		double sin = Math.sin(convertToRadians(this.angle));

		double area = side1 * side2 * sin; 

		return area;

	}


	double convertToRadians(double angle){

		double radians = this.angle * Math.PI / 180;

		return radians;

	}


	double getCircumference(){

		return 2*(side1+side2);

	}

	@Override

	public String toString(){

		String output = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+ "Parallelogram:\n"+"Sides: "+side1+", "+side2+"\nAngle between the sides in radians: "+convertToRadians(angle)+"\nArea: "+getArea()+"\nCircumference: "+getCircumference();

		return output;

	}

}

