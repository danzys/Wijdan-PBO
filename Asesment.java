public class Asesment {
    int idAssesment;
    int idUser;
    int skorStress;
    int skorKebahagiaan;
    String rekomendasi;

    public Asesment(int idAssesment, int idUser, int skorStress, int skorKebahagiaan, String rekomendasi) {
        this.idAssesment = idAssesment;
        this.idUser = idUser;
        this.skorStress = skorStress;
        this.skorKebahagiaan = skorKebahagiaan;
        this.rekomendasi = rekomendasi;
    }

    public void tampilkanInfo () {
        System.out.println("ID ASSEMENT : " + idAssesment);
        System.out.println("ID USER : " + idUser);
        System.out.println("SKOR STRESS : " + skorStress);
        System.out.println("SKOR KEBAHAGIAAN : " + skorKebahagiaan);
        System.out.println("REKOMENDASI : " + rekomendasi);

        System.out.println ();

        System.out.println ("\n");
    }

    public static void main(String [] args) {
    
        Asesment user1 = new Asesment(1001, 101, 20, 80, "Pertahankan pola hidup sehat dan relaksasi rutin");
        Asesment user2 = new Asesment(1002, 102, 55, 45, "Luangkan waktu untuk hobi dan istirahat yang cukup");
        Asesment user3 = new Asesment(1003, 103, 88, 12, "Sangat disarankan untuk berkonsultasi dengan ahli/konselor");

        user1.tampilkanInfo();
        user2.tampilkanInfo();
        user3.tampilkanInfo();
    }
}