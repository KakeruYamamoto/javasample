package jp.co.f1.superintro.ch08;
import java.util.Scanner;
public class HighAndLowS04 {

	public static void main(String[] args) {
		String title = "* High & Low *";
		String asterisk_box = "**************";
		String new_line = System.lineSeparator();
		int num = (int)(Math.random()*9)+1;
		String asterisk_topAndUnder = "***** *****";
		String asterisk_middle1 =     "*   * * * *";
		String asterisk_middle2 =     "* " + num + " * * * *";



		System.out.println(asterisk_box);
		System.out.println(title);
		System.out.println(asterisk_box);

		System.out.println(new_line + "[問題表示]");

		Scanner sc = new Scanner(System.in);

		System.out.print("High  or  Low ?(h/l) >");
	    String select = sc.nextLine();

		if (select.equals("h")) {
		  System.out.println("→Highを選択しました。");
		}else{
		  System.out.println("→Lowを選択しました。");
		}



		System.out.println(asterisk_topAndUnder);
		System.out.println(asterisk_middle1);
		System.out.println(asterisk_middle2);
		System.out.println(asterisk_middle1);
		System.out.println(asterisk_topAndUnder);
		System.out.println(new_line + "-ゲーム終了-");
	}

}
