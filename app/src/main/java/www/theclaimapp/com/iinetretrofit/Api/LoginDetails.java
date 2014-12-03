package www.theclaimapp.com.iinetretrofit.Api;

import retrofit.RestAdapter;

/**
 * Created by aschickert on 3/12/2014.
 */
public class LoginDetails {
    private static IinetApi sIInetService;

    public static IinetApi getIInetApiClient() {
        if (sIInetService == null ) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://toolbox.iinet.net.au/cgi-bin/api.cgi?")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            sIInetService = restAdapter.create(IinetApi.class);
      }
            return sIInetService;
    }
}
