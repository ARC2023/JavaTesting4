package finalfinallyfinalise;

public class garbageCollect {

	public void finalize() {

		System.out.println("Calling Finalize");
	}

	public static void main(String[] args) {
		garbageCollect f1 = new garbageCollect();
		garbageCollect f2 = new garbageCollect();

		System.out.println(f1);
		System.out.println(f2);

		f1 = null;
		f2 = null;

		System.out.println(f1);
		System.out.println(f2);

		System.gc();
	}

}
