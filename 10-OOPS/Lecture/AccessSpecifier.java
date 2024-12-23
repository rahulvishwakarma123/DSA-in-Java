public class AccessSpecifier {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.username = "RahulVishwakarma";
        b.setPassword("abcd");
        System.out.println(b.username);
        // we can not access the password from here.
    }
}
class BankAccount{
    public String username;

    // we can't get the access of the password outside the class,we can only change it by the help of the function.
    private String password;
    void setPassword(String pwd){
        this.password = pwd;
    }

}