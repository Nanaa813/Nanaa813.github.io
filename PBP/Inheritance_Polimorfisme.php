<?php
class Kendaraan {
    public function jalan() {
        echo "Kendaraan sedang berjalan\n";
    }
}

class Mobil extends Kendaraan {
    public function jalan() {
        echo "Mobil melaju di jalan tol\n";
    }
}

class Motor extends Kendaraan {
    public function jalan() {
        echo "Motor melaju di jalan kecil\n";
    }
}

// Objek dan pemanggilan metode
$mobil = new Mobil();
$motor = new Motor();

$mobil->jalan();
$motor->jalan();
?>
