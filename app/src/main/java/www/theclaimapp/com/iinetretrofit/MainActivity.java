package www.theclaimapp.com.iinetretrofit;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import www.theclaimapp.com.iinetretrofit.Api.LoginDetails;
import www.theclaimapp.com.iinetretrofit.Model.Creds;


public class MainActivity extends ActionBarActivity {

    private TextView tvToken;
    private TextView stoken;
    private TextView etUsername;
    private TextView etPassword;
    private TextView success;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        success = (TextView) findViewById(R.id.tvToken);
        etUsername = (TextView) findViewById(R.id.etUsername);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onLoginClick(View view) {
        LoginDetails.
                getIInetApiClient().
                getUserCreds(etUsername.getText().toString(), new Callback<Creds>() {

               @Override
                    public void success(Creds credsresult, Response response) {
                        Toast.makeText(getApplicationContext(), credsresult.getUsername() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_LONG).show();
                        //          Toast.makeText(getApplicationContext(), creds.getEtPassword() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_LONG).show();

                        success.setText(String.valueOf(credsresult.getSuccess()));

                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }


                });




    }
}
