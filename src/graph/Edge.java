package graph;

public class Edge
{
    protected int source;
    protected int destination;
    protected double weight;

    public Edge(int source, int destination)
    {
        this.source = source;
        this.destination = destination;
        this.weight = 1.0;
    }

    public Edge(int source, int destination, double weight)
    {
        this(source, destination);
        this.weight = weight;
    }

    public int getSource() { return source; }
    public int getDestination() { return destination; }
    public double getWeight() { return weight; }

    public boolean equals(Edge other)
    {
        return source == other.source && destination == other.destination;
    }

    public int hashCode()
    {
        return source + destination;
    }

    public String toString()
    {
        return "W: " + weight + " @ Src: " + source + ", Dest: " + destination;
    }

}
