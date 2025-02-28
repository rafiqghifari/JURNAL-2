import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Toko<T> {
    private List<T> daftarAlatMusik = new ArrayList<>();

    public void tambahAlatMusik(T alatMusik) {
        if (alatMusik instanceof AlatmusikTradisional) {
            for (T i : daftarAlatMusik) {
                if (i instanceof AlatmusikTradisional && ((AlatmusikTradisional) i).getKode().equals(((AlatmusikTradisional) alatMusik).getKode())) {
                    System.out.println("Kode sudah ada! Alat musik tidak ditambahkan.");
                    return;
                }
            }
        } else if (alatMusik instanceof AlatmusikElektronik) {
            for (T i : daftarAlatMusik) {
                if (i instanceof AlatmusikElektronik && ((AlatmusikElektronik) i).getKode().equals(((AlatmusikElektronik) alatMusik).getKode())) {
                    System.out.println("Kode sudah ada! Alat musik tidak ditambahkan.");
                    return;
                }
            }
        }
        daftarAlatMusik.add(alatMusik);
    }

    public void hapusAlatMusik(String kode) {
        daftarAlatMusik.removeIf(i -> {
            if (i instanceof AlatmusikTradisional) {
                return ((AlatmusikTradisional) i).getKode().equals(kode);
            } else if (i instanceof AlatmusikElektronik) {
                return ((AlatmusikElektronik) i).getKode().equals(kode);
            }
            return false;
        });
    }

    public void editAlatMusik(String kode, T alatMusikDiperbarui) {
        for (int i = 0; i < daftarAlatMusik.size(); i++) {
            T alatMusik = daftarAlatMusik.get(i);
            if (alatMusik instanceof AlatmusikTradisional && ((AlatmusikTradisional) alatMusik).getKode().equals(kode)) {
                daftarAlatMusik.set(i, alatMusikDiperbarui);
                return;
            } else if (alatMusik instanceof AlatmusikElektronik && ((AlatmusikElektronik) alatMusik).getKode().equals(kode)) {
                daftarAlatMusik.set(i, alatMusikDiperbarui);
                return;
            }
        }
        System.out.println("Alat musik tidak ditemukan!");
    }

    public void tampilkanAlatMusik() {
        Collections.sort(daftarAlatMusik, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1 instanceof AlatmusikTradisional && o2 instanceof AlatmusikTradisional) {
                    return ((AlatmusikTradisional) o1).getKode().compareTo(((AlatmusikTradisional) o2).getKode());
                } else if (o1 instanceof AlatmusikElektronik && o2 instanceof AlatmusikElektronik) {
                    return ((AlatmusikElektronik) o1).getKode().compareTo(((AlatmusikElektronik) o2).getKode());
                }
                return 0;
            }
        });
        for (T alatMusik : daftarAlatMusik) {
            System.out.println(alatMusik);

        }

        }
    }
