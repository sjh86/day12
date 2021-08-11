package day12_OOP;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat s =
				new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
			
	String str = s.format(time);
	System.out.println(str);
	
	Date d = new Date();
	System.out.println("date : "+d);
		
	}

}
