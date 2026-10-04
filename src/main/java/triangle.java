public class triangle implements shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public triangle(double aSideA, double aSideB, double aSideC){
        this.sideA = aSideA;
        this.sideB = aSideB;
        this.sideC = aSideC;
        if(this.sideA<=0||this.sideB<=0||this.sideC<=0)
            System.out.println("Error: all sides must be positive!");
    }

    @Override
    public double getArea(){
        double s = (getPerimeter()/2);
        return Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC)); //Herons Formula
    }

    @Override
    public double getPerimeter(){
        return this.sideA+this.sideB+this.sideC;
    }

}
