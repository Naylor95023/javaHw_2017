package HomeWork_Ch06;

import java.util.Scanner;

//
class Handler {
	private int _max = Integer.MIN_VALUE;
	private int _min = Integer.MAX_VALUE;
	private int _count;
	private int _total;
	//�έp�`�M�B�ƶq�A�P�_�O�_�̤j�̤p
	public void _handlString(String s) {
		int temp = Integer.parseInt(s);
		_total += temp;
		_count ++;
		_findMax(temp);
		_findMin(temp);
	}
	//����̤j��
	public void _findMax(int n) {
		if(n > _max)
			_max = n;
	}
	//����̤p��
	public void _findMin(int n) {
		if(n < _min)
			_min = n;
	}
	//���̤j��
	public int _getMax() {
		return _max;
	}
	//���̤p��
	public int _getMin() {
		return _min;
	}
	//���`�M
	public int _getTotal() {
		return _total;
	}
	//��������
	public double _getAve() {
		return (_total / _count);
	}
	
}

public class Question5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Handler handl = new Handler();
		String s = scan.next();
		
		//����quit���}�A�_�h�i�J�[�`�B�z
		while (!s.equals("quit")){
			handl._handlString(s);
			s = scan.next();
		}
		scan.close();
		//�L�X
		System.out.println("�`�M    : " + handl._getTotal());
		System.out.println("������ : " + handl._getAve());
		System.out.println("�̤j�� : " + handl._getMax());
		System.out.println("�̤p�� : " + handl._getMin());
	}

}
