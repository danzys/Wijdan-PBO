public class Jurnal {
    int idJurnal;
    int idUser;
    String mood;
    String catatan;
    String aktivitas;

    public Jurnal(int idJurnal, int idUser, String mood, String catatan, String aktivitas) {
        this.idJurnal = idJurnal;
        this.idUser = idUser;
        this.mood = mood;
        this.catatan = catatan;
        this.aktivitas = aktivitas;
    }

public void tampilkanInfo () {
        System.out.println("ID JURNAL : " + idJurnal);
        System.out.println("ID USER : " + idUser);
        System.out.println("MOOD: " + mood);
        System.out.println("CATATAN: " + catatan);
        System.out.println("AKTIVITAS : " + aktivitas);

        System.out.println ();

        System.out.println ("\n");
    }

    public static void main(String [] args) {
        Jurnal user1 = new Jurnal(501, 101, "Bahagia", "Hari ini sangat produktif! Berhasil menyelesaikan tugas koding tanpa banyak error", "Belajar Java & Olahraga");
        Jurnal user2 = new Jurnal(502, 102, "Lelah", "Lelah, Merasa agak burnout karena terlalu banyak mengelola tambang", "Mengerjakan proposal tambang");
        Jurnal user3 = new Jurnal(503, 103, "Cemas", "Sedikit khawatir menghadapi gelombang protes, tapi akan aku tangani", "Review mbg & Meditasi");

        user1.tampilkanInfo();
        user2.tampilkanInfo();
        user3.tampilkanInfo();
    }


}
