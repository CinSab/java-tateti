import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tateti play = new Tateti();
        play.createTateti();
        System.out.println("Tateti --> ");
        System.out.println("Ingress your name: (you are going to be token X)");
        String name = sc.next();
        Player p1 = new Player("X", name, play);
        IA ai = new IA(play);

        while (!play.winner()) {
            if(play.isFull()){
                p1.play();
                if(!play.winner()){
                    ai.play();
                    play.winner();
                    if(play.winner()){
                        System.out.println("The winner is: IA");
                    }
                }else{
                    System.out.println("The winner is: " + p1.getName());
                }
            }else{
                System.out.println("Tie.");
                break;
            }
        }

    }
}
