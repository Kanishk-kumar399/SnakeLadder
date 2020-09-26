public class SnakeLadderUC7
{
        //constants
        static final int NO_PLAY=0;
        static final int LADDER=1;
        static final int SNAKE=2;
        static final int WIN=100;
        public static int position(int pos)
        {
        int c=0;
        int diceroll=(int)(Math.random()*10)%6+1;
        int option=(int)(Math.random()*10)%3;
        if(option==NO_PLAY)
                pos=pos+0;
        else if(option==LADDER)
                {
                pos=pos+diceroll;
                if(pos>WIN)
                pos=pos-diceroll;
                else 
                c=0;
                return position(pos);
                }
        else
                {
                pos=pos-diceroll;
                if(pos<0)
                pos=0;
                }
        return pos;
        }
        public static void main(String args[])
        {
         int player1pos=0;
         int player2pos=0;
         int initialp1,initialp2,c1=0,c2=0;
         System.out.println("Let the player 1 start the game");
         while(player1pos!=WIN&&player2pos!=WIN)
                {
                player1pos=position(player1pos);
                player2pos=position(player2pos);
                }
        if(player1pos==WIN)
                System.out.println("Player 1 Wins");
        if(player2pos==WIN)
                System.out.println("Player 2 Wins");
        }
}
