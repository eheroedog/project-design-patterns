
public class Subscriber implements Observer {
	
	private YoutubeChannel observable;
	
	public Subscriber(YoutubeChannel observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("Nuevo video!!");
		System.out.println(observable.getLastVideoPosted());
		

	}

}
