package br.unisinos.queue;

public class QueueUtils {

	public static <E> void reverse(Queue<E> q) {

		Stack<E> aux = new StaticStack<E>(q.numElements());

		while (!q.isEmpty())
			aux.push(q.dequeue());

		while (!aux.isEmpty())
			q.enqueue(aux.pop());

	}

	public static void clear(Queue<?> queue) {
		while (!queue.isEmpty())
			queue.dequeue();
	}

	public static void randomFill(Queue<Integer> q) {
		clear(q);
		while (!q.isFull()) {
			q.enqueue((1 + (int) (Math.random() * 100)));
		}
	}

}
