package pojoFiles;

public class Users {
    String userName;
    String password;

    public Users(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String Username){
        this.userName  = this.userName;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password  = password;
    }
}
