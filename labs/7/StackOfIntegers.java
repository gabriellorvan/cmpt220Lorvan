package lab7;

public class StackOfIntegers {
	private int[] array;
	private int size;
	public static final int CAP = 16;

	public StackOfIntegers() {
		this (CAP);
	}

	public StackOfIntegers(int capacity) {
		array = new int[capacity];
	}

	public void push(int value) {
		if (size >= array.length) {
			int[] temp = new int[array.length * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}

		array[size++] = value;
	}

	public int pop() {
		return array[--size];
	}

	public int peek() {
		return array[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}
