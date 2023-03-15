import java.util.Collection;

public interface Stack<E> {
    // добавляет новый элемент в начало стека
    public void push(E element) throws StackException;

    // возвращаем и удаляем верхний элемент стека
    public E pop() throws StackException;

    // возвращает верхний элемент, но не удаляет из стека
    public E peek();

    // возвращает количество элементов в стеке
    public int getSize();

    public boolean isEmpty();

    public boolean isFull();

    // добавляем все элементы из параметра src в стек
    public void pushAll(Collection<? extends E> src) throws
            StackException;

    // помещаем все элементы из стека в параметр dst
    public void popAll(Collection<? super E> dst) throws
            StackException;
}