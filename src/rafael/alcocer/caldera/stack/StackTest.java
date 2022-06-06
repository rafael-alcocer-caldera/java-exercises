package rafael.alcocer.caldera.stack;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		Object[] array = stack.getStack();
		array[0] = "One";
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("##### array[" + i + "]: " + array[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		/*
		array = stack.push1(2);
		System.out.println("##### array.length: " + array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("##### array[" + i + "]: " + array[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		*/
		
		
		array = stack.push2(2);
		System.out.println("##### array.length: " + array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("##### array[" + i + "]: " + array[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		array = stack.push2(3);
		System.out.println("##### array.length: " + array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("##### array[" + i + "]: " + array[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		array = stack.push2(4);
		System.out.println("##### array.length: " + array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("##### array[" + i + "]: " + array[i]);
		}
		
		System.out.println("-----------------------------------------------------");
		
		/*
		Object[] copiedArray3 = stack.push3(2);
		System.out.println("##### copiedArray3.length: " + copiedArray3.length);
		
		for (int i = 0; i < copiedArray3.length; i++) {
			System.out.println("##### copiedArray3[" + i + "]: " + copiedArray3[i]);
		}
		*/
	}

}
