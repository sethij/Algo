package nQueens;

import java.util.Scanner;

public class Nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.close();
		int[][] arr = new int[N][N];
		findNQueens(arr, N, 0);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static boolean findNQueens(int[][] arr, int n, int row) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (row >= n)
			return true;

		for (int i = 0; i < n; i++) {
			// System.out.println("Solving for queen "+row +" checking at place
			// "+i);
			if (checkDiagonal(row, i, arr) && checkColumn(row, i, arr)) {
				// Placing queen
				arr[row][i] = 1;
				// System.out.println("Queen "+row+" placed at "+i);
				flag = findNQueens(arr, n, row + 1);
			}
			if (flag)
				break;
			else
				arr[row][i] = 0;
		}
		return flag;

	}

	public static boolean checkDiagonal(int i, int j, int[][] arr) {

		int left = j - 1;
		int right = j + 1;
		int q = i;
		boolean flagLeft = false, flagRight = false;
		while (i > 0 && j < arr.length) {
			// System.out.println("entering for queen diagonal checking "+i);
			if (right < arr.length && arr[i - 1][right] == 1) {
				flagRight = true;
				break;
			}
			if (left >= 0 && arr[i - 1][left] == 1) {
				flagLeft = true;
				break;
			}

			i--;
			left--;
			right++;

		}
		if (flagLeft || flagRight)
			return false;
		// System.out.println("return true for queen "+q+" pos "+j);
		return true;
	}

	public static boolean checkColumn(int i, int j, int[][] arr) {

		while (i >= 0) {
			if (arr[i--][j] == 1)
				return false;
		}
		return true;
	}

}
