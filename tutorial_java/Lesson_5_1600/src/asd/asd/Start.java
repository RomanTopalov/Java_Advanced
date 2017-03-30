package asd.asd;

import java.util.Arrays;

public class Start {
	public static void main(String[] args) {
		int[] asd = { 1, 2, 3, 4, 5, 6, 47, 8 };
		int [] qwe = revPrintArray(asd);
		System.out.println(Arrays.toString(qwe));
		double db = retInt(100);
		System.out.println();
		System.out.println(db);
		
		String userName = "asdas";
		System.out.println(myEndsWith(userName, 's'));
		
//		boolean b = myEndsWith(userName, 's');
		
		if(myEndsWith(userName, 's')){
			System.out.println("winner");
		}
		
		String s = replacer("hello", 'l', '$');
		System.out.println(s);
	}// ******main******

	public static double retInt(int sum) {
		double sumPDV = sum * 1.2;
		return sumPDV;
	}

	public static int[] revPrintArray(int[] asd) {
		int[] dfg = new int[asd.length];
		for (int i = 0; i < dfg.length; i++) {
			dfg[asd.length - 1 - i] = asd[i];
		}
		return dfg;
	}

	public static boolean myEndsWith(String chek, char sfx) {
		char[] chArray = chek.toCharArray();
		if (chArray[chArray.length - 1] == sfx) {
			return true;
		}
		return false;
	}

//String srt= replacer("hello",'l','$'); // srt = "he$$o";
	
	public static String replacer(String str,char c1, char c2){
		char [] cArr = str.toCharArray();
		String ret = "";
		for (int i = 0; i < cArr.length; i++) {
			if(cArr[i]==c1){
				cArr[i] = c2;
				ret = ret + cArr[i];
			}else{
				ret = ret + cArr[i];
			}
		}
		return ret;
	} 
	
}
