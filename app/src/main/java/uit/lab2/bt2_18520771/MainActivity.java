package uit.lab2.bt2_18520771;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioBtnRed = findViewById(R.id.radioBtnRed);
        radioBtnGreen = findViewById(R.id.radioBtnGreen);
        radioBtnBlue = findViewById(R.id.radioBtnBlue);
        radioBtnGray = findViewById(R.id.radioBtnGray);
        txtColor = findViewById(R.id.txtColor);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.radioBtnRed:
                        txtColor.setBackgroundColor(getResources().getColor(R.color.colorRed));
                        break;
                    case R.id.radioBtnGreen:
                        txtColor.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                        break;
                    case R.id.radioBtnBlue:
                        txtColor.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                        break;
                    case R.id.radioBtnGray:
                        txtColor.setBackgroundColor(getResources().getColor(R.color.colorGray));
                        break;
                }
            }
        });
    }

    RadioButton radioBtnRed, radioBtnGreen, radioBtnBlue, radioBtnGray;
    TextView txtColor;
    RadioGroup radioGroup;

}