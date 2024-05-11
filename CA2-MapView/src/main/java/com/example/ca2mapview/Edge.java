package com.example.ca2mapview;

public class Edge {
    private Node start;
    private Node end;
    private double distance;

    public Edge(Node start, Node end, double distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }

    public double getDistance() {
        return distance;
    }
}
