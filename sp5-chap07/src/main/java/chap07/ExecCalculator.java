package chap07;

public class ExecCalculator implements Calculator{
	private Calculator delegate;
	
	public ExecCalculator(Calculator calcu) {
		this.delegate=calcu;
	}
	
	@Override
	public long factorial(long num) {
		long start = System.nanoTime();		
		long exec = delegate.factorial(num);
		long end= System.nanoTime();
		System.out.printf("실행시간은 %d 입니다\n", end-start);
		return exec;
	}
}
