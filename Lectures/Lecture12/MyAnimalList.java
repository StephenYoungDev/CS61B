public class MyAnimalList {

    private Animal[] animals = new Animal[5]; // new array object of type Animal.
    // You cannot make a new instance of an abstract type, but you CAN make an array object declared to HOLD that type.
    private int nextIndex = 0;
    
    public void add(Animal a) {
	if (nextIndex < animals.length) {
	    animals[nextIndex] = a;
	    System.out.println("Animal added at " + nextIndex);
	    nextIndex++;
	}
    }
}
// HFJ_p207
