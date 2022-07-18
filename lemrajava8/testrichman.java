package lemrajava8;

public class testrichman {
	
	public static void main(String[] args) {
		richman r = new richman() {
			
			@Override
			public void socilwork() {
				System.out.println(" a ");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void party() {
				System.out.println("b");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void employee() {
				System.out.println(" c");
				// TODO Auto-generated method stub
				
			}
		};  r.socilwork();
		    r.party();
		    r.employee();
		    
		   
		r.textD();
	richman.textF();
		  
	}

}
