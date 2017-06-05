// OPPGAVE 2b
public static void union(ISet<E> a, ISet<E> b) {

  for (E element : b) {
    if (!a.contains(element)) {
      a.add(element);
    }
  }
}

public static void isect(ISet<E> a, ISet<E> b) {

  for (E element : a) {
    if (!b.contains(element)){
      a.remove(element);
    }
  }
}

public static void diff(ISet<E> a, ISet<E> b) {

  for (E element : a) {
    if (b.contains(element)) {
      a.remove(element);
    }
  }

}
