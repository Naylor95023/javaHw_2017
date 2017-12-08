package HomeWork_Ch06;

/*
 * 撰寫一個長方形方法，可以用*印出實體圖形
 */

//長方形
class Rectangle {
	private int _width;
	private int _height;
	//建構
	Rectangle(int w, int h){
		this._height = h;
		this._width  = w;
	}
	//以*印出實體寬高
	public void _starSquare(){
		for(int i = 0; i < _width; i++){
			for(int j = 0; j < _height; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	 public void _setSize(int w, int h){
		this._height = h;
		this._width  = w;
	}
}

//main
public class Question1 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 10);
		r._starSquare();
		
		
		Rectangle r2 = r;
		r2._setSize(3, 2);
		
		r._starSquare();
	}
}

/*
//不是複製行為
		Rectangle r2 = r;
		r2._setSize(3, 2);
		
		r._starSquare();
		*/


//Rectangle r2 = r;
		//r2._setSize(3, 2);
