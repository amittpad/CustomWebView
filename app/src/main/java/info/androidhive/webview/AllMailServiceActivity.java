package info.androidhive.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

public class AllMailServiceActivity extends AppCompatActivity {
    private ImageView mGmail;
    private ImageView mYahoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_mail_service);

        initialize();
        onClickAction();


    }
    public void initialize(){
        mGmail = (ImageView)findViewById(R.id.gmail);
        mYahoo = (ImageView)findViewById(R.id.yahoo);
    }
    public void onClickAction(){
        mGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AllMailServiceActivity.this,MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
        mYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AllMailServiceActivity.this,YahooActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
    }
}
