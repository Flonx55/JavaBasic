package com.Flonx.queue;

import java.util.Scanner;

/**
 * @Auther:Flonx
 * @Date:2021/1/16 - 01 - 16 - 17:44
 * @Description: com.Flonx.queue
 * @Version: 1.0
 */
public class Test {
    //    ArrayQueue
    public static void main(String[] args) {
        char key = ' ';
        boolean loop = true;

        Scanner scanner = new Scanner(System.in);
        while (loop){
            System.out.println("ArrayQueue");
            System.out.println("a,g,s");
            key = scanner.next().charAt(0);
        }
    }
}

class ArrayQueue1 {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue1(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void addQueue(int n) {
        if (isFull())
            throw new RuntimeException("队列已满");
        arr[++rear] = n;
    }

    public int getQueue() {
        if (isEmpty())
            throw new RuntimeException("队列为空");
        front++;
        return arr[front];
    }

    public void showQueue() {
        for (int i = 0; i < rear - front; i++) {
            System.out.println(arr[i]);
        }
    }

    public boolean isFull() {
        if (rear == maxSize - 1)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if (rear == front)
            return true;
        return false;
    }
}