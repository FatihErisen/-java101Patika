import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		int empNum;
		Scanner in = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		
		System.out.println("Kayıt yapmak istediğiniz personel sayısını giriniz: ");
		empNum=in.nextInt();
		for(int i=1; i<=empNum;i++) {
			String name;
			int salary, workHours, hireYear;
			System.out.println("Personel Adı : ");
			name=in.next();
			System.out.println("Personel Maaşı : ");
			salary=in.nextInt();
			System.out.println("Haftalık Çalışma Saati : ");
			workHours=in.nextInt();
			System.out.println("İşe Başladığı yıl: ");
			hireYear=in.nextInt();
			Employee emp = new Employee(name, salary, workHours, hireYear);
            if(emp.employeeReg(salary, workHours, hireYear)) {
            	employees.add(emp);
            }else i--;
			
		}
		for (Employee emp : employees) {
            System.out.println(emp);
        }

	}

}
