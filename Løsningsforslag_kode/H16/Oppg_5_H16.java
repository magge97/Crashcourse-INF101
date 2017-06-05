// Oppgave 5
public interface IQueue<T> {

  /**
  * Remove the next element from the queue.
  * @return the removed element from the queue
  */
  T remove();

  /**
  * Add element to the queue.
  * @param element
  *           Element to be added to the queue.
  */
  void add(T element);

  /**
  * @return number of elements in the queue
  */
  int size();

}
