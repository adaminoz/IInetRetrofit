package www.theclaimapp.com.iinetretrofit.Api;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import www.theclaimapp.com.iinetretrofit.Model.Creds;

/**
 * Created by aschickert on 3/12/2014.
 */
public interface IinetApi {
    @GET("/_USERNAME={etUsername}&_PASSWORD=")
    void getUser(@Path("etUsername") String username, Callback<Creds> usernameCB);
  //  void getPass(@Path("password") String password, Callback<Creds> passwordCB);

}
