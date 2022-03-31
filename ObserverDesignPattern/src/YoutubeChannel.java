import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable{
	
	private List<Observer> channelSubscribers = new ArrayList<>();
	private String lastVideoPosted;
	

	public String getLastVideoPosted() {
		return lastVideoPosted;
	}

	@Override
	public void attach(Observer obsserver) {
		channelSubscribers.add(obsserver);
		
	}

	@Override
	public void detach(Observer observer) {
		channelSubscribers.remove(observer);
		
	}

	@Override
	public void notify(String title) {
		this.lastVideoPosted = title;
		channelSubscribers.forEach(sub -> sub.update());
	}
	
	void addNewVideo(String title) {
		this.lastVideoPosted = title;
		notify(lastVideoPosted);
		System.out.println("New youtube video added to channel");
	}
	
	

}
