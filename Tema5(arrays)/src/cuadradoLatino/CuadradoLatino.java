package cuadradoLatino;

import java.util.Arrays;

public class CuadradoLatino {

	public static void main(String[] args) {

		int[][] matriz = new int[9][9];
		int k,f;
		for (int i = 0; i < matriz.length; i++) {
			k = i - 1;
			f = 0;

			for (int j = 0; j < matriz.length; j++) {
				if (j < i) {
					matriz[i][j] = matriz.length - k;
					k--;
				} else {
					f++;
					matriz[i][j] = f;
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
