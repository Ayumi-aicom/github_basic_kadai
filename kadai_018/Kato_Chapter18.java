package kadai_018;

//これが親クラス

abstract public  class Kato_Chapter18{
//	姓を表すフィールド
	public String familyName="加藤";
//名を表すフィールド
	public String givenName="";
//	住所を表すフィールド
	public String address="東京都中野区〇×";
	
	public void setGivenName(String name) {
		this.givenName= name;
	}
	
	

	public void commonIntroduce() {
//		共通の紹介を出力
	    System.out.println("名前は"+familyName+this.givenName+"です");
	    System.out.println("住所は"+address+"です");
	}
	
 public abstract void eachIntroduce();

 public void  execIntroduce() {
	 
	 commonIntroduce();
	 eachIntroduce();
 }
}


