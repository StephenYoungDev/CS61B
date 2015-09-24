/* super() to invoke superclass constructor. */

public class Duck extends Animal {
    int size;

    public Duck(int newSize) {
	super();// The call to super() must be the first statement in each constructor!
	size = newSize;
    }
}
// HFJ_p253
