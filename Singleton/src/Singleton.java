
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("インスタンスを生成しました。");
	}
	public static Singleton getInstance() {
		return singleton;
	}
	public static void start() {
		System.out.println("Singletonのインスタンスを生成する関数は、staticであればなんでもいい。");
	}
}
