package www.theclaimapp.com.iinetretrofit.Api;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import www.theclaimapp.com.iinetretrofit.Model.Creds;

/**
 * Created by aschickert on 3/12/2014.
 */
public interface IinetApi {
    @GET("/cgi-bin/api.cgi?&_PASSWORD=")
    void getUserCreds(@Query("_USERNAME") String username, Callback<Creds> cb);
  //  void getPass(@Path("password") String password, Callback<Creds> passwordCB);

}
