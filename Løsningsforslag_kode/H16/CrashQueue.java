// OPPGAVE 6
public class CrashQueue<T> implements IQueue<T> {

  protected List<T> queue;

  public CrashQueue() {
    queue = new ArrayList<>();
  }

  @Override
  public T remove() {
    // queue is empty: nothing to remove
    if(queue.size() == 0) {
      return null;
    }
    return data.remove(0);

  }

  @Override
  public void add(T element) {
    data.add(element);
  }

  @Override
  public int size() {
    return data.size();
  }



}
