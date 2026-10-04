public class circle implements shape{

    private double radius;   //is this yellow warning significant?

    public circle(double aRadius){
        this.radius = aRadius;
        if(this.radius<=0)
           System.out.println("Error: radius must be positive!");
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter(){
        return Math.PI*this.radius*2;
    }

}
