public class Floor {
    double width , lenghth;
    public Floor ( double width, double lenghth) {
        if (width < 0) {
            this.width = 0;
        }
        else{ this.width = width;}
        if (lenghth < 0) {
            this.lenghth = 0;
        }

        else {this.lenghth = lenghth;}
}
public double getArea(){
        double fläche = width*lenghth;

return fläche;}

}
