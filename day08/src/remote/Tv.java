package remote;

public class Tv implements Remote {  //Remote라는 기능을 티비에 탑재

	@Override
	public void turnOn() {
		System.out.println("Turn On TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off TV");
	}

}
