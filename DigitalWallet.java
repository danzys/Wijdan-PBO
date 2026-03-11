class digitalWallet {
    private double balance;
    private String owner;

    public digitalWallet(String owner, double initialBalance) {
            this.owner = owner;
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }
        public void Deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println();
                System.out.println("=== TRANSAKSI DEPOSIT ===");
                System.out.println(owner + " melakukan deposit: Rp" + amount);
                System.out.println("Deposit berhasil: Rp" + amount);
                System.out.println("Saldo sekarang: Rp" + balance);
                System.out.println();
            } else {
                System.out.println("Deposit gagal. Jumlah tidak boleh negatif !");
            }
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Penarikan gagal. Saldo tidak cukup");
            } else if (amount <= 0) {
                System.out.println("Penarikan gagal. Jumlah tidak valid");
            } else {
                balance -= amount;
                System.out.println();
                System.out.println("=== MELAKUKAN PENARIKAN ===");
                System.out.println(owner + " melakukan penarikan: Rp" + amount);
                System.out.println("Penarikan berhasil: Rp" + amount);
                System.out.println("Saldo sekarang: Rp" + balance);
                System.out.println();
            }
        }

        public void transfer(digitalWallet targetWallet, double amount) {
        if (amount > balance) {
            System.out.println("Transfer gagal. Saldo tidak cukup.");
        } else if (amount <= 0) {
            System.out.println("Transfer gagal. Jumlah tidak valid.");
        } else {
            System.out.println();
            System.out.println("=== TRANSAKSI TRANSFER ===");
            System.out.println(owner + " melakukan transfer Rp" + amount + " ke " + targetWallet.owner);
            balance -= amount;
            targetWallet.balance += amount;
            System.out.println("Saldo sekarang: Rp" + balance);
            System.out.println();
        }
    }

        public void showInfo() {
            System.out.println();
            System.out.println("=== INFORMASI WALLET ===");
            System.out.println("Owner wallet: " + owner);
            System.out.println("Saldo wallet: Rp" + balance);
            System.out.println();
        }

        public double getBalance() {
            return balance;
        }
    public static void main(String[] args) {

        digitalWallet wallet1 = new digitalWallet("Wijdan", 100000);
        digitalWallet wallet2 = new digitalWallet("Budi", 50000);

        // Informasi awal
        wallet1.showInfo();
        wallet2.showInfo();

        wallet1.Deposit(50000);

        wallet1.withdraw(20000);

        wallet1.transfer(wallet2, 30000);

        wallet1.showInfo();
        wallet2.showInfo();

    }
}