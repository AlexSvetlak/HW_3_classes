package Svetlak.Alex;

public class Main {
    public static void main(String[] args) {
        Games rdr = new Games();
        rdr.title = "Red Dead Redemption 2";
        rdr.genre = "action-adventure";
        rdr.price = 55;
        rdr.score = 85;

        Games gta = new Games();
        gta.title = "GTA 5";
        gta.genre = "action-adventure";
        gta.price = 65;
        gta.score = 87;

        Games tes = new Games();
        tes.title = "Skyrim";
        tes.genre = "RPG";
        tes.price = 45;
        tes.score = 90;

        System.out.println("********************");
        rdr.showGameTitle();
        rdr.showGameGenre();
        rdr.showGamePrice();
        rdr.showGameScore();

        System.out.println("********************");
        gta.showGameTitle();
        gta.showGameGenre();
        gta.showGamePrice();
        gta.showGameScore();

        System.out.println("********************");
        tes.showGameTitle();
        tes.showGameGenre();
        tes.showGamePrice();
        tes.showGameScore();

        Games counting = new Games();
        System.out.println("********************");
        counting.countGamePriceDiference(rdr.price, gta.price);
        System.out.println("********************");
        counting.countGamePriceDiference(gta.price, tes.price);
    }
}
