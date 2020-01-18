package java_examples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EarlyNotify {

	private List list;

	public EarlyNotify() {

		list = Collections.synchronizedList(new LinkedList<>());
	}

	public String removeItem() throws InterruptedException {
		synchronized (list) {

			while(list.isEmpty()) {
				print("in removeItem()-- Going to wait()");
				list.wait();
				print("in removeItem()-- Done Waiting");

			}
			return (String) list.remove(0);
		}
	}

	public void addItem(String item) {
		synchronized (list) {
			print("In addItem() method: -- going to notify");
			list.notify();
			print("In addItem() method: -- Done with the notification");
		}
	}

	private static void print(String msg) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ":" + msg);
	}

}
