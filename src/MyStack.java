public class MyStack<T> {

    private MyLinkedList<T>  stack = new MyLinkedList<>();

    public void push(T item){
        stack.insertFirst(item);
    }

    public T pop(){
        return stack.removeFirst();
    }

    public T peek(){
        return stack.getFirst();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
