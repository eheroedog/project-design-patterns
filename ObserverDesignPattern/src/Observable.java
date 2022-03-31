
public interface Observable {
	
	void attach(Observer observer);
	void detach(Observer observer);
	void notify(String title);

}
