public class User {
    protected int idUser;
    protected int idKonten;
    protected int idReward;
    protected String nama;
    protected String email;
    protected String password;
    protected String noTelepon;
    protected String tanggalDaftar;

    public User(int idUser, int idKonten, int idReward, String nama, String email, String password, String noTelepon, String tanggalDaftar) {
        this.idUser = idUser;
        this.idKonten = idKonten;
        this.idReward = idReward;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.noTelepon = noTelepon;
        this.tanggalDaftar = tanggalDaftar;
    }

    public void tampilkanInfo () {
        System.out.println("ID USER : " + idUser);
        System.out.println("ID KONTEN : " + idKonten);
        System.out.println("ID REWARD : " + idReward);
        System.out.println("NAMA : " + nama);
        System.out.println("EMAIL : " + email);
        System.out.println("PASSWORD : " + password);
        System.out.println("NO TELEPON : " + noTelepon);
        System.out.println("TANGGAL DAFTAR : " + tanggalDaftar);
    }
}