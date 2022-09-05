import java.util.Scanner;
public class Player {
    private String token;
    public String name;
    private Tateti t;

    Player(String token, String name, Tateti t){
        this.name = name;
        this.token = token;
        this.t = t;
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Ingress position (1 to 9): " + "Turn: " + token + " " + name);
        int intPut = sc.nextInt();
        switch (intPut){
            case 1: x=0;y=0;break;
            case 2: x=0;y=1;break;
            case 3: x=0;y=2;break;

            case 4: x=1;y=0;break;
            case 5: x=1;y=1;break;
            case 6: x=1;y=2;break;

            case 7: x=2;y=0;break;
            case 8: x=2;y=1;break;
            case 9: x=2;y=2;break;

            default: System.out.println("Wrong value.");
        }
        if(t.putToken(x,y,token) == false){
            if(t.isFull()){
                System.out.println("Place already taken, try again");
                play();
            }
        }else{
           t.showTateti();
        }
    }
}
