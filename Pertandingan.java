package praquiz;

public class Pertandingan {
	
	public static void mulaiPertandingan(Tim tim1, Tim tim2) {
		tim1.setMatch(1);
		tim2.setMatch(1);
		tim1.setSkorPertandingan(Main.random.nextInt(15));
		tim2.setSkorPertandingan(Main.random.nextInt(15));
		
		System.out.print(tim1.getNamaTim() + " (" + tim1.getSkorPertandingan() + ") "
				+ "VS " + tim2.getNamaTim() + " (" + tim2.getSkorPertandingan() + ") ");

		if (tim1.getSkorPertandingan() > tim2.getSkorPertandingan()) {
			System.out.println("Pemenangnya adalah " + tim1.getNamaTim());
			tim1.setSkorLiga(3);
		} else if (tim1.getSkorPertandingan() < tim2.getSkorPertandingan()) {
			System.out.println("Pemenangnya adalah " + tim2.getNamaTim());
			tim2.setSkorLiga(3);
		} else {
			System.out.println("Pertandingan Antara " + tim1.getNamaTim() + " melawan " + tim2.getNamaTim() +" Berakhir Seri");
			tim1.setSkorLiga(1);
			tim2.setSkorLiga(1);
		}
		
	}
	
}
