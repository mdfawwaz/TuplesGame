package tuples;

public class Tester {
	
	public static void main(String[] args) {
		Pair<Integer,String> pair = new Pair<>(10,"Fawwaz");
		
		//get first and second value
		System.out.println("First: " + pair.getFirst());
		System.out.println("Second: " + pair.getSecond());
		
		//swap variables
		Pair<String,Integer> swappedPair = pair.swap();
		System.out.println("Swapped Pair: " + swappedPair);
		
		//check types
		System.out.println("Same type: " + pair.sameType());
		
		//check copy
		Pair<Integer,String> copiedPair = pair.copy();
		System.out.println("Copied pair: " + copiedPair);
		
	    System.out.println("size: " + pair.size());
	    System.out.println("Contains \"Fawwaz\": " + pair.contains("Fawwaz"));
        System.out.println("Contains \"World\": " + pair.contains("World"));
        

        Tuple<Integer> tuple = new Tuple<>(1, 2, 3);
        Pair<String, Double> pairs = new Pair<>("Hello", 3.14);

        Tuple<Integer> newTuple = tuple.addPair(pairs);

        System.out.println("Original Tuple: " + tuple); // Output: Original Tuple: (1, 2, 3)
        System.out.println("New Tuple: " + newTuple);   // Output: New Tuple: (1, 2, 3, Hello, 3.14)
    }
		
	}
