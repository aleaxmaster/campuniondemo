package mybatisfirst.demo.entity;


import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Alias("user")
public class User {

    private int id;
    private String user_name;
    private String user_password;
    private Timestamp create_time;

    public User(String user_name, String user_password,Timestamp create_time) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.create_time=create_time;
    }
    public User(String user_name,String user_password){
        this.user_name=user_name;
        this.user_password=user_password;
    }
    public User(int id, String user_name, String user_password,Timestamp create_time) {
        this.id = id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.create_time=create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }
}

