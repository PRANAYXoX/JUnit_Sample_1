package my.StringWorks;

public class StringWork {
	
	public String[] splitter(String name) {
		
		String[] result=name.split(" ");
		return result;
	}
	
	public String truncater(String str,int startIndex) {
		
		String result=str.substring(startIndex);
		System.out.print(result);
		return result;
	}
	
	static public void main(String[] args) {
		System.out.print("\nMAIN METHOD!");
		StringWork obj=new StringWork();
		//obj.splitter("PRANAY RANJAN");
		//obj.truncater("HamBurger", 3);
	}

}
