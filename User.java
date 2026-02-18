public class User {
    int idUser;
    int idKonten;
    int idReward;
    String nama;
    String email;
    String password;
    String noTelepon;
    String tanggalDaftar;

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

        System.out.println();

        System.out.println("\n");
    }

    public static void main(String [] args) {

        User user1 = new User(101, 3001, 99, "Prabowo Subianto", "prabowo@gmail.com", "Priasawit", "0898712347", "12-02-2024");
        User user2 = new User(102, 3002, 88, "Bahlil Lahadalia", "bahlil@gmail.com", "Manusiatambang", "08527341738", "13-02-2024");
        User user3 = new User(103, 3003, 77, "Dadan Hindayana", "dadan@gmail.com", "Ahliserangga", "08943267894", "14-02-2024");

        user1.tampilkanInfo();
        user2.tampilkanInfo();
        user3.tampilkanInfo();
    }
}