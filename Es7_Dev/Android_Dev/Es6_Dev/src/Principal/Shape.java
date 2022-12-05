package Principal;

public class Shape {

    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("New shape!");
        this.shapeName = "undefined shape";
    }

    public Shape(double radius){
        System.out.println("NEW CIRCLE");
        this.shapeName = "circle";
    }

    public Shape(int edges, double edgeLength){
        System.out.println("NEW SQUARE");
        this.numberOfEdges = edges;
        shapeName = "square";
    }

    public Shape(int edges, double e1, double e2){
        System.out.println("NEW RECTANGLE");
        this.numberOfEdges = edges;
        shapeName = "rectangle";
    }

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("NEW TRIANGLE");
        this.numberOfEdges = edges;
        shapeName = "triangle";
    }

    public String getShapeDetails(){
        return "The shape is " + this.shapeName + " and have " + this.numberOfEdges + " number of edges";
    }

}
