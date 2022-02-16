package cpsc2150.MyDeque;
import java.util.List;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class DequeApp
{
    /**
     * Uses an interface (IDeque) to prompt a user
     * whether to use an array or a list implementation
     * and prints out the output using the interface's methods
     *
     * @author          Caleb Elrod and Sydney Shillinglaw
     * @invariants      MAX_LENGTH = 100 and MAX_LENGTH > 0
     *                  0 <= length of myQ < 100
     * @preconditions   [ArrayDeque AND ListDeque must be implemented]
     * @postconditions  userInput = 1 iff q = ArrayDeque()
     *                  userInput = 2 iff q = ListDeque()
     *                  current char = q.deque()
     */
    public static void main(String [] args)
    {
        IDeque q = new ArrayDeque();//initialized early to get rid of compiler warning

        /*
        Prompt  the  user  to  pick  an  implementation  using  the  following
        message:  "Enter  1  for  array  implementation  or  2  for  List
        implementation"

        Your code needs to make sure that they only enter either 1 or 2.
        Re-print the message to prompt the user to enter it again. Once
        you have gotten an answer, use it to initialize q appropriately.
        */

        boolean cont = true;
        Scanner myObj = new Scanner(System.in);
        while(cont) {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            int choice = myObj.nextInt();
            if (choice == 1) {
                q = new ArrayDeque();
                cont = false;
            }
            else if (choice == 2) {
                q = new ListDeque();
                cont = false;
            }
        }

        Character x = 'a';
        q.enqueue(x);
        x = 'f';
        q.enqueue(x);
        x = 't';
        q.enqueue(x);
        x = '0';
        q.enqueue(x);
        x = '$';
        q.enqueue(x);

        //Add  the  code  to  print  the  deque.  After  the  code  is  finished,
        //the deque should still contain all its values in order

        Character temp;
        System.out.print("<");
        for(int i = 0; i < q.length() - 1; i++)
        {
            temp = q.dequeue();
            System.out.print(temp + ", ");
            q.enqueue(temp);
        }
        temp = q.dequeue();
        System.out.println(temp + ">");
        q.enqueue(temp);
    }
}
