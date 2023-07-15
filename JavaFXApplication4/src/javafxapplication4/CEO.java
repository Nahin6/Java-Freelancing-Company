
package javafxapplication4;

import java.io.Serializable;
import java.util.logging.Logger;


public class CEO  implements Serializable{
    protected int id;
    protected String username;
    protected String email;

    public CEO(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CEO{" + "id=" + id + ", username=" + username + ", email=" + email + '}';
    }
;
    
    
    
}
