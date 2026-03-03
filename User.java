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
        System.out.println("Id User : " + idUser);
        System.out.println("Id Konten : " + idKonten);
        System.out.println("Id Reward : " + idReward);
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("Password : *******" );
        System.out.println("No Telepon : " + noTelepon);
        System.out.println("Tanggal Daftar : " + tanggalDaftar);
    }
}