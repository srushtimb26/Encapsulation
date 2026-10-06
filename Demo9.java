package HelloWorld;

interface parents4 {
	void m1();
}

class Demo9 implements parents4 {

	public void m1() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Demo9 bb = new Demo9();
		bb.m1();
	}

}
