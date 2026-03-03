public class Main {

    public static void main(String[] args) {

        User user1 = new Mahasiswa(
                101, 3001, 99,
                "Maxwell", "maxx@gmail.com", "budi123",
                "08123456789", "01-01-2024",
                "23001122", "Kedokteran", "TINGGI"
        );

        user1.tampilkanInfo();
    }
}