package pojo;

import org.omg.CORBA.StringHolder;

import java.io.Serializable;

public class loginpojo implements Serializable {
    private  int lid;
    private String accm;
    private String pass;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getAccm() {
        return accm;
    }

    public void setAccm(String accm) {
        this.accm = accm;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
