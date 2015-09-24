public abstract class Animal {
    private String name; // All animals(including subclasses) have a name.

    public String getName() { // A getter method that Hippo inherits.
	return name;
    }

    public Animal(String theName) {
	name = theName; // The constructor that takes the name and assigns it the name instance variable.
    }
}
// HFJ_p255
