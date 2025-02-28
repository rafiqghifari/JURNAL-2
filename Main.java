public class Main {
    public static void main(String[] args) {
        Toko<Object> manajer = new Toko<>();
        
        manajer.tambahAlatMusik(new AlatmusikTradisional("T001", "Angklung", 150000, 10));
        manajer.tambahAlatMusik(new AlatmusikTradisional("T002", "Gamelan", 300000, 5));
        manajer.tambahAlatMusik(new AlatmusikTradisional("T003", "Suling", 50000, 20));
        manajer.tambahAlatMusik(new AlatmusikTradisional("T004", "Kecapi", 200000, 8));
        manajer.tambahAlatMusik(new AlatmusikTradisional("T005", "Rebab", 250000, 6));
        
        manajer.tambahAlatMusik(new AlatmusikElektronik("E001", "Keyboard Digital", 1200000, 15));
        manajer.tambahAlatMusik(new AlatmusikElektronik("E002", "Gitar Elektrik", 800000, 12));
        manajer.tambahAlatMusik(new AlatmusikElektronik("E003", "Drum Elektronik", 2000000, 4));
        manajer.tambahAlatMusik(new AlatmusikElektronik("E004", "Piano Digital", 3000000, 3));
        manajer.tambahAlatMusik(new AlatmusikElektronik("E005", "Synthesizer", 1500000, 5));
        
        System.out.println("Daftar Alat Musik Toko Harmoni:");
        manajer.tampilkanAlatMusik();

    }
}
