
public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	int year=2021;
	public Employee(String name, int salary, int workHours, int hireYear) {
	
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if(this.salary>1000) {
			double tax=this.salary*=0.03;
			return tax;
		}
		else
			return 0;
			
	}
	public double bonus() {
		if(this.workHours>40) {
			double bonus = (this.workHours-40)*30 ;
			return bonus;
		}
		else {
			return 0;
		}
	}
	public double riseSalary() {
		if(hireYear-year<10 && hireYear-year>0) {
			double riseSalary=this.salary*=5;
			return riseSalary;
		}
		else if (hireYear-year>9 && hireYear-year<20) {
			double riseSalary=this.salary*=10;
			return riseSalary;
		}
		else {
			double riseSalary=this.salary*=15;
			return riseSalary;
		}
		
	}
	public double toplamMaas() {
		double toplamMaas=this.salary-tax()+bonus()+riseSalary();
		return toplamMaas;
	}
	 void print() {
		
		System.out.println("Ad:" + this.name+
				"\nMaaþ: "+this.salary+
				"\nÇalýþma Saati:"+this.workHours+
				"\nBaþlangýç yýlý:"+this.hireYear+
				"\nVergi: "+tax()+
				"\nBonus:"+bonus()+
				"\nMaaþ Artýþý:"+riseSalary()+
				"\nToplam Maaþ:"+toplamMaas());
	}
}
