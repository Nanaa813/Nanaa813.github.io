<?php
class Mahasiswa {
    public $nama;
    public $nim;
    public $jurusan;

    public function __construct($nama, $nim, $jurusan) {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->jurusan = $jurusan;
    }

    public function tampilkanInfo() {
        echo "Nama: $this->nama, NIM: $this->nim, Jurusan: $this->jurusan <br>";
    }
}

// Objek
$mhs1 = new Mahasiswa("Rina", "231234567", "Informatika");
$mhs2 = new Mahasiswa("Budi", "231234568", "Sistem Informasi");
$mhs3 = new Mahasiswa("Sari", "231234569", "Teknik Komputer");

$mhs1->tampilkanInfo();
$mhs2->tampilkanInfo();
$mhs3->tampilkanInfo();
?>
