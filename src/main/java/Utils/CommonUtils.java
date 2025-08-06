package Utils;

import com.google.gson.Gson;
import org.openqa.selenium.WebDriver;
import pojoFiles.Users;
import pojoFiles.UsersAccountsWrapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

public class CommonUtils {
    WebDriver driver = DriverManager.getDriver();

    public  String getPwdFromJson(String UserName) {
        String userJsonStr = readFileAsString("src/test/resources/jsonData/credentialDets.json");
        String usersPwd= "";
        Gson gson = new Gson();
        UsersAccountsWrapper userAccnts = gson.fromJson(userJsonStr, UsersAccountsWrapper.class);
        List<Users> fromJsonUsers =userAccnts.getUserAccount();

        for (Users eachuser:fromJsonUsers
             ) {
            if(eachuser.getUserName().equalsIgnoreCase(UserName)){
                usersPwd= eachuser.getPassword();
            }
        }
        return usersPwd;
    }

    public static String readFileAsString(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator()); // preserves line breaks
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace(); // optional: for debugging
        }
        return contentBuilder.toString();
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
}
