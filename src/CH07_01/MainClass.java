package CH07_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","블랙",10);
		// 생성자를 통해서 부모객체를 초기화
		System.out.println(dmbCellPhone.color);
		dmbCellPhone.bell();
		dmbCellPhone.turnOnDmb();
		
		Square square = new Square(10, 20);
		square.area();
		Triangle triangle = new Triangle(10, 20);
		triangle.area();
		
		int b; //4byte
		byte c = 10; //1byte
		b = c; //대입가능
//		c = b; //대입불가능
		
		
		
	}

}
