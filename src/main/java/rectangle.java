public class rectangle implements shape {

    private double width, height;

    public rectangle(double w, double h){
        this.width = w;
        this.height = h;
        if(this.width<=0||this.height<=0)
            System.out.println("Error: side lengths must be positive!");
    }

    @Override
    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public double getPerimeter(){
        return 2*this.width+2*this.height;
    }

}
