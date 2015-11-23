package study.insuk.prototype.framework;

public class UnderlinePen extends ConcreteProduct {
	private char ulchar;
	public UnderlinePen(char ulchar){
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for(int i=0; i < length; i++){
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}



}
