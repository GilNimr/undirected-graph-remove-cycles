//Gil Nevo 310021654 Shachar Bartal 305262016

package assig2_Better;

import java.util.Vector;

public class graphUndir {

	// adjacency list.
	public Vector<Vertex> Adj;

	//constructor
	public graphUndir() {
		Vector Adj = new Vector();
	}

	public void AddVertex(Vertex v) {
		if (!Adj.contains(v)) {
			Adj.addElement(v);

		}
	}

	public void AddEdge(Vertex v, Vertex u) {
		if (Adj.contains(v) || Adj.contains(u)) {

			// adds vertex u to the vector of vertexes of v.
			v.next.addElement(u);

			// adds vertex v to the vector of vertexes of u.
			u.next.addElement(v);
		}
	}

	public void PrintG() {
		for (int i = 0; i < Adj.size(); i++) {
			System.out.print(Adj.elementAt(i).name + "------->");
			for (int j = 0; j < Adj.elementAt(i).next.size(); j++) {
				System.out.print(Adj.elementAt(i).next.elementAt(j).name
						+ "  ------->");
			}
			System.out.println();
		}
	}
}
