<?php
class BankAccount {
    private $accountNumber;
    private $balance;

    public function __construct($accountNumber, $balance) {
        $this->accountNumber = $accountNumber;
        $this->balance = $balance;
    }

    public function deposit($amount) {
        $this->balance += $amount;
    }

    public function withdraw($amount) {
        if ($amount <= $this->balance) {
            $this->balance -= $amount;
        } else {
            echo "Saldo tidak cukup.<br>";
        }
    }

    public function getBalance() {
        return $this->balance;
    }
}

// Contoh penggunaan
$akun = new BankAccount("123456789", 500000);
$akun->deposit(200000);
$akun->withdraw(100000);
echo "Saldo sekarang: " . $akun->getBalance();
?>
