package www.theclaimapp.com.iinetretrofit.Model;

/**
 * Created by aschickert on 3/12/2014.
 */
public class Creds {

    private String token;
    private String s_token;
    private String etUsername;
 //   private String etPassword;


  //  public String getEtPassword() {
  //      return etPassword;
  //  }

  //  public void setEtPassword(String etPassword) {
  //      this.etPassword = etPassword;
  //  }

       public String getEtUsername() {
       return etUsername;
   }

       public void setEtUsername(String etUsername) {
       this.etUsername = etUsername;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getS_token() {
        return s_token;
    }

    public void setS_token(String s_token) {
        this.s_token = s_token;
    }

}
