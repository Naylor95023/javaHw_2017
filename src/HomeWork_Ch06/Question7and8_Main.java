package HomeWork_Ch06;

public class Question7and8_Main {
	public static void main(String[] args) {
		//��7�D�A�]�w�ݩʦL�X���n
		MyRectangle R1 = new MyRectangle();
		MyRectangle R2 = new MyRectangle(10, 20);
		R1._setWidth(10);
		R1._setDepth(20);
		
		System.out.println(R1._getArea());
		System.out.println(R2._getArea());
		//�P�_�ݩʬO�_�۵�
		System.out.println(R1.equals(R2));
		System.out.println(R1.hashCode());
		System.out.println(R2.hashCode());
		
		

		
		
	}
}
