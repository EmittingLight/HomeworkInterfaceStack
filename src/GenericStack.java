import java.util.ArrayList;
import java.util.Collection;


// Объявление класса GenericStack, который реализует интерфейс Stack с типом элементов E
public class GenericStack<E> implements Stack<E> {
    // объявление приватного ArrayList-а с типом E для хранения элементов стека
    private ArrayList<E> stack;

    // объявление приватного целочисленного поля для максимального размера стека
    private int maxSize;

    // конструктор класса, принимающий максимальный размер стека и инициализирующий массив stack
    public GenericStack(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }

    // метод для добавления элемента в стек
    public void push(E element) throws StackException {
        // проверка, не превышен ли максимальный размер стека
        if (isFull()) {
            throw new StackException("Стек заполнен");
        }
        stack.add(element); // добавление элемента в конец стека
    }

    // метод для извлечения элемента из стека
    public E pop() throws StackException {
        // проверка, не является ли стек пустым
        if (isEmpty()) {
            throw new StackException("Стек пуст");
        }
        return stack.remove(stack.size() - 1); // удаление и возврат последнего элемента стека
    }

    // метод для возврата последнего элемента стека без удаления
    public E peek() {
        // проверка, не является ли стек пустым
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1); // возврат последнего элемента стека
    }

    // метод для получения текущего размера стека
    public int getSize() {
        return stack.size(); // возврат размера стека
    }

    // метод для проверки, является ли стек пустым
    public boolean isEmpty() {
        return stack.isEmpty(); // возврат true, если стек пустой, иначе false
    }

    // метод для проверки, заполнен ли стек
    public boolean isFull() {
        return stack.size() == maxSize; // возврат true, если размер стека равен максимальному, иначе false
    }

    // метод для добавления коллекции элементов в стек
    public void pushAll(Collection<? extends E> src) throws StackException {
        for (E element : src) {
            push(element); // добавление каждого элемента из коллекции в стек
        }
    }

    // метод для извлечения всех элементов из стека в коллекцию
    public void popAll(Collection<? super E> dst) throws StackException {
        while (!isEmpty()) {
            dst.add(pop()); // извлечение элементов из стека и добавление их в переданную коллекцию
        }
    }
}