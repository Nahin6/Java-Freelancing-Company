
package javafxapplication4;

import java.io.Serializable;


public class PostRead implements Serializable {
    
    protected int id;
    protected String name,sub,Details;

    public PostRead(int id, String name, String sub, String Details) {
        this.id = id;
        this.name = name;
        this.sub = sub;
        this.Details = Details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }
    
    
    
}
