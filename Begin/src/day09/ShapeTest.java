package day09;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("각 도형의 면적을 구해 봅시다.");
		System.out.println("가로 : "+7+"세로 : "+8+"*******");
		
		Rectangle rt=new Rectangle();
		rt.area(7, 8);
		
		Triangle tr=new Triangle();
		tr.area(7, 8);
		
		System.out.println("반지름 : "+8);
		//Circle cr=new Circle();
		Circle cr = new SubCircle();
		cr.area(8, 0);
		
		SubCircle sc=new SubCircle();
		sc.area(8);
		((SubCircle)cr).area(8);
		
		System.out.println("배열 for문--------------");
		Shape arr [] = {rt,tr,cr,sc};
		for(int i=0;i<arr.length;i++) {
			if(i<2) {
				arr[i].area(20, 30);
			}else if(i>=2) {
				((SubCircle)arr[i]).area(20);
			}
		}
		System.out.println("*******************");
		for(Shape shape : arr) {
			if(shape instanceof SubCircle) {
				((SubCircle)shape).area(20);
			}else {
				shape.area(20, 30);
			}
			System.out.println("@@@@@@@@@@@");
			
		}
		
	}

}
