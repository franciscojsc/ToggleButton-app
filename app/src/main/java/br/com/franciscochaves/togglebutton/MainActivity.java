package br.com.franciscochaves.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton mToggleButton;
    private ImageView mLamapda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToggleButton = findViewById(R.id.toggleButton_liga_desliga);
        mLamapda = findViewById(R.id.image_lampada);

        mToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    int verde = getResources().getColor(R.color.lampadaLigada);
                    mToggleButton.setBackgroundColor(verde);
                    mLamapda.setImageResource(R.drawable.lamp_acender);
                } else {
                    int vermelho = getResources().getColor(R.color.lampadaDesligada);
                    mToggleButton.setBackgroundColor(vermelho);
                    mLamapda.setImageResource(R.drawable.lamp_apagar);
                }
            }
        });


    }
}
