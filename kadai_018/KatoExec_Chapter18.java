package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 各子クラスのインスタンスを作成
		KatoTaro_Chapter18 katotaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 katoichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 katohanako = new KatoHanako_Chapter18();
		
		// setGivenNameメソッドを実行
		katotaro.setGivenName("太郎");
		katoichiro.setGivenName("一郎");
		katohanako.setGivenName("花子");
		
		// execIntroduceメソッドを実行
		katotaro.execIntroduce();
		katoichiro.execIntroduce();
		katohanako.execIntroduce();
	}
}
