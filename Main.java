public class Main {
    public static void main(String[] args) {

        /////////////////////Aufgabe_2//////////////////////////////////////////////////////////////////////////////////////////
        Floor floor= new Floor (30,40);
        System.out.println(" Die Fläche = "+ floor.getArea());
        Carpet carbet= new Carpet(7);
        System.out.println(" Carpet =  "+ carbet.getCost());
        Calculator calculator= new Calculator(floor,carbet);
        System.out.println("total= " + calculator.getTotalCost());


    }
}