package HelloWorld;
//
	class parent
	{
		private int a;
		public int getA(){
			return a;
		}
public void setA(int a) {
	this.a = a;
		}
	}
	class Demo7 extends parent
	{
		public static void main(String[] args) {
			Demo7 bb = new Demo7();		
	        bb.setA(8);
	        int ss= bb.getA();
	        System.out.println(ss);
		}
	}
