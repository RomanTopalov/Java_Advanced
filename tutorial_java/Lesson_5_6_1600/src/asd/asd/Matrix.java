package asd.asd;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
	private int [] arr;
	
	public Matrix(int size, int bound) {
		this.arr = randomizer(size, bound);
	}

	public Matrix(int[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Matrix [arr=" + Arrays.toString(arr) + "]";
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public static int [] randomizer(int size, int bound){
		int [] tmp = new int [size];
		Random r = new Random();
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = r.nextInt(bound);
		}
		return tmp;
	}
	
	
	
	
	
	
	
}
