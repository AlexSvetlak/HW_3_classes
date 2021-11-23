package svetlak.alex;

public class Games {
    public String title, genre;
    public int price, score;


    public void showGameTitle(){
        System.out.println("Название игры: " + title);
    }

    public void showGamePrice(){
        System.out.println("Стоимость: " + price);
    }

    public void showGameGenre(){
        System.out.println("Жанр: " + genre);
    }

    public void showGameScore(){
        System.out.println("Оценка пользователей: " + score);
    }

    public void countGamePriceDiference(int a, int b){
        int c;
        c = a - b;
        System.out.println("Разница в цене: " + c + "баксов");
    }
}