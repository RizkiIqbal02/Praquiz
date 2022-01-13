package praquiz;

import java.util.Arrays;

public class Liga {
	private Tim tim1 = new Tim("Persib Bandung", 15);
	private Tim tim2 = new Tim("Arema Malang", 15);
	private Tim tim3 = new Tim("Real Madrid", 15);
	private Tim tim4 = new Tim("Juventus", 15);
	private Tim tim5 = new Tim("Barcelona", 15);
	private Tim tim6 = new Tim("Arsenal", 15);
	private Tim[] tims = new Tim[6];
	public void main() {
		tims();
		for (int i = 0; i < 40; i++) {
			mulaiLiga(tims);
			System.out.println("____________________________________________________________________________________"
					+ "_______________");
		}
		showHasilLiga();
	}
	public void mulaiLiga(Tim[] tims) {
		int inputTim1 = 0;
		int inputTim2 = 0;
		while (inputTim1 == inputTim2) {
				inputTim1 = Main.random.nextInt(6);
				inputTim2 = Main.random.nextInt(6);
			if (this.tims[inputTim1].getMatch() == 6) {
				inputTim1 = Main.random.nextInt(6);
			}  else if (this.tims[inputTim2].getMatch() == 6) {
				inputTim1 = Main.random.nextInt(6);
			}
		}
		Pertandingan.mulaiPertandingan(tims[inputTim1], tims[inputTim2]);
	}
	public void showHasilLiga() {
		int[] topSkor = new int[6];
		for (int i=0; i < tims.length; i++) {
			Tim tim = tims[i];
			topSkor[i] = tim.getSkorLiga();
		}
		Arrays.sort(topSkor);
		System.out.println("urutan");
		for (int i = topSkor.length-1; i >= 0; i--) {
			for (Tim tim : tims) {
				if (tim.getSkorLiga() == topSkor[i]) {
					System.out.println(tim.getNamaTim() + " " + topSkor[i]);
				}
			}
		}

	}
	public void tims() {
		tims[0] = tim1;
	 	tims[1] = tim2;
		tims[2] = tim3;
		tims[3] = tim4;
		tims[4] = tim5;
		tims[5] = tim6;
	}
	
}
