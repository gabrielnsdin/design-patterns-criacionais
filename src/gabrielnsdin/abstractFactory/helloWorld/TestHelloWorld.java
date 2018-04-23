package gabrielnsdin.abstractFactory.helloWorld;

public class TestHelloWorld {
	
	public static void main(String[] args) {
		AbstractHelloWorldFactory factory = new HelloWorldFactory();
		HelloWorld hello = factory.getHelloWorldInstance();
		hello.print();
	}
}
