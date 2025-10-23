package Latihan_OpenClose;

public class Main {
    public static void main(String[] args) {
        StandardCimena standardCimena = new StandardCimena(100.0);
        Double adminFee = standardCimena.calculateAdminFee();
        System.out.println(adminFee);
    }
}
