
public class Student {
	  String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double avarage,fizAverage, kimAverage,matAverage;
	    boolean isPass;
	
	Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya){
		this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
	}
	public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
	public void addPerfNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.perfNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.perfNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.perfNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcFizAvarage() {
        this.fizAverage = (this.fizik.note*0.8+this.fizik.perfNote*0.2);
    }
    public void calcKimAvarage() {
        this.kimAverage = (this.kimya.note*0.7+this.kimya.perfNote*0.3);
    }
    public void calcMatAvarage() {
        this.matAverage = (this.mat.note*0.7+this.mat.perfNote*0.3);
    }
    public void calcAvarage() {
    	calcFizAvarage();
    	calcKimAvarage();
    	calcMatAvarage();
        this.avarage = (this.fizAverage + this.kimAverage + this.matAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu (Yazılı / Sözlü / Ortalama) : " 
        					+ this.mat.note +" / "+this.mat.perfNote + " / " + this.matAverage);
        System.out.println("Fizik Notu (Yazılı / Sözlü / Ortalama) : " 
        					+ this.fizik.note + " / " + this.fizik.perfNote
        					+ " / " + this.fizAverage);
        System.out.println("Kimya Notu (Yazılı / Sözlü / Ortalama) : " + this.kimya.note
        					+ " / " + this.kimya.perfNote + " / "
        					+ this.kimAverage);
    }
}
