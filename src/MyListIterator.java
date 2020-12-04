import java.util.Iterator;

public class MyListIterator<T> implements Iterable<T> {
    T[] elements;
    int nElements;

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) new MyListIterator<T>();
    }

    private class MyListIter<T> implements Iterator<T> {
        int nextElement = 0;

        public boolean hasNext() {
            return nextElement < nElements;
        }

        public T next() {
            T result = (T) elements[nextElement];
            nextElement = nextElement + 1;
            return result;
        }

        public void remove() {
            if (nextElement < nElements - 1) {
                System.arraycopy(elements, nextElement + 1,
                        elements, nextElement, nElements - nextElement - 1);
            }
            nElements--;
        }
    }
}
