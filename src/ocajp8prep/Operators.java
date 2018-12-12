package ocajp8prep;

import static ocajp8prep.print.out;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int operatorOR = a | b;
		int operatorAND = a & b;
		int operatorXOR = a ^ b;
		int operatorCompliment = ~ a;
		int operatorLeftShift = a << b;
		int operatorRightShift = a >> b;
		int operatorZeroFillRightShift = a >>> b;
		
		
		
		System.out.println(operatorOR);
		System.out.println(operatorAND);
		System.out.println(operatorXOR);
		System.out.println(operatorCompliment);
		System.out.println(operatorLeftShift);
		System.out.println(operatorRightShift);
		System.out.println(operatorZeroFillRightShift);
	}

//	out("i1 Integer(10)) and i2 (Integer(10)) .equals() " , i1.equals(i2));

}
