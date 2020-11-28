import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyDeque<T> {
        private T[] list;
        private int capacity;
        private int begin;
        private int end;

        public MyDeque(int size) {
            list = (T[])new Object[size];
            capacity = 1;
            begin = 0;
            end = 0;
        }

        public int size(){
            return end - begin;
        }

        public void insertLeft(T item) {
            if (item == null) {
                throw new NullPointerException();
            }
            if(begin == end){
                list[begin] = item;
                end++;
            }else{
                while (begin <=0){
                    this.enlarge();
                }
                if(isEmpty()){
                    begin--;
                }
                list[begin] = item;
            }
        }

        public void insertRight(T item) {
            if (item == null) {
                throw new NullPointerException();
            }
            if(end >= capacity){
                this.enlarge();
            }
            list[end] = item;
            end++;
        }

        public T removeLeft() {
            if(isEmpty()){
                throw new NoSuchElementException();
            }
            T tmp = list[begin];
            list[begin] = null;
            begin++;
            if(begin == end){
                begin = 0;
                end = 0;
            }
            if(size() < capacity / 2){
                this.shrink();
            }
            return tmp;
        }

        public T removeRight() {
            if(isEmpty()) throw new NoSuchElementException();
            end--;
            T tmp = list[end];
            list[end] = null;

            if(size() < capacity / 2)
                this.shrink();

            return tmp;
        }

        public boolean isEmpty(){
            return begin == end;
        }

        private void enlarge() {
            if(capacity == 0) {
                capacity = 1;
                begin = 0;
                end = 0;
                list = (T[]) new Object[1];
            } else {

                resize(capacity * 2);
            }
        }

        private void shrink() {

            if(capacity == 0) return;
            int newCapacity = capacity / 2;
            if(newCapacity == 0) {

                list = null;
                begin = -1;
                end = -1;
                capacity = 0;
            } else {
                resize(newCapacity);
            }
        }

        private void resize(int capacity) {
            T[] tmpCont = (T[]) new Object[capacity];
            int newBegin = (capacity - size()) / 2;
            for(int i = begin; i < end; ++i)
                tmpCont[newBegin++] = list[i];
            this.begin = (capacity - size()) / 2;
            this.end = newBegin;
            this.list = tmpCont;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return Arrays.toString(list) + " begin: " + begin + " end: " + end;
        }

}
