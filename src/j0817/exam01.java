package j0817;

public class exam01 {

	public static void main(String[] args) {
		// 오버로딩(overloading)
	       MyMath3 mm = new MyMath3();
	       System.out.println("mm.add(3,3)" +mm.add(3,3));
	       System.out.println("mm.add(3L,3)" +mm.add(3L,3));
	       System.out.println("mm.add(3,3L)" +mm.add(3,3L));
	       System.out.println("mm.add(3L,3L)" +mm.add(3L,3L));
	       
	       
	       int[] a = {100, 200, 300};
	       System.out.println("mm.add(a)" +mm.add(a));
		
		
	}
	
}
	
		 class MyMath3 {
			int add(int a, int b) {
				System.out.print("int add(int a, int b) -");
		        return a+b;
			}
			
			long add(long a, long b) {
				System.out.print("long add(long a, long b) -");
				return a+b;
			}
			
			int add(int[] a) {
				System.out.print("int add(int[] a) -");
				int result = 0;
				for(int i=0; i<a.length; i++)
					result += a[i];
				
				return result;
			}
			
			
			
		}
		
		
		

	


