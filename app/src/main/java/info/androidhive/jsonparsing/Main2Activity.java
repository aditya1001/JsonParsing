package info.androidhive.jsonparsing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("name");
        String iid = getIntent().getStringExtra("id");
        String email = getIntent().getStringExtra("email");
        String address = getIntent().getStringExtra("address");
        String gender = getIntent().getStringExtra("gender");
        String mobile = getIntent().getStringExtra("mobile");
        String home = getIntent().getStringExtra("home");
        String office = getIntent().getStringExtra("office");

        TextView textElement = (TextView) findViewById(R.id.name);
        textElement.setText(name);
        TextView textElement1 = (TextView) findViewById(R.id.email);
        textElement1.setText(email);
        TextView textElement2 = (TextView) findViewById(R.id.address);
        textElement2.setText(address);
        TextView textElement3 = (TextView) findViewById(R.id.gender);
        textElement3.setText(gender);
        TextView textElement4 = (TextView) findViewById(R.id.mobile);
        textElement4.setText(mobile);
        TextView textElement5 = (TextView) findViewById(R.id.home);
        textElement5.setText(home);
        TextView textElement6 = (TextView) findViewById(R.id.office);
        textElement6.setText(office);
//        TextView textElement7 = (TextView) findViewById(R.id.name);
//        textElement7.setText(name);




    }
}
