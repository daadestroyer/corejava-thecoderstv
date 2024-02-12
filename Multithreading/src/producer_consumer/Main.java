package producer_consumer;

import java.util.LinkedList;
import java.util.function.Consumer;

class Data {
	LinkedList<Integer> dataPipeline = new LinkedList<>();
	int min_cap = 4;

	public void produce() throws InterruptedException {
		int data = 0;
		while (true) {
			synchronized (this) {
				while (dataPipeline.size() == min_cap) {
					this.wait();
				}
				System.out.println("Producer produced - " + data);
				dataPipeline.add(data++);

				if (dataPipeline.size() >= min_cap) {
					this.notify();
				}
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (dataPipeline.size() == 0) {
					this.wait();
				}
				int val = dataPipeline.removeFirst();
				System.out.println("Consumer consumed - " + val);
				if (dataPipeline.size() == 0)
					this.notify();
				
				Thread.sleep(1000);
			}
		}

	}
}

public class Main {
	public static void main(String[] args) {
		Data data = new Data();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					data.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					data.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
