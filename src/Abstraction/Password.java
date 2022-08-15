package Abstraction;

public class Password extends Abstract {

	@Override
	public void password() {

		System.out.println("123");
	}

	@Override
	public void userName() {
		super.userName();
	}
	
	public static void main(String[] args) {
		
		Password obj = new Password();
		
		obj.password();
		
		obj.userName();
	}

}
