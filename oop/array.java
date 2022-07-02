package exercise.oop;


public class array {
	
	public static void main(String[] args) {
		
         shape[] s = new shape[3];
         s[0] = new circle();
         s[1] = new rectangle();
         s[2]= new Triangle();
        		 
        		 circle c = (circle) s[0];
        		 c.setRadius(5);
        		 
        		 rectangle r = (rectangle) s[1];
        		 r.setLen(5);
        		 r.setWid(5);
     
        		 Triangle t = (Triangle) s[2];
        				 t.setBase(5);
        		 t.setHight(5);
        		
        		 double total = 0.0;
        		 for (int i = 0; i < s.length; i++) {
        			 total = total + s[i].area();
					
				}
        		 System.out.println(total);
 		
		
		
		
	}

}
