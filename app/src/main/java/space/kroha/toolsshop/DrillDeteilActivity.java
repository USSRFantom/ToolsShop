package space.kroha.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDeteilActivity extends AppCompatActivity {
    ImageView imageViewDrill;
    TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_deteil);
        imageViewDrill = findViewById(R.id.imageViewDrill);
        textViewInfo = findViewById(R.id.textViewInfo);
        Intent intent = getIntent();
        String info = intent.getStringExtra("info");
        int IdImage = intent.getIntExtra("image", -1);

        imageViewDrill.setImageResource(IdImage);
        textViewInfo.setText(info);

    }
}
