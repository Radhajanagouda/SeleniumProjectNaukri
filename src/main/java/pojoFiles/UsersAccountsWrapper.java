package pojoFiles;

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;

public class UsersAccountsWrapper implements Iterable{
    @SerializedName("users")
    List<Users> userAccounts;
    public UsersAccountsWrapper(List<Users> users){
        this.userAccounts = users;
    }

    //no use
    @Override
    public Iterator<Users> iterator() {
       return userAccounts.iterator();
    }

    public List<Users> getUserAccount(){
        return userAccounts;
    }

    public void setUserAccounts(List<Users> userValsFromOut){
        this.userAccounts = userValsFromOut;
    }
}
