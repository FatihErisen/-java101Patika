
public class Main {
	public static void main(String[] args) {
		int bolen;
		boolean asal;
		for (int i=2;i<100;i++) {
			bolen=2;
			asal=true;
			while( bolen < i) {
				if (i%bolen==0) {
					asal=false;
				}
				bolen++;
			}
			if (asal)
				System.out.print(i+ " ");
		}
	}
}
