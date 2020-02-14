package br.unisinos.queue;

public class StaticQueueTest {

	public static void main(String[] args) {

		Queue<Integer> q = new StaticQueue<>(5);

		try {
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			System.out.println("Fila após inserção = " + q);

			QueueUtils.reverse(q);
			System.out.println("Fila após reversão = " + q);
			
			QueueUtils.randomFill(q);
			System.out.println("Fila após randomFill = " + q);
			
			QueueUtils.clear(q);
			System.out.println("Fila após clear = " + q);
			
		} catch (OverflowException e) {
			e.printStackTrace();
		} catch (UnderflowException e) {
			e.printStackTrace();
		}

	}

}
