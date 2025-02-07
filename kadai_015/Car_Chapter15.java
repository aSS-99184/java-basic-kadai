
//Step2. 車クラスを作成する
//車クラスは、ギアチェンジすると速度が変わり、走行した時に変わった速度が表示されます。車クラスは、次のフィールドを持ちます。
//アクセス修飾子	データ型	フィールド名	用途						初期値
//private			int	    	gear			1速から5速のギアを表す		1
//private			int  		speed			ギアチェンジ後の速度を表す	10

//アクセス修飾子	戻り値			メソッド名			用途							引数
//public			void			gearChange			ギアの値により速度を変える		int afterGear　←gearChangeメソッドに渡された引数という意味。
//public			void			run					ギアチェンジ後の速度を表示する	無し　←run メソッドに渡された引数という意味 

//メソッドの書き方
//修飾子　戻り値の型　メソッド名(引数の宣言) {
//	処理内容
//}

//ギア(afterGear)   速度(this.speed)
//1				    時速10km
//2				    時速20km
//3					時速30km
//4					時速40km
//5					時速50km
//上記以外のギア	時速10km


package kadai_015;
public class Car_Chapter15 {

	private int gear = 1;		//1速から5速のギアを表す
	private int speed = 10;		//ギアチェンジ後の速度を表す
	
//	コンストラクタ
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear; 
		this.speed = speed;
	}
	
//	ギアチェンジメソッド
	public void gearChange(int afterGear) {
	
//		不正なギア
		if(afterGear < 1 || afterGear > 5) {
			return;
		}
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました" );	
		
//		ギアを変更したときの時速
		switch(afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
			}
		 }
		
		
		public void run() {	
			System.out.println( "速度は時速" + speed + "kmです" );
		
	}
}


//～～～～～～～～学習メモ～～～～～～～～
//if文でelse多い……？車のギアって限りあるからこのままでもいいのかな？
//swich文に書き換える場合↓
//switch(変数名) {
//case 値1  -> 変数が値1に等しいときの処理;
//case 値2  -> 変数が値2に等しいときの処理;
//・・・
//・・・
//default -> 変数がどの値とも一致しないときの処理;
//
//変数はafterGeat

//	ギアを変更したときの時速　
//	this.gear = afterGear;
//	if (afterGear == 1 ) {
//		this.speed = 10;
//	}else if (afterGear == 2 ) {
//		this.speed = 20;
//	}else if (afterGear == 3 ) {
//		this.speed = 30;
//	}else if (afterGear == 4) {
//		this.speed = 40;
//	}else if (afterGear == 5 ) {
//		this.speed = 50;
//	}else {
//		this.speed = 10;
//	    }
//	}
//

	
//	//		if( 条件式A ) {
//条件式Aがtrue（真）のときの処理
//} else if( 条件式B ) {
//条件式Aはfalse（偽）だが、条件式Bはtrue（真）のときの処理
//} else {
//条件式Aも条件式Bもfalse（偽）のときの処理
//}
//	
////	ギアチェンジメソッド
//	public void gearChange(int afterGear) {
////		if( 条件式A ) {
////		    条件式Aがtrue（真）のときの処理
////		} else if( 条件式B ) {
////		    条件式Aはfalse（偽）だが、条件式Bはtrue（真）のときの処理
////		} else {
////		    条件式Aも条件式Bもfalse（偽）のときの処理
////		}
//		
////		不正なギア
//		if(afterGear < 1 || afterGear > 5) {
//			return;
//		}
//		
////		ギアを変更したときの時速　
//		this.gear = afterGear;
//		if (afterGear == 1 ) {
//			this.speed = 10;
//		}else if (afterGear == 2 ) {
//			this.speed = 20;
//		}else if (afterGear == 3 ) {
//			this.speed = 30;
//		}else if (afterGear == 4) {
//			this.speed = 40;
//		}else if (afterGear == 5 ) {
//			this.speed = 50;
//		}else {
//			this.speed = 10;
//		}
//		「ギア1から3に切り替えました」になる。
////		ギア1から3に切り替えました、と表示したい
//			System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました" );	
//		}
//
//		public void run() {	
//			System.out.println( "速度は時速" + speed + "kmです" );
//		
//	}
//}
//調べたこと： 変更前のギア（this.gear）と変更後のギア（afterGear）を表示したい場合、まずその2つの値を出力するためには、ギア変更処理 (this.gear = afterGear;) の前に表示する必要がある。
//ギアチェンジ後にthis.gearの値が変更されるため、ギア変更前の値(ギア１)を表示したいなら、順番を変える。
//System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました"); をギア変更後ではなく、ギア変更前に表示する

//ギア1から3に切り替えました、と表示したい＝ 変更前のギア（this.gear）と変更後のギア（afterGear）を表示したい。
//gearChange(3) が呼ばれる→this.gear の初期値「1」で表示される。






