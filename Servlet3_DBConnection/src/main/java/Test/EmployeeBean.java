package Test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeBean implements Serializable {

    private int id;
    private double bsal;
    private String name, desg;
    
    public EmployeeBean() {}

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

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public double getBsal() { 
        return bsal;
    }

    public void setBsal(double bsal) { 
        this.bsal = bsal;
    }
}
