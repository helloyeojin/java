package remote;

public class Human {

	public static void main(String[] args) {
		Remote remote = new Tv();   //이 자리에 뭐가 들어오냐에 따라서 사람은 티비를 켤 수도 오디오를 켤 수도 있음 
		// Remote remote = new Audio();
		remote.turnOff();
		remote.turnOn();

	}

}
