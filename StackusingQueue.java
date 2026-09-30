import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue
{
  public static void main(String args[])
  {
    Queue queue1 = new LinkedList<>();

    queue1.add(1);
    queue1.add(2);
    queue1.add(3);
    queue1.add(4);

    System.out.println(queue1);

    LinkedList list1 = (LinkedList<Integer>) queue1;
    for ( int e = list1.size()-2 ; e>=0 ; e-- )
    {
      queue1.add(list1.get(e));
    }

    for(int i = 1 ; i<=queue1.size()-1 ;i++)
    {
      queue1.poll();
    }

    System.out.println(queue1);


  }
}
