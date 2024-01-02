public interface collection<E> extends Iterable<E>
  {
int size();
boolean isEmpty();
    boolean contains(object o);
    boolean add(E e);
    boolean remove(object o);
    Iterator<E> iterator();
    object[] toArray();
   t[] toArray(t[] array);
  Stream<E> stream();
    Stream<E> parallelStream();
    boolean containsAll(Collections<E> c);
    boolean addAll(Collection <? extends E>)
    boolean removeAll(Collection<?> c);
    boolean removeIf(predicate <? super E>);
    

    
  }
