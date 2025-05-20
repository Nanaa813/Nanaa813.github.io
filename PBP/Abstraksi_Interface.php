<?php
abstract class Shape {
    abstract public function area();
}

class Circle extends Shape {
    private $radius;

    public function __construct($radius) {
        $this->radius = $radius;
    }

    public function area() {
        return pi() * $this->radius * $this->radius;
    }
}

class Rectangle extends Shape {
    private $width;
    private $height;

    public function __construct($width, $height) {
        $this->width = $width;
        $this->height = $height;
    }

    public function area() {
        return $this->width * $this->height;
    }
}

// Objek
$lingkaran = new Circle(7);
$persegiPanjang = new Rectangle(4, 6);

echo "Luas Lingkaran: " . $lingkaran->area() . "\n";
echo "Luas Persegi Panjang: " . $persegiPanjang->area();
?>
