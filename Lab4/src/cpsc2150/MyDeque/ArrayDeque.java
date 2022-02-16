package cpsc2150.MyDeque;

public class ArrayDeque implements IDeque
{

    /**
     * @author          Caleb Elrod and Sydney Shillinglaw
     * @invariants      MAX_LENGTH = 100 and MAX_LENGTH > 0
     *                  0 <= length of myQ < 100
     * @preconditions   [IDeque is implemented]
     *                  MAX_LENGTH = 100
     * @postconditions  frontChar = first value in array
     *                  lastChar = last value in array
     *                  myLength = length of array
     */

    // where the data is stored. myQ[0] is the front of the deque
    private Character[] myQ;

    // tracks how many items are in the deque
    // also used to find the end of the deque
    private int myLength;

    // complete the class

    /**
     * initializes myQ by setting all values equal to 0
     * @param
     * @return
     */
    public ArrayDeque()
    {
        myQ = new Character[MAX_LENGTH];

        for(int i = 0; i < MAX_LENGTH; i++)
        {
            myQ[i] = '\0';
        }
    }

    /**
     * adds character x to end of array
     * @param x the character being added to array
     * @return void
     */
    @Override
    public void enqueue(Character x)
    {
        myQ[myLength] = x;
        myLength++;
    }

    /**
     * removes front character in array and adjusts array accordingly
     * @param
     * @return frontChar the character at the front of the array
     */
    @Override
    public Character dequeue()
    {
        char frontChar = myQ[0];

        for(int i = 1; i < myLength; i++)
        {
            myQ[i - 1] = myQ[i];
        }
        myLength--;
        return frontChar;
    }

    /**
     * adds character to the front of the array
     * @param x the character being added to array
     * @return void
     */
    @Override
    public void inject(Character x)
    {
        char[] tempArray = new char[myLength];

        for(int i = 0; i < myLength; i++)
        {
            tempArray[i] = myQ[i];
        }
        for(int i = 1; i <= myLength; i++)
        {
            myQ[0] = x;
            myQ[i] = tempArray[i - 1];
        }
        myLength++;
    }

    /**
     * removes and returns the last array value and adjusts array accordingly
     * @param
     * @return lastChar the character that at the end of the array
     */
    @Override
    public Character removeLast()
    {
        return myQ[--myLength];
    }

    /**
     * returns length of array
     * @param
     * @return length the number of characters in array
     */
    @Override
    public int length()
    {
        return myLength;
    }

    /**
     * clears the array
     * @param
     * @return void
     */
    @Override
    public void clear()
    {
        myLength = 0;
    }
}
