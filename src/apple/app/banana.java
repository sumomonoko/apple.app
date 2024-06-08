package apple.app;

//クラス部分↓↓
public class banana {
//	メソッド部分↓↓
	public static void main(String[] args) {
//		処理部分(※文末にセミコロン)
//		文字列↓↓
	    System.out.println("Hello Java");
//	    数値↓↓
	    System.out.println(17);
//	    ※ダブルクォーテーションで囲むと文字列になる
	    System.out.println("5+3");
//	    足し算
	    System.out.println(5+3);
//	    引き算
	    System.out.println(5-3);
//	    掛け算
	    System.out.println(5*3);
//	    割り算
	    System.out.println(5/3);
//	    割り算の余り
	    System.out.println(5%3);
	    
	    
//		変数↓↓   (intは整数、Stringは文字列のデータ型)
		// int型の変数numberを定義
	    int number;
	    // 変数numberに3を代入
	    number = 3;
	    // 変数numberを出力
	    System.out.println(number);
	    // String型の変数nameを定義
	    String name;
	    // 変数nameに"Wanko"を代入
	    name = "Wanko";
	    // 変数nameを出力
	    System.out.println(name);
	    
	    // 変数の初期化=変数定義と同時に値を代入すること
	    int number1 = 3;
	    System.out.println(number1*3);
	    
	    String text = "プログラミングを勉強しよう";
	    System.out.println("Progateで"+text);
	    
	    // 変数の更新(上書き)  32行目,38行目を変更
	    number = 11;
	    name = "Satou";
	    System.out.println(number);
	    System.out.println(name);
	    
	    
	}
}
