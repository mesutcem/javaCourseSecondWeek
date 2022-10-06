package reCapDemo_Classes;

public class DortIslem {
	public int Topla(int... i) {
		int toplam = 0;
		for (int sayi : i) {
			toplam += sayi;
		}
		return toplam;
	}

	public int Cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

	public int Carp(int... i) {

		int carpim = 1;
		for (int sayi : i) {
			carpim *= sayi;
		}
		return carpim;
	}
	
	public double Bol(double sayi1, double sayi2) {
		return sayi1/sayi2;
	}

}
