package HomeWork_Ch06;

/*
 * �g�@�ӥi�H��r���ର Uni code����k
 */
class Turner {
	//�s���ഫ
	public String _stringToUni(String s){
	    char[] temp = s.toCharArray();
	    StringBuilder uni = new StringBuilder();
	    //�v�@�ഫ��s�J
	    for(int i = 0; i < temp.length; i++){
	      uni.append(_charToUni(temp[i]));
	    }
	    return uni.toString();
	  }
	
	//��Ӧr���� Uni code
	  public String _charToUni(char c){
	    int i = c;
	    String temp = Integer.toHexString(i);
	    StringBuilder uni = new StringBuilder(temp);
	    //�����ɤW 0 
	    while(uni.length() < 4){
	      uni.insert(0,0);
	    }
	    //�̫�ɤW\\u�^��
	    uni.insert(0,"\\u");
	    return uni.toString();
	  }
}

public class Question6 {
	public static void main(String[] args) {
		Turner t = new Turner();
		System.out.println(t._stringToUni("ABC"));
		System.out.println(t._stringToUni("�i�g��"));	
	}
}
