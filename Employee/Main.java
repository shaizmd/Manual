public class Main {
    public static void main(String args[]){
    Teaching teach = new Teaching();    
    teach.accept();
    teach.display();
    Technical tech = new Technical();
    tech.accept();  
    tech.display();
    Contract cont = new Contract();
    cont.accept();
    cont.display();
    }
   
}