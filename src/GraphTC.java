public class GraphTC {
    private DenseGraph T;
    GraphTC (Graph G){
        T = Graphutilities.densecopy(G);
        for (int s = 0; s < T.V(); s++)
            T.insert (new Edge (s, s));
        for (int i = 0; i < T.V (); i++)
            for (int s = 0; s < T.V(); s++)
                if (T.edge(s, i))
                    for (int t = 0; t < T.V(); t++)
                        if (T.edge(i, t))
                            T.insert(new Edge(s, t));
    }
    boolean reachable(int s, int t)
    {
        return T.edge(s, t);
    }
}