
public class CheckerIsASimpleNumber {
	
	private boolean isASimpleNumber(int n){
		
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int devider=2;devider<n;++devider) {
				if((n%devider==0)) {
					return false;
				}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		final int NUMBER=67607;
		CheckerIsASimpleNumber checker=new CheckerIsASimpleNumber();
		
		
			if(checker.isASimpleNumber(NUMBER)) {
				System.out.println(NUMBER+" is simple");
			}
			else {
				System.out.println(NUMBER+" is NOT simple");
			}
		
	}

}
