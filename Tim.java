package praquiz;

public class Tim {
	private String namaTim;
	private int jumlahPemain;
	private int skorLiga;
	private int skorPertandingan;
	private int match;
	public Tim(String namaTim, int jumlahPemain) {
		super();
		this.namaTim = namaTim;
		this.jumlahPemain = jumlahPemain;
		this.skorLiga = 0;
		this.skorPertandingan = 0;
		this.match = 0;
	}
	public String getNamaTim() {
		return namaTim;
	}
	public int getSkorLiga() {
		return skorLiga;
	}
	public void setSkorLiga(int skorLiga) {
		this.skorLiga += skorLiga;
	}
	public int getSkorPertandingan() {
		return skorPertandingan;
	}
	public void setSkorPertandingan(int skorPertandingan) {
		this.skorPertandingan = skorPertandingan;
	}
	public int getMatch() {
		return match;
	}
	public void setMatch(int pertandinganKe) {
		this.match += pertandinganKe;
	}
}
