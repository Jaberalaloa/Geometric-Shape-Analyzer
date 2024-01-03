package parallelogram;

public class Shapes {

	public static void main(String[] args) {
		Parallelogram pr = new Parallelogram();
		pr.setSide1(5.0);
		pr.setSide2(4.0);
		pr.setAngle(30);
		System.out.println(pr);
		
		Diamond di = new Diamond();
		di.setSide1(5.0);
		di.setAngle(40);
		System.out.println(di);
		
		
		Square sq = new Square();
		sq.setSide1(2.3);
		System.out.println(sq);
		
		Parallelogram pr2 = new Parallelogram();
		pr2.setSide1(2.4);
		pr2.setSide2(6.8);
		pr2.setAngle(25);
		System.out.println(pr2);
		
		Rectangle re = new Rectangle();
		re.setSide1(5.0);
		re.setSide2(4.6);
		System.out.println(re);
	}
}
