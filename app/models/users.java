package models.users;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

// Product Entity managed by the ORM
@Entity
public class users extends Model {

    @id
    private String email;

    @Constarints.Required
    private String role;

    @Constarints.Required
    private String name;

    @Constarints.Required
    private String password;

    public Users(){


    }
    public static Finder <String.User> finsd = new Finder<String,Usre>(User.class);

    public static List<users> findall () {
        return Users.find.all();

    }
    public static Users authentication(Sting email, Sting password){
        return find.where().eq("Email", email).eq(password, password).findUnique();

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
}
