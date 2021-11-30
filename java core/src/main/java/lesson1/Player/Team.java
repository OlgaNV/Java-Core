package lesson1.Player;


import lesson1.obstacles.swim;

import java.util.Random;

public class Team {

    public Object teamPlayer;
    private String nameTeam = "unknown";
    Player[] Cool = {new Player1("Misha"), new Player2("Borya"), new Player3("Oleg")};
    public Player[] teamAnimal = new Player[4];
    Random random = new Random();
    // Формируем команду
    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(3);
            teamPlayer[i] = Cool[ran];
        }
    }
    // Вывод информации о членах команды
    public void printInformationAboutTheTeam() {
        System.out.println("Team: " + nameTeam);
        for(Player a : teamPlayer) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof swim.swim)
                System.out.println("Swim limit: " + ((swim.swim) a).getSwimLimit());
                    }
        System.out.println();
    }
    // Вывод информации кто прошел дистанцию
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (Player a : teamAnimal){
            if(a.passing){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }

    public <Obstacle> void doIt(Obstacle obstacles) {
    }
}