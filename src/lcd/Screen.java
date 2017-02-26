package lcd;


// A generic class screen, allowing to define specific screens extending this
// class. In this way, we can easily use new screen with different width with
// our existing code
public abstract class Screen {
	
	public abstract int getWidth();
	
}
