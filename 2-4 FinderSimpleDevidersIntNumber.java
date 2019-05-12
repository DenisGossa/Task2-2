
public class FinderSimpleDevidersIntNumber {

	
	
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
		final int NUMBER= 4080;
		FinderSimpleDevidersIntNumber finder=new FinderSimpleDevidersIntNumber();
		
		
		for(int i=2;i<NUMBER;i++)
		{  
			if(NUMBER%i==0) {
					if(finder.isASimpleNumber(i)) {
							System.out.println("Simple devider:"+i);
					}
			}
			else continue;
		}
		
		
	}

}
