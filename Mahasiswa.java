public class Mahasiswa extends User {
    private String NIM;
    private String Jurusan;
    private String tingkatStres;

    public Mahasiswa(int idUser, int idKonten, int idReward, String nama, String email, String password, String noTelepon, String tanggalDaftar, String NIM, String Jurusan, String tingkatStres) {
        super(idUser, idKonten, idReward, nama, email, password, noTelepon, tanggalDaftar);

        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.tingkatStres = tingkatStres;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();

    System.out.println("NIM : " + NIM);
    System.out.println("Jurusan : " + Jurusan);
    System.out.println("tingkatStres : " + tingkatStres);
    }
}