package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		int toplam = dortIslem.Topla(1,3,25);
		System.out.println(toplam);
		
		int cikar = dortIslem.Cikar(5, 2);
		System.out.println(cikar);
		
		int carp = dortIslem.Carp(2,3,5);
		System.out.println(carp);
		
		//pls dont enter 0 for second parameter (:
		double bol = dortIslem.Bol(10, 4);
		System.out.println(bol);
	}

}
