package firstandroid.com.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeActivity extends AppCompatActivity {

    Button clickMeButton;

    @BindView(R.id.butterButton) Button butterButton;
    @BindView(R.id.butterTextview) TextView butterTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

//        clickMeButton = (Button)findViewById(R.id.click_me_button);
//
//        clickMeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Did it!", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    public void onNextScreenButtonClicked(View view) {
        Toast.makeText(this, "Did it again!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.butterButton)
    public void onButterButtonClicked(){

        Toast.makeText(this, "Buttuered it", Toast.LENGTH_SHORT).show();
        if (butterTextview.isShown()){
            butterTextview.setVisibility(View.GONE);
        }else {
            butterTextview.setVisibility(View.VISIBLE);
        }
    }

}
