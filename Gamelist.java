package PBO2Sesi9.List;
import java.util.ArrayList;;

public class GameList{
    public static void main(String[] args) {
        Game game1=new Game("Persona 3", "RPG", 100);
        Game game2=new Game("Persona 4 Golden", "RPG", 75);
        Game game3=new Game("Persona 5 Royal", "RPG", 23);
        Game game4=new Game("Sword art Online", "MMORPG", 13);

        ArrayList<Game> GameNya=new ArrayList<Game>();
        GameNya.add(game1);
        GameNya.add(game2);
        GameNya.add(game3);
        GameNya.add(game4);

        for(Game game: GameNya){
            game.infoGame();
        }
    }
}
