public class GettersAndSetters {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setUsername("RahulVishwakarma");
        b.setPassword("abcd");
        System.out.println(b.getUsername());
        // we can not access the password from here directly.
        // we need to use the getter method to access the password.
        System.out.println(b.getPassword());
        
    }   
}

class BankAccount{
    private String username;
    private String password;

    // Getter
    public String getUsername(){
        return username;
    }

    // Setter
    public void setUsername(String username){
        this.username = username;
    }

    // Getter
    public String getPassword(){
        return password;
    }

    // Setter
    public void setPassword(String password){
        this.password = password;
    }
}
