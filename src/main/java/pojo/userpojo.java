package pojo;

public class userpojo {
   private int uid;
   private String name;
   private int money;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "userpojo{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
