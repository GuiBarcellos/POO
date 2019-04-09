import java.util.Calendar;

public class Random {
	
	private long p = 2147483648L;
	private long m = 843314861;
	private long a = 453816693;
	
	private long xi = 1023;
	
	public Random(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		
		this.xi = Calendar.getInstance().getTimeInMillis() % p;

	}
	
	public double getRand(){
		
		xi = (a + m * xi)%p;
		double d = xi;
		return d / p;
	}

	
	public int getIntRand (int max){
		
		double d = getRand() * max;
		return (int) d;
	
	}
	
	public void SetSeed(int j){
		
		xi = j;
	}
	
	
	public Random (int g){
		xi = g;
	}
	

}