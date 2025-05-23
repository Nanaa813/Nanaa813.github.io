import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LihatDataDosen {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/akademik"; // pastikan nama DB = akademik
        String user = "root"; // ganti kalau user DB kamu beda
        String pass = "";     // ganti juga kalau kamu pakai password

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Koneksi ke database
            Connection conn = DriverManager.getConnection(url, user, pass);

            // Buat statement
            Statement stmt = conn.createStatement();

            // Query JOIN antara dosen dan jurusan
            String query = "SELECT d.nidn, d.nama, d.email, d.gaji, j.nama_jur " +
                           "FROM dosen d " +
                           "JOIN jurusan j ON d.kode_jur = j.kode_jur";

            ResultSet rs = stmt.executeQuery(query);

            // Tampilkan hasil
            while (rs.next()) {
                int nidn = rs.getInt("nidn");
                String nama = rs.getString("nama");
                String email = rs.getString("email");
                int gaji = rs.getInt("gaji");
                String namaJur = rs.getString("nama_jur");

                System.out.println("NIDN: " + nidn);
                System.out.println("Nama: " + nama);
                System.out.println("Email: " + email);
                System.out.println("Gaji: " + gaji);
                System.out.println("Jurusan: " + namaJur);
                System.out.println("---------------");
            }

            // Tutup resource
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
