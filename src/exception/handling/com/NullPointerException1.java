package exception.handling.com;

public class NullPointerException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println("Exception occurrs.."+e);
		}

	}

}
