
public class FriendlyNumbers {

	public static void main(String[] args) {
		final int MINBOUNDER=1;
		final int MAXBOUNDER=20000;
		
		/*формируем число в цикле*/
		
		for(int var=MINBOUNDER;var<MAXBOUNDER;++var) {
				int firstnum=var;
				int sumofdeviders1number=0;
				int sumofdeviders2number=0;
		
		/*разложить на делители 1 num*/
				for(int i=1;i<firstnum;i++) {
									if(firstnum%i==0) {
											/*посчитать сумму делителей*/
											sumofdeviders1number+=i;
											continue;
									} 
				}
				if(sumofdeviders1number==firstnum) {
							continue;
				}/*пропустить 6;28*/
		
		
		/* получили второе число (сумма делителей 1 num)*/
				int secondnum=sumofdeviders1number;
				for(int i=1;i<secondnum;i++) {
									if(secondnum%i==0) {
											//посчитать сумму делителей	
											sumofdeviders2number+=i;
											continue;
									} 
		}
		/*сравнили значения*/
		if(sumofdeviders2number==firstnum) {
			System.out.println(firstnum +" "+sumofdeviders1number+" -Friends numbers");
		
		}
		
		
		}
		
		
		System.out.println("End");
		
	}

}
