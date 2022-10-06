package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 3, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean buradaMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				buradaMi = true;
			}
		}
		if (buradaMi) {
			mesajVer("Sayı bu kümededir: "+aranacak);
		} else {
			mesajVer("Sayı bu kümede değildir: "+ aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
