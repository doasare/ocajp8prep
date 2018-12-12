package ocajp8prep;

public class print {
	public static void out  (String s) {
		println(s +"\n");
	}
	public static void out  (String s, boolean expected) {
		String format = "%-70s%s%n";
		System.out.printf(format, s, "result: "+ expected);
	}
	public static void out  (String s, String expected) {
		String format = "%-70s%s%n";
		System.out.printf(format, s, "result: "+ expected);
	}
	public static void out  (Object o , String s) {
		print(o.getClass().getName()+" - "+ s);
	}
	public static void title(String c) {
		println(c.toUpperCase());
	}
	private static void println(String s) {
		
		System.out.println(s);
	}
	private static void print(String s) {
		System.out.print(s);
	}
}
