package lemrajava8;

public class testinterfacereturn {
	
	
	public static void main(String[] args) {
		
		
		interfacereturn add= (a,b) -> {
		return a+b;
		};
		
		interfacereturn multip = (a,b) -> {
			return a*b;
		};
		interfacereturn div = (a,b) -> {
			return a/b;
		};
		interfacereturn subt = (a,b) -> {
			return a-b;
		};
		
                     int a = 10;
                     int b = 5;
                     System.out.println("add : "+(a+b));
                     System.out.println("mult : "+(a*b));
                     System.out.println("div : "+(a/b));
                     System.out.println("subt : "+(a-b));
                     
	}
}
