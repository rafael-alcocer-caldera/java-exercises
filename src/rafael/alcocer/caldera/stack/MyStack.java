package rafael.alcocer.caldera.stack;

import java.util.Arrays;

public class MyStack {

	private Object[] stack;

	public MyStack() {
		stack = new Object[1];
	}
	
	public MyStack(Object data) {
		stack = new Object[1];
		stack[0] = data;
	}

	public MyStack(int capacity) {
		if (capacity > 0) {
			stack = new Object[capacity];
		} else {
			stack = new Object[1];
		}
	}

	public Object[] push1(Object data) {
		Object[] copiedArray = Arrays.stream(getStack()).toArray(o -> new Object[getStack().length + 1]);
		
		copiedArray[0] = data;
		int x = 0;
		
		for (int i = 0; i < copiedArray.length - 1; i++) {
			copiedArray[++x] = getStack()[i];
		}

		setStack(copiedArray);
		
		return getStack();
	}
	
	public Object[] push2(Object data) {
		Object[] copiedArray = Arrays.copyOf(getStack(), getStack().length + 1);
		copiedArray[0] = data;
		int x = 0;
		
		for (int i = 0; i < copiedArray.length - 1; i++) {
			copiedArray[++x] = getStack()[i];
		}

		setStack(copiedArray);
		
		return getStack();
	}
	
	public Object[] push3(Object data) {
		Object[] copiedArray = Arrays.copyOfRange(getStack(), 1, getStack().length + 1);
		copiedArray[0] = data;
		int x = 0;
		
		for (int i = 0; i < copiedArray.length - 1; i++) {
			copiedArray[++x] = getStack()[i];
		}

		setStack(copiedArray);
		
		return copiedArray;
	}

	public void pull() {

	}

	public Object[] getStack() {
		return stack;
	}

	public void setStack(Object[] stack) {
		this.stack = stack;
	}
}
