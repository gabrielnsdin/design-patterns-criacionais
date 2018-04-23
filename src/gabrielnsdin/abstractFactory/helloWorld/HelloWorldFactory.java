package gabrielnsdin.abstractFactory.helloWorld;

public class HelloWorldFactory implements AbstractHelloWorldFactory{
	private static final int FILE = 1;
	private static final int JFRAME = 2;
	
	@Override
	public HelloWorld getHelloWorldInstance() {
		int type = (Math.random() <= 0.5) ? 1 : 2;
		
		switch(type){
			case FILE: return new FileHelloWorld();
			case JFRAME: return new JFrameHelloWorld();
		}
			
		return null;
	}

}
