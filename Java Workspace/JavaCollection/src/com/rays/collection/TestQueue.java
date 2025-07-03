package com.rays.collection;
//First In First Out(FIFO)
import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer(5);
		q.offer(6);
		q.offer(4);
		q.offer(2);

		System.out.println("queue: " + q);
		System.out.println(q.peek());
		q.poll();
		System.out.println("queue: " + q);
		q.poll();
		System.out.println("queue: " + q);

	}

}
