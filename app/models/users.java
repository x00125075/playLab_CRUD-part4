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
    public static 


}