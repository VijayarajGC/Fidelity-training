
public class Game
{

    public String name;
    public int maxNumPlayers;


    public Game(String name, int maxNumPlayers)
    {
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }


    @Override
    public String toString()
    {
        return "Game: " + name + ", Max Players: " + maxNumPlayers;
    }
}


class GameWithTimeLimit extends Game
{
    public int timeLimit;


    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit)
    {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }


    @Override
    public String toString()
    {
        return super.toString() + ", Time Limit: " + timeLimit + " minutes";
    }
}


 class Program
{
    public static void main(String[] args)
    {

        Game soccer = new Game("Soccer", 22);
        Game basketball = new Game("Basketball", 10);
        Game cricket = new Game("Cricket", 11);


        GameWithTimeLimit hockey = new GameWithTimeLimit("Hockey", 22, 60);
        GameWithTimeLimit volleyball = new GameWithTimeLimit("Volleyball", 12, 30);

        System.out.println(soccer);
        System.out.println(basketball);
        System.out.println(cricket);
        System.out.println(hockey);
        System.out.println(volleyball);
    }
}
