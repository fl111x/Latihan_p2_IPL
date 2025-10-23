package Latihan_OpenClose;

public class StandardCimena extends Cinema1{
    public StandardCimena(double price){
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 10 / 100;
    }
}
