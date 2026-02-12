class SegiEmpat {
    public double panjang;
    public double lebar;

    // Method to set length
    public void setPanjang(double p) {
        panjang = p;
    }

    // Method to calculate area
    public double hitungLuas() {
        return panjang * lebar;
    }
}

// Main class for Testing
public class TestSegiEmpat {
    public static void main(String[] args) {
        // 1.Create Object 
        SegiEmpat kotak = new SegiEmpat();

        // 2. Assign Values
        kotak.setPanjang(10.5);
        kotak.lebar = 5.0;

        // 3. Calculate & Print
        double hasil = kotak.hitungLuas();

        System.out.print1n("Luas Segi Empat: " + hasil);
    }
}