package www.theclaimapp.com.iinetretrofit.Model;

/**
 * Created by aschickert on 3/12/2014.
 */
public class Creds {

    private String token;
    private String success;
    private String response;



    private String username;
    private String password;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

      public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
