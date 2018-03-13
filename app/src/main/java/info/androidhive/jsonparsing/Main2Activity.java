package info.androidhive.jsonparsing;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        SharedPreferences prefs = this.getSharedPreferences(
                "myperf", Context.MODE_PRIVATE);

        String name = getIntent().getStringExtra("name");
        String iid = getIntent().getStringExtra("id");
        String email = getIntent().getStringExtra("email");
        String address = getIntent().getStringExtra("address");
        String gender = getIntent().getStringExtra("gender");
        String mobile = getIntent().getStringExtra("mobile");
        String home = getIntent().getStringExtra("home");
        String office = getIntent().getStringExtra("office");

        TextView textElement = (TextView) findViewById(R.id.name);
        textElement.setText("Name: "+name);
        TextView textElement1 = (TextView) findViewById(R.id.email);
        textElement1.setText("E-mail: "+email);
        TextView textElement2 = (TextView) findViewById(R.id.address);
        textElement2.setText("Address: "+address);
        TextView textElement3 = (TextView) findViewById(R.id.gender);
        textElement3.setText("Gender: "+gender);
        TextView textElement4 = (TextView) findViewById(R.id.mobile);
        textElement4.setText("Mobile: "+mobile);
        TextView textElement5 = (TextView) findViewById(R.id.home);
        textElement5.setText("Home: "+home);
        TextView textElement6 = (TextView) findViewById(R.id.office);
        textElement6.setText("Office: "+office);
//        TextView textElement7 = (TextView) findViewById(R.id.name);
//        textElement7.setText(name);
        String namee;
        String nameee;
//        SharedPreferences preferences = getSharedPreferences("myperf", Context.MODE_WORLD_WRITEABLE);
//        String restoredText = prefs.getString("text", null);
//        if (restoredText != null) {
//            namee = prefs.getString("myperf", "No name defined");
//            TextView textElement7 = (TextView) findViewById(R.id.textView2);
//            textElement7.setText("Username: "+namee);
//        }
        SharedPreferences sharedPreferences = getSharedPreferences("myperf", 0);
         nameee = sharedPreferences.getString("User", "Not found!");
        TextView textElement7 = (TextView) findViewById(R.id.textView2);
        textElement7.setText("Username: "+nameee);



    }
}
