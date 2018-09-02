//Gil Nevo 310021654 Shachar Bartal 305262016

package assig2_Better;

public class source {

	public static void main(String[] args) {

		/* making the Undirected graph. */
		graphUndir G = new graphUndir();
		String str = "abcd";
		char[] ch = str.toCharArray();
		Vertex[] nd = new Vertex[ch.length];
		for (int i = 0; i < ch.length; i++) {
			nd[i] = new Vertex(ch[i]);
			G.AddVertex(nd[i]);
		}
		G.AddEdge(nd[0], nd[2]);
		G.AddEdge(nd[0], nd[1]);
		G.AddEdge(nd[1], nd[2]);
		G.AddEdge(nd[3], nd[1]);

		/* prints the graph before function */
		System.out.println("graph before:");
		G.PrintG();

		/* Sending to function */
		MakeDirectedNoCycle(G);

		/* prints the graph after function */
		System.out.println();
		System.out.println("graph after:");
		G.PrintG();

	}

	/*
	 * this function iterates over the adjacency list, and for each vertex in
	 * the list, it goes to the vertex it connects to, and if the color is white
	 * - it colors it grey, and if the color is black it deletes the connection
	 * to that vertex. the result is a directed graph with no cycles.
	 */
	public static void MakeDirectedNoCycle(graphUndir G) {

		for (int i = 0; i < G.Adj.size(); i++) {
			G.Adj.elementAt(i).color = "grey";
			System.out.println(G.Adj.elementAt(i).name + " is "
					+ G.Adj.elementAt(i).color);
			for (int j = 0; j < G.Adj.elementAt(i).next.size(); j++) {
				if (G.Adj.elementAt(i).next.elementAt(j).color == "white") {
					G.Adj.elementAt(i).next.elementAt(j).color = "grey";
					System.out
							.println(G.Adj.elementAt(i).next.elementAt(j).name
									+ " is "
									+ G.Adj.elementAt(i).next.elementAt(j).color);
				} else if (G.Adj.elementAt(i).next.elementAt(j).color == "black") {
					System.out
							.println(G.Adj.elementAt(i).next.elementAt(j).name
									+ " is rempved from "
									+ G.Adj.elementAt(i).name);
					G.Adj.elementAt(i).next.remove(j);
					j--;

				}

			}
			G.Adj.elementAt(i).color = "black";
			System.out.println(G.Adj.elementAt(i).name + " is "
					+ G.Adj.elementAt(i).color);

		}

	}
}