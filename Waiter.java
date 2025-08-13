interface  Restarentemployee {
    void cookfood();
    void washdish();
    void servefood();

}
class Waiter implements Restarentemployee {
    public void cookfood() {

        //System.out.print("Enter the amount of time you wish to cook: ");
    }
    public void washdish() {
        //System.out.print("Enter the amount of time you wish to wash: ");
    }
    public void servefood() {
        System.out.print("Enter the amount of time you wish to serve: ");
    }

}

class Main{
    public static void main(String[] args) {
        Waiter w = new Waiter();
        w.cookfood();
        w.washdish();
        w.servefood();
    }
}