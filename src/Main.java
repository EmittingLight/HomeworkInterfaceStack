import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание объекта стека типа GenericStack, который может хранить целые числа и имеет максимальный размер 5
        GenericStack<Integer> stack = new GenericStack<>(5);

         // Добавление элементов в стек
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            //stack.push(6);

            // Вывод размера стека, наличия свободного места в стеке и верхнего элемента стека (без извлечения)
            System.out.println("Размер стека: " + stack.getSize());
            System.out.println("Стек заполнен: " + stack.isFull());
            System.out.println("Просмотр стека: " + stack.peek());

            // Создание списка для извлечения всех элементов стека
            ArrayList<Integer> popList = new ArrayList<>();

            // Извлечение всех элементов стека и добавление их в список popList
            stack.popAll(popList);

            // Вывод извлеченных элементов
            System.out.println("Выскочившие элементы: " + popList);

            // Вывод размера стека после извлечения элементов
            System.out.println("Размер стека после popAll: " + stack.getSize());

            // Создание списка для добавления элементов в стек
            ArrayList<Integer> pushList = new ArrayList<>();

            // Добавление элементов в список pushList
            pushList.add(6);
            pushList.add(7);
            pushList.add(8);

            // Добавление всех элементов из списка pushList в стек
            stack.pushAll(pushList);

            // Вывод размера стека после добавления элементов
            System.out.println("Размер стека после pushAll: " + stack.getSize()); // печатает "Размер стека после pushAll: 3"
        } catch (StackException e) {

            // Вывод стек трейса в случае возникновения исключения StackException
            e.printStackTrace();
        }
    }

}
