// OPPGAVE 8
public class CrashPriorityQueue<T extends Comparable<T>>
                                  extends CrashQueue<T>
                                  implements IPriorityQueue<T> {

  @Override
  public void add(T element) {
    int i = 0;
    while (i < queue.size() && queue.get(i).compareTo(element) < 0) {
      i++;
    }
    queue.add(i, element);
  }

}
