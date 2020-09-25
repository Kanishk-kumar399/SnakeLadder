public class SnakeLadder
{
	//constants
	static final int NO_PLAY=0;
	static final int LADDER=1;
	static final int SNAKE=2;
	public static  void main(String args[])
	{
	int pos=0;
	int diceroll=(int)(Math.random()*10)%6+1;
	int option=(int)(Math.random()*10)%3;
	if(option==NO_PLAY)
		pos=pos+0;
	else if(option==LADDER)
		pos=pos+diceroll;
	else
		pos=pos-diceroll;
	System.out.println("The Player Position is "+pos+" for the DiceRoll of "+diceroll);
	}
}
