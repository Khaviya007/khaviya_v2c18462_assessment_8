package strcontain;

public class concls {

	public static void main(String[] args) {
		String s1="sivagopal";
		System.out.println("string contains or not: "+s1.contains("siva"));
		System.out.println("string contains or not: "+s1.contains("Siva"));
		if(s1.contains("siva")) {
			System.out.println("Contain in string");}
			else
				System.out.println("not contained in string");
		if(s1.contains("Siva")) {
			System.out.println("Contain in string");}
			else
				System.out.println("not contained in string");
		}
	}


