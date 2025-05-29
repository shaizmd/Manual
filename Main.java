import Balance.Account;
class Main{
    public static void main(String args[]){
        try{
            Balance.Account a = new Balance.Account();
            a.read();
            a.display();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}