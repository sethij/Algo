package gridwalk;

import java.util.ArrayList;

class coordinates {
	int x;
	int y;

	coordinates(int p, int q) {
		x = p;
		y = q;
	}

	@Override
	public boolean equals(Object obj) {
		return (x == ((coordinates) obj).x && y == ((coordinates) obj).y);
	}

}

public class Solution {
	static int count = 0;
	static int[] posX = { 1, -1, 0, 0 };
	static int[] posY = { 0, 0, 1, -1 };
	static ArrayList<coordinates> al = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("In program");
		gridWalk(0, 0);
		System.out.println(count);
	}

	private static void gridWalk(int x, int y) {

		if (sumOfDigits(x) + sumOfDigits(y) > 19)
			return;

		count++;

		al.add(new coordinates(x, y));

		for (int i = 0; i < 4; i++) {
			coordinates c = new coordinates(x + posX[i], y + posY[i]);
			if (!al.contains(c)) {
				gridWalk(x + posX[i], y + posY[i]);
			}
		}

	}

	private static int sumOfDigits(int x) {
		int y = Math.abs(x);
		int sum = 0;
		while (y > 0) {
			sum += y % 10;
			y /= 10;
		}
		return sum;
	}

}
