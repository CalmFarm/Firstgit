package day09;
//직삼각형 가*세/2
 public class Triangle extends Shape {
	
	@Override
	public void area(int x,int y) {
		int j=(x*y)/2;
		System.out.println("직삼각형의 면적 : "+j);
	}
}
