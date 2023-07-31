package balancingBrackets;

public class Driver {

	public static void main(String[] args) {

		BalancingBrackets obj = new BalancingBrackets();

		boolean value = obj.isBalanced("({()[]}[])}");

		if (value) {
			System.out.println("The entered String has Balanced Brackets.");
		} else {
			System.out.println("The entered String does not contain Balanced Brackets.");
		}
	}

}
