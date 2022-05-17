package homework3;

import java.util.Iterator;

/**
 * @author �smail Can Varl�
 *
 */
public class BListe {

	Node head = null;

	/**
	 * @param data
	 */
	public void initialize(int data) {
		head = new Node();
		head.data = data;
		head.next = null;
	}

	/**
	 * 
	 */
	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	/**
	 * @param data
	 */
	public void addElementLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void getFirst() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Ba��l liste bo�tur.");
		} else {
			System.out.println(temp.data);
		}
	}

	/**
	 * @param n
	 *            :ka��nc� indis de�i�ecekse
	 * @param item
	 *            :verdi�imiz de�er
	 */
	public void set(int n, int item) {

		Node newNode = new Node();
		Node current = head;

		for (int i = 0; i < n; i++) {
			newNode = current.next;

			if (i == (n - 1)) {
				newNode.data = item;
			}
		}
	}

	/**
	 * @param item  verdi�imiz de�er
	 *       
	 */
	public void contains(int item) {
		Node tmp = head;
		int counter = 0;

		while (tmp != null) {
			if (tmp.data != item) {
				counter++;
				tmp = tmp.next;
			}

			else {
				System.out.println("Eleman " + item + " listede.");
				System.out.println("�ndexler: " + counter);
				break;
			}

		}

	}


}
