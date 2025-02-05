package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	// eachIntroduceメソッドをオーバライドする
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
		System.out.println();
	}
	
	// setGivenNameメソッドを作成
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

}
