package tuples;

public class Pair<A, B> extends Tuple<Object> {

    public Pair(A first, B second) {
        super(first, second);
    }

    public A getFirst() {
        return (A) items[0];
    }

    public B getSecond() {
        return (B) items[1];
    }
    
    @Override
    public boolean add(Object e) {
    	throw new UnsupportedOperationException("It is immutable");
    }
    
    @Override
    public boolean remove(Object e) {
    	throw new UnsupportedOperationException("Items cannot be removed");
    }
    
    public Pair<B, A> swap() {
        return new Pair<>(getSecond(), getFirst());
    }

    public boolean sameType() {
        return getFirst().getClass().equals(getSecond().getClass());
    }

    public Pair<A, B> copy() {
        return new Pair<>(getFirst(), getSecond());
    }
    
    @Override
    public String toString() {
        return "(" + getFirst() + ", " + getSecond() + ")";
    }
}
