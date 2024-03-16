import java.io.PrintStream;
import java.lang.String;

public class Course {
    String judul;
    String deskripsi;
    String pengajar;
    String level;
    int harga;


    // Constructor

    public Course(String judul, String deskripsi, String pengajar, String level, int harga) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.pengajar = pengajar;
        this.level = level;
        this.harga = harga;
    }

    //methods
    public void accelerate(){
        System.out.println("accelerate....");
    }
    public void getInfo(){
        System.out.println("===");
        System.out.println("COURSE INFO");
        System.out.println("judul: " + judul);
        System.out.println("deskripsi: " + deskripsi);
        System.out.println("pengajar: " + pengajar);
        System.out.println("level: " + level);
        System.out.println("harga: " + harga);
        System.out.println("===");
    }

}
