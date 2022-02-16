package cpsc2150.MyDeque;
import java.util.*;

/**
 *
 * @invariants 0 <= length <= MAX_LENGTH
 *
 * @Correspondence length = myQ.size()
 */
public class ListDeque implements IDeque {
    // this time store the deque in a list
    // myQ.get(0) is the front of the deque
    private List<Character> myQ;

    /**
     * @pre None
     * @post length = 0, empty ArrayList is initialized
     */
    public ListDeque() {
        myQ = new ArrayList<Character>();
    }

    public void enqueue(Character x) {
        myQ.add(x);
    }

    public Character dequeue() {
        char front = myQ.get(0);
        myQ.remove(0);
        return front;
    }

    public void inject(Character x) {
        myQ.add(0, x);
    }

    public Character removeLast() {
        int lastIndex = (myQ.size() - 1);
        char last = myQ.get(lastIndex);
        myQ.remove(lastIndex);
        return last;
    }

    public int length() {
        return myQ.size();
    }

    public void clear() {
        myQ.clear();
    }
}