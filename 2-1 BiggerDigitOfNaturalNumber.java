
public class BiggerDigitOfNaturalNumber {
			
	private int findBiggerOfDigit(int number) {
		int maxvalue,valueofcurrentdigit,valueofnextdigit;
		
		if(number<0) {
			number=-number;
		};
			
		valueofcurrentdigit=number%10;
		maxvalue=valueofcurrentdigit;
		number/=10;
		
		while(number>0) {
			valueofnextdigit=number%10;
			if(valueofnextdigit>maxvalue) {
				maxvalue=valueofnextdigit;
			};
			valueofcurrentdigit=valueofnextdigit;
			number/=10;
		}
			return maxvalue;
	}
	

	public static void main(String[] args) {
		final int VAR=23415132;
			
		BiggerDigitOfNaturalNumber tobj=new BiggerDigitOfNaturalNumber();
			
		System.out.println("Biggest:"+ tobj.findBiggerOfDigit(VAR));
	}

}


