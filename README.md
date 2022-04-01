# Design Patterns
 
 Projects include the following 5 different design Patterns:

 - Strategy
 - Builder
 - Observer
 - Singleton (unconfirmed)
 - Command (unconfirmed)

### Observer-Squeaker
 
 In this project we apply the observer pattern so the followers of a **SqueakerProfile** can be updated when the profile posts a new **squeak** withour the follower need to constantly check for new posts on the profile.

**Profile**
 ```
@Override
	public void notify(Squeak sqk) {
		followers.forEach(fol -> fol.update());
	}
	
	public void newSqueak(String header, String content) {
		history.add(new Squeak(header, content));
		latestSqueak = history.get(history.size()-1);
		notify(latestSqueak);
	}
 ```

 **Follower**
 ```
@Override
	public void update() {
		var sqk = follProf.getLatestSqueak();
		System.out.println("New Squeak from: " + follProf.getProfileName() );
		System.out.println(sqk.getHeader());
	}
 ```

### Strategy-Calculator

 We use the strategy pattern help with the implementation of different operators for our calculator project. This allows us to change the desired behavior at runtime.

Example of operation
 ```
public class Division implements BinaryOperation{

	@Override
	public String getName() {		
		return "/";
	}

	@Override
	public double calculate(double first, double second) {
		return first == 0 || second == 0 ? 0.0 : first / second;
	}
}
 ```

Our program can then select which operation to apply
```
binOp.forEach(x -> System.out.print(x.getName().equals(operator) ? "Result: " + x.calculate(first, second) : ""));
```

 Included in the folder is a JAR file to run the project in terminal.

### Builder-RPGCharacterCreator

 When we create new characters we take advantage of the builder pattern to create an object of our desired character.

 ```
switch (charclass.toLowerCase()) {
			case "rogue":
				myCharacter = new Rogue().setName(name).setRace(race).setGender(gender).setSkills().setAttributes().setClass().build();
				break;
			case "mage":
				myCharacter = new Mage().setName(name).setRace(race).setGender(gender).setSkills().setAttributes().setClass().build();
				break;
 ```

![Created Character](/res/rpgchar.png "Created Character")

 Included in the folder is a JAR file to run the project in terminal.
