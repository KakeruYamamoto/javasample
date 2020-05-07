package jp.co.f1.superintro.ch08;

public class HighAndLowS02 {

	public static void main(String[] args) {
		String title = "* High & Low *";
		String asterisk_box = "**************";
		String new_line = System.lineSeparator();

		int num = (int)(Math.random()*9)+1;

		System.out.println(asterisk_box);
		System.out.println(title);
		System.out.println(asterisk_box);
		System.out.println("ランダム数値：" + num);
		System.out.println("-ゲーム終了-");
	}

}