package interfaces.in.oop;

public class Businessmanm implements Richman,socialWorker {

	@Override
	public int helpToOther() {
		// TODO Auto-generated method stub
		return 45454;
	}

	@Override
	public int earnMony() {
		// TODO Auto-generated method stub
		return 454545454;
	}

	@Override
	public int donation() {
		// TODO Auto-generated method stub
		return 2262656;
	}

	@Override
	public int party() {
		// TODO Auto-generated method stub
		return 446465465;
	}
	   public static void main(String[] args) {
		
		   Businessmanm b = new Businessmanm();
		   
		   
		   
		   System.out.println("helpToOther = " + b.helpToOther());
		  
		   System.out.println("--------------");
		   System.out.println("earnMony = " + b.earnMony());
		   System.out.println("--------------");
		   System.out.println("donetion = "+ b.donation());
		   System.out.println("--------------");
		   System.out.println("party = " + b.party());
		   System.out.println("--------------");
		   
	}
}
	