
 class Outer{
    private class Inner{
        public void print(){
            System.out.println("Inner class");
        }
    }
    void displayinner(){
        Inner s=new Inner();
        s.print();
    }
}
public class Myclass{
    public static void main(String args[]){
        Outer o=new Outer();
        o.displayinner();
    }
}
