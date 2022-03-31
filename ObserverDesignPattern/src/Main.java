
public class Main {

	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Subscriber s1 = new Subscriber(channel);
		Subscriber s2 = new Subscriber(channel);
		Subscriber s3 = new Subscriber(channel);
		Subscriber s4 = new Subscriber(channel);
		Subscriber s5 = new Subscriber(channel);
		
		channel.attach(s1);
		channel.attach(s2);
		channel.attach(s3);
		channel.attach(s4);
		channel.attach(s5);
		
		channel.addNewVideo("Eyes Wide Shut");

	}

}
