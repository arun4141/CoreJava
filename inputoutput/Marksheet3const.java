package inputoutput;

import java.io.Serializable;

public class Marksheet3const implements Serializable {
	
String name = null;
int maths = 0;
int physics = 0;
int chemistry = 0;
private transient int temp = 0;

public Marksheet3const() {
	
}

public Marksheet3const(String name, int maths, int physics, int chemistry, int temp) {
	
	this.name = name;
	this.maths = maths;
	this.physics = physics;
	this.chemistry = chemistry;
	this.temp = temp;
}

public String getName() {
	return name;
}

public int getMaths() {
	return maths;
}

public int getPhysics() {
	return physics;
}

public int getChemistry() {
	return chemistry;
}

public int getTemp() {
	return temp;
}




}
