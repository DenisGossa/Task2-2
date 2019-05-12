
public class CheckerIsNumAPolyndrom {
	private int countOfDigit;
	
	private boolean isNumAPolyndrom(int n1) {
		if(n1==0) {return false;}
		if(n1<0) {
			n1=-n1;
		}
		
		int n2=reversDigitOfNumber(n1);
		System.out.println(n1+" is reversed to "+n2);
		int currentvalueofdigit1,currentvalueofdigit2;
	
		//just simple check digits of num1and num2 for equaling (from end to begin)
	
		while(n1>0) {
			currentvalueofdigit1=n1%10;/*System.out.println("currentvalue1:"+currentvalue1);*/
			currentvalueofdigit2=n2%10;/*System.out.println("currentvalue2:"+currentvalue2);*/
			
			if(currentvalueofdigit1!=currentvalueofdigit2) {
				return false;
			}
			n1/=10;
			n2/=10;
		}
		
	return true;
	} 
	
	private int findCountOfDigit(int n) {
		int countOfDigit = 0;
		for ( ; n > 0 ; n /= 10) {
			++countOfDigit;
		}
		return countOfDigit;
	}
	
	
private int reversDigitOfNumber(int n){
		countOfDigit=findCountOfDigit(n);
		int tmpvar=0;
		int outnumber=0;
		int power=countOfDigit-1;
		int digit=10;
		
	for(;n>0;--power) {
		tmpvar=n%10;
		n/=10;
		outnumber+=tmpvar*Math.pow(digit,power);
	}
	return outnumber;
}
		
	public static void main(String[] args) {
		CheckerIsNumAPolyndrom checker=new CheckerIsNumAPolyndrom();
		
		final int NUMBER=122454221;
				
		if(checker.isNumAPolyndrom(NUMBER)) {System.out.println(NUMBER+" is Polyndrom");}
		else {System.out.println(NUMBER+" is not A Polyndrom");}
		

	}

}
