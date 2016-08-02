package day2assignment;

public class day2assignment {

	public static void main(String[] args) {

		String hiWorld = "Hello World";
		int aNumber = 1492;
		boolean dog;
		dog = false;
		String todayDate = "08/02/2016";
		double someMoney = 5.45;
		char aLetter = 'X';

		System.out.println(hiWorld);
		System.out.println("Columbus sailed the world in " + aNumber + ".");
		System.out.println("It is " + dog + " that I have a dog at home.");
		System.out.println("Today is " + todayDate + ".");
		System.out.println("I spent $" + someMoney + " on a cheeseburger.");
		System.out.println(aLetter + " marks the spot.");
		// space before the array
		System.out.println("");

		String[] bandsArray = new String[10];
		bandsArray[0] = "Metallica";
		bandsArray[1] = "Brand New";
		bandsArray[2] = "Chevelle";
		bandsArray[3] = "Foo Fighters";
		bandsArray[4] = "Tool";
		bandsArray[5] = "A Perfect Circle";
		bandsArray[6] = "Highly Suspect";
		bandsArray[7] = "Modest Mouse";
		bandsArray[8] = "Rush";
		bandsArray[9] = "Pink Floyd";

		for (int i = 0; i < bandsArray.length; i++) {

			System.out.println(bandsArray[i]);
		}

	}
}
