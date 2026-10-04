public class square implements shape {

    private double side;

    public square(double aSide){
        this.side = aSide;
        if(this.side<=0)
            System.out.println("Error: side be positive!");
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

}
