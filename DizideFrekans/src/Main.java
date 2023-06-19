import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
	int[] dizi = {10,20,20,50,10,20,5,20,50,40,50};
	ArrayList<Integer> array = new ArrayList<>();

	int count=0;
	for (int el : dizi) {
		if(!array.contains(el)) {
			for(int i=0;i<dizi.length;i++) {
				if(dizi[i]==el) {
					count++;
					array.add(dizi[i]);
				}
			}
			System.out.println(el + " sayısı " + count + " kere tekrar edildi.");
			count=0;
		}
		
	}
	
}
}
