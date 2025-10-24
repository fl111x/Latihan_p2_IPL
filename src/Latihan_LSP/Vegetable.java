package Latihan_LSP;


import java.util.Date;

public class Vegetable extends  FoodProduct{
    @Override
    String getName() {
        return "Broccolli";
    }

    @Override
    Date getExpirationDate() {
        return new Date();
    }
}
