package exceptionhandling;

public class abc {
public static void main(String[] args) throws abcEx {
	
	add();
}

private static void add() throws abcEx {
	 div();
	
}

private static void div() throws abcEx {
   int c=	10/0;
   throw new abcEx("hello");
	
}
}
