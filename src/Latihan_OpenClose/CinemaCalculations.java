package Latihan_OpenClose;

public class CinemaCalculations {
    public Double calculateAdminFee(Cinema1 cinema){
        if(cinema instanceof StandardCimena){
            return ((StandardCimena)cinema).price;
        }else if(cinema instanceof DeluxeCinema){
            return ((DeluxeCinema)cinema).price;
        }else if (cinema instanceof PremiumCinema){
            return ((PremiumCinema)cinema).price;
        }else{
            return 0.0;
        }
    }
}
