package week12;
enum Signal
{
	RED,YELLOW,GREEN
}
class checkSignal
{
	Signal currentSignal;
	public checkSignal(Signal cs)
	{
		this.currentSignal=cs;
	}
	public void makeride()
	{
		switch(currentSignal)
		{
			case RED:
				System.out.print("the signal is RED\n kindly wait until its trun to GREEN");
				break;
			case YELLOW:
				System.out.print("the signal is YELLOW\n kindly wait look aaround and make safe move");
				break;
			case GREEN:
				System.out.print("the signal is GREEN\n have a safe ride");
				break;
		}
	}
}
public class demoEnum {
	public static void main(String []args)
	{
		checkSignal myDrive= new checkSignal(Signal.GREEN);
		myDrive.makeride();
	}

}
