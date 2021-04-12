package item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if(size==0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if(elements.length==size)
            elements = Arrays.copyOf(elements, 2*size+1);
    }

    //내부 필드에 배열과 같은 참조 변수있으면 그 참조 변수의 clone까지 적용해주어야함
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
