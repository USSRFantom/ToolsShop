package space.kroha.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrillCategoryActivity extends AppCompatActivity {

    ListView listViewDrills;

    private ArrayList<Drill> drills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_category);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        drills = new ArrayList<>();
        drills.add(new Drill(getString(R.string.drill_interskol_title), getString(R.string.drill_interskol_info), R.drawable.interscoll));
        drills.add(new Drill(getString(R.string.drill_makita_title), getString(R.string.drill_makita_info), R.drawable.makita));
        drills.add(new Drill(getString(R.string.drill_devolt_title), getString(R.string.drill_devolt_info), R.drawable.devolt));
        listViewDrills = findViewById(R.id.listViewDrills);
        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, drills);
        listViewDrills.setAdapter(adapter);
        listViewDrills.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drill drill = drills.get(position);
                Intent intent = new Intent(getApplicationContext(), DrillDeteilActivity.class);
                intent.putExtra("title", drill.getTitile());
                intent.putExtra("info", drill.getInfo());
                intent.putExtra("image", drill.getImageResoursesId());
                startActivity(intent);
            }
        });

    }
}
