package inputoutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetBeanExt1 implements Externalizable {
	
      String name;
	 int maths=0;
     int physics=0;
     int chemistry=0;
     int temp=0;
	
    
    @Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(physics);
		out.writeObject(chemistry);
		out.writeObject(maths);
		
   
    	
    	
		
		
	}
    @Override
   	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       	name = (String)in.readObject();
       	physics = in.readInt();
       	chemistry = in.readInt();
       	maths = in.readInt();
       	
       	temp = in.readInt();
		
		
	}
    
    
    

}
