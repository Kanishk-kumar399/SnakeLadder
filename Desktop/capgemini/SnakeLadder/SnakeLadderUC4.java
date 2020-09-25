public class SnakeLadderUC4
{
	//constants
	static final int NO_PLAY=0;
	static final int LADDER=1;
	static final int SNAKE=2;
	static final int WIN=100;
	public static  void main(String args[])
	{
	int pos=0;
	while(pos!=WIN)
	{
	int diceroll=(int)(Math.random()*10)%6+1;
	int option=(int)(Math.random()*10)%3;
	if(option==NO_PLAY)
		pos=pos+0;
	else if(option==LADDER)
		pos=pos+diceroll;
	else
		{
		pos=pos-diceroll;
		if(pos<0)
		pos=0;
		}
	}
	System.out.println("The Game is On");
	}
}
