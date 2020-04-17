package basic;

public class Task1 {

	public static void main(String[] args) {
		// 課題の解答をコーディング
		int sum = 0;
		for (int i=0; i<2; i++) {
			if (i == 0) {
				sum = sum + 1;
			} else {
				sum = sum + 2;
			}
		}
		System.out.println("合計：" + sum);
	}

}
