//Gil Nevo 310021654 Shachar Bartal 305262016

package assig2_Better;



import java.util.Vector;

public class Vertex {
	public char name;
	public String color;
	
	// Vector of All vertexes that current Vertex connects to.
	public Vector<Vertex> next;
	
	
	//constructor.
	Vertex(char ch) {
		name = ch;
		next = new Vector();
		color="white";
		
	}
}
