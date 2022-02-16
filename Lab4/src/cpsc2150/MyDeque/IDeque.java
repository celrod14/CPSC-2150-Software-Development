package cpsc2150.MyDeque;

/**
 * A deque containing characters.
 * A deque is a data structure a double-ended queue that allows you
 * to insert and remove from both ends.
 * This deque is bounded by MAX_LENGTH
 *
 * Initialization ensures: deque contains exactly 0 or more than 0 elements
 *
 * Defines: None
 *
 * Constraints: 0 <= length of self <= MAX_LENGTH
 */

/**
 * @invariant length >= 0 and length <= 100
 */
public interface IDeque {

    public static final int MAX_LENGTH = 100;

    /**
     * Adds x to the end of the deque
     *
     * @param x
     * @pre 0 <= length < 100
     * @post self = #self o <x>
     */
    public void enqueue(Character x);


    /**
     * removes and returns the character at the front of the deque
     *
     * @return character at front of deque
     * @pre 0 < length <= 100
     * @post self = #self, [except first character is removed]
     * @post length = #length - 1
     */
    public Character dequeue();


    /**
     * Adds x to the front of the deque
     *
     * @param x
     * @pre 0 <= length < 100
     * @post self = <x> o #self
     */
    public void inject(Character x);

    /**
     * removes and returns the character at the end of the deque
     *
     * @return character
     * @pre 0 <= length <= 100
     * @post self = #self, [except character is removed]
     * @post length = #length - 1
     */
    public Character removeLast();

    /**
     * returns the number of characters in the deque
     *
     * @return int representing number of characters
     * @pre 0 <= length <= 100
     * @post self = #self
     */
    public int length();

    /**
     * clears the entire deque
     *
     * @pre 0 <= length <= 100
     * @post length = 0
     */
    public void clear();
}