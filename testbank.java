
public class testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter v = new Counter();
		Bankaccount ahmet = new Bankaccount();
		v.click();
		ahmet.deposit(300);
		ahmet.deposit(500.89);
		ahmet.withdraw(1000);
		
		Bankaccount lisa = new Bankaccount(400,"$");
		v.click();
		lisa.changecurr("TL");
		lisa.setbalance(-500);
		lisa.display();
		
		double sum; 
		sum = ahmet.getbalance() + lisa.getbalance();
		System.out.println(sum);
		
		System.out.println(v.getvalue());
		
		System.out.println(ahmet);
		System.out.println(lisa);
		
		System.out.println(Bankaccount.getcounter());
	}

}
