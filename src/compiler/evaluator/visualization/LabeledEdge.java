package compiler.evaluator.visualization;

import org.jgrapht.graph.DefaultEdge;

// Extend default edge class (from the lib) to add names
public class LabeledEdge
        extends
        DefaultEdge
{
    private String label;

    /**
     * Constructs a relationship edge
     *
     * @param label the label of the new edge.
     *
     */
    public LabeledEdge(String label)
    {
        this.label = label;
    }

    public LabeledEdge(){
        this.label="";
    }
    /**
     * Gets the label associated with this edge.
     *
     * @return edge label
     */
    public String getLabel()
    {
        return label;
    }

    @Override
    public String toString()
    {
        return label ;
    }
}

