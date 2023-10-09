package tuples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Tuple<E> implements Collection<E> {
	
	protected E[] items;
	private int size=0;
	
	public Tuple(E... items) {
		this.items = items;
	}
	
	@Override
	public int size() {
		return items.length;
	}
	
	@Override
	public boolean isEmpty() {
		return items.length == 0;
	}
	
	@Override
	public boolean contains(Object arg0) {
		for(E item : items) {
			if(item.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return index < items.length;
			}
			
			@Override
			public E next() {
				if(!hasNext()) {
					throw new NoSuchElementException();
				}
				return items[index++];
			}
		};
	}
	
	@Override
	public boolean add(E arg0) {
		throw new UnsupportedOperationException("Tuple are immutable");
	}
	
	@Override
	public void clear() {
		size = items.length;
		for(int i=0;i<size;i++) {
			items[i] = null;
		}
		size=0;
	}
	
	public Tuple<E> addPair(Pair<?, ?> pair) {
	    Object[] newItems = new Object[items.length + 2];
	    System.arraycopy(items, 0, newItems, 0, items.length);
	    newItems[items.length] = pair.getFirst();
	    newItems[items.length + 1] = pair.getSecond();
	    return new Tuple<E>((E[]) newItems);
	}


	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object arg0) {
		throw new UnsupportedOperationException("Items cannot be removed");
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public Object[] toArray() {
        return Arrays.copyOf(items, items.length, Object[].class);
    }

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] array) {
	    if (array.length < items.length) {
	        return (T[]) Arrays.copyOf(items, items.length, array.getClass());
	    }

	    // Here, we create a new array of the same type as the input array
	    T[] result = Arrays.copyOf(array, items.length);

	    System.arraycopy(items, 0, result, 0, items.length);
	    if (result.length > items.length) {
	        result[items.length] = null;
	    }
	    return result;
	}
	
	@Override
    public String toString() {
        return Arrays.toString(items);
    }

}
