package chap07;

public class ImpeCalculator implements Calculator{
	
	@Override
	public long factorial(long num) {

		long ans =1;
		for(int i=1;i<=num;++i) {
			ans*=i;
		}
		long end = System.currentTimeMillis();

		return ans;
	}
}
