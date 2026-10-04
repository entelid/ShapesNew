public class right_triangle extends rectangle{

    double base;
    private double height;
    private double hyp;

    public right_triangle(double aBase, double aHeight){
        super(aBase, aHeight); //doesnt need types since compiler only looks at values
        this.base = aBase;
        this.height = aHeight; //are these now redundant?^^
        this.hyp = Math.sqrt(Math.pow(this.height,2)+Math.pow(this.base,2));
        if(this.base<=0||this.height<=0||this.hyp<=0)
            System.out.println("Error: side lengths must be positive!");
    }

    @Override
    public double getArea(){
        return (this.height*this.base)/2;
    }

    @Override
    public double getPerimeter(){
        return this.base+this.height+this.hyp;
    }

}
