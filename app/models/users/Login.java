package models.users;

/**
 * Created by wdd on 28/11/16.
 */
public class Login {
    private String email;
    private String password;

    public String validate)(){
        if (User.authenticate(getEmail(), getPassword()) == null) {
            return " Invalid User OR Password";
        }
        return null;
    }
    

}
