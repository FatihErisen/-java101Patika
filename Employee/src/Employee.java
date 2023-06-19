
public class Employee {
	String name;
	int salary, workHours, hireYear;
	
	boolean employeeReg(int salary, int workHours,int hireYear){
		if(salary<0 || salary>100000 || workHours<0 || workHours>60 || hireYear<1960 || hireYear>2023) {
			return false;
		}else {
			return true;
		}
	}
	Employee(String name,int salary, int workHours,int hireYear){
		if(employeeReg(salary, workHours, hireYear)) {
			this.name=name;
			this.salary=salary;
			this.hireYear=hireYear;
			this.workHours=workHours;
			System.out.println("Kayıt başarılı.");
		}else {
			System.out.println("Hatalı giriş yaptınız! Tekrar deneyiniz.");
		}
	}
	double tax() {
		if (this.salary>1000) {
			return this.salary*0.03;
		}
		return 0;
	}
	int bonus() {
		if (this.workHours>40) {
			return (this.workHours-40)*30;
		}
		return 0;
	}
	double salaryIncrease() {
		if((2023-this.hireYear)<10)
			{return this.salary*0.05;}
		else if((2023-this.hireYear)>9 && (2023-this.hireYear)<20) {
			return this.salary*0.1;
		}else {
			return this.salary*0.15;
		}
		
	}
	double netSalary() {
		int bonus =bonus();
		double tax = tax();
		return (this.salary+ bonus - tax);
	}
	@Override
	public String toString() {
		return "Adı\t\t: " + this.name +"\n"
				+"Maaşı\t\t: " + this.salary+"\n"
				+"Çalışma Saati\t: " + this.workHours+"\n"
				+"Vergi\t\t: " + tax()+"\n"
				+"Bonus\t\t: "+ bonus()+"\n"
				+"Maaş Artışı\t: " + salaryIncrease()+"\n"
				+"Zam incesi maaş\t:" + netSalary()+"\n"
				+"Zam sonrası maaş : " + (netSalary()+salaryIncrease())+"\n\n";
	}
}
