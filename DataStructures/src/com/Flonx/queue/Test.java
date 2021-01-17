package com.Flonx.queue;

/**
 * @Auther:Flonx
 * @Date:2021/1/16 - 01 - 16 - 17:44
 * @Description: com.Flonx.queue
 * @Version: 1.0
 */
public class Test {
//    ArrayQueue
    public static void main(String[] args) {

    }
}
class ArrayQueue1{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue1(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        rear = -1;
        front = -1;
    }

    public boolean isFull(){
        return rear == maxSize-1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n){
        if(isFull()){
            System.out.println("It is full");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("It is empty");
        }
        front++;
        return arr[front];
    }

    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("It is empty");
        }
        return arr[front+1];
    }
        }
