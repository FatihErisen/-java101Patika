
public class Match {
	Fighter f1,f2;
	int minWeight, maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1=f1;
		this.f2=f2;
		this.maxWeight=maxWeight;
		this.minWeight=minWeight;
	}
	
	void run() {
		int round=1;
		if(isCheck()) {
			while(this.f1.health>0 && this.f2.health>0) {
				System.out.println("**** " +round + ". round ****\n");
				if(firstAttack()) {
					this.f2.health=this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					this.f1.health=this.f2.hit(f1);
					if (isWin()) {
						break;
					}
				}else {
					this.f1.health=this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					this.f2.health=this.f1.hit(f2);
					if (isWin()) {
						break;
					}
				}
				System.out.println(this.f1.name + " sağlığı: " + this.f1.health);
				System.out.println(this.f2.name + " sağlığı: " + this.f2.health + "\n"
						+"_________________________________________" +"\n");
				round++;
				
			}
		}else
			System.out.println("Sporcuların ağırlıkları koşula uymuyor");
	}

	boolean isCheck() {
		return(this.f1.weight>=minWeight && this.f1.weight<=maxWeight) &&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
		
	}
	boolean isWin() {
		if(this.f1.health==0) {
			System.out.println(f2.name + " Kazandı.");
			return true;
		}
		if(this.f2.health==0) {
			System.out.println(f1.name + " Kazandı.");
			return true;
		}
		return false;
	}
	boolean firstAttack () {
        int number = (int)(Math.random()*10);
        if (number <= 5) {
            return true; // if it is true, then f1 will start.
        }
        return false;
    }
	
}
