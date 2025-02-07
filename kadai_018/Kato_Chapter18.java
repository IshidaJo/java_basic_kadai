package kadai_018;

public abstract class Kato_Chapter18 {
	public final String familyName = "加藤";
	public String givenName;
	public final String address = "東京都中野区〇×";

	// 親クラスメソッド
	// 共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	// 個別の紹介を出力
	public abstract void eachIntroduce();

	// 紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
