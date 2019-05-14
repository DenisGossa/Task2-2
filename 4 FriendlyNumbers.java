
public class FriendlyNumbers {

	public static void main(String[] args) {
		final int MINBOUNDER=1;
		final int MAXBOUNDER=20000;
		
		/*Formation a first number in cycle*/
		
		for(int var=MINBOUNDER;var<MAXBOUNDER;++var) {
				int firstnum=var;
				int sumofdeviders1number=0;
				int sumofdeviders2number=0;
		
		/*getting devider for 1 num(first number )*/
				for(int i=1;i<firstnum;i++) {
									if(firstnum%i==0) {
											/*getting sum of deviders first number*/
											sumofdeviders1number+=i;
											continue;
									} 
				}
				if(sumofdeviders1number==firstnum) {
							continue;
				}/*except numbers  6 and 28*/
		
		
		/*  the sum of deviders first number is second number)*/
				int secondnum=sumofdeviders1number;
				for(int i=1;i<secondnum;i++) {
									if(secondnum%i==0) {
											/*getting sum of deviders second number*/	
											sumofdeviders2number+=i;
											continue;
									} 
		}
		/**/
		if(sumofdeviders2number==firstnum) {
			System.out.println(firstnum +" "+sumofdeviders1number+" -Friends numbers");
		
		}
		
		
		}
		
		
		System.out.println("End");
		
	}

}
