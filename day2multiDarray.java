package day2assignment;

public class day2multiDarray {

	public static void main(String[] args) {
		
	String[][] favArray = new String[4][3];
	
	favArray[0][0]="Food 1";
	favArray[0][1]="Food 2";
	favArray[0][2]="Food 3";

	favArray[1][0]="Album 1";
	favArray[1][1]="Album 2";
	favArray[1][2]="Album 3";

	favArray[2][0]="Movie 1";
	favArray[2][1]="Movie 2";
	favArray[2][2]="Movie 3";

	favArray[3][0]="Book 1";
	favArray[3][1]="Book 2";
	favArray[3][2]="Book 3";

	for(
	int i = 0;i<4;i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(favArray[i][j] + " ");
		}
		System.out.println("");

	}
	}
}