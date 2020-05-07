package jp.co.f1.superintro.ch08;
import java.util.Scanner;
public class HighAndLowS06 {

	public static void main(String[] args) {

		int left_card = (int)(Math.random()*9)+1;
		int right_card = (int)(Math.random()*9)+1;
		String title = "* High & Low *";
		String asterisk_box = "**************";
		String new_line = System.lineSeparator();

		// カードを片方だけオープンの振る舞い定義
		String asterisk_topAndUnder = "***** *****";
		String asterisk_middle1 =     "*   * * * *";
		String asterisk_middle2 =     "* " + left_card + " * * * *";

		//カードフルオープンの振る舞い定義
		String asterisk_middle_open = "*   * *   *";
		String asterisk_resolt =      "* " + left_card + " *" + " * " + right_card + " *";

		//タイトル
		System.out.println(asterisk_box);
		System.out.println(title);
		System.out.println(asterisk_box);

		//問題表示(クローズ状態)
		System.out.println(new_line + "[問題表示]");
		System.out.println(asterisk_topAndUnder);
		System.out.println(asterisk_middle1);
		System.out.println(asterisk_middle2);
		System.out.println(asterisk_middle1);
		System.out.println(asterisk_topAndUnder);

		// 入力フォーム
		Scanner sc = new Scanner(System.in);
		System.out.print("High  or  Low ?(h/l) >");
		String select = sc.nextLine();
		if (select.equals("h")) {
		  System.out.println("→Highを選択しました。");
		}else{
		  System.out.println("→Lowを選択しました。");
		}

		// 結果表示（フルオープン）
		System.out.println(new_line + "[結果表示]");
		System.out.println(asterisk_topAndUnder);
		System.out.println(asterisk_middle_open);
		System.out.println(asterisk_resolt);
		System.out.println(asterisk_middle_open);
		System.out.println(asterisk_topAndUnder);

		System.out.println(new_line + "-ゲーム終了-");
	}

}
