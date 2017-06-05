
public interface IPriorityQueue<T extends Comparable<T>> extends IQueue<T> {

  /**
  * Adds element to queue placed by priority.
  * Priority is dermined by the compareTo()-method.
  *
  * a.compareTo(b) < 0:  a has higher priority than b
  * a.compareTo(b) > 0:  b has higher priority than a
  * a.compareTo(b) == 0: a and b has equal priority
  */
  void add(T element);

}
