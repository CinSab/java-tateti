public class IA{
    private Tateti t;
    private String token;
    private String name;
    IA(Tateti t) {
        this.name = "IA";
        this.token = "O";
        this.t = t;
    }
    private int ia(){
        int mov = (int) (Math.random()*(9-1+1)+1);
        return mov;
    }

    public void play() {
            int x = 0;
            int y = 0;
            switch (this.ia()){
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
                    play();
                }
            }else{
                System.out.println("IA turns: ");
                t.showTateti();
            }
    }
}
