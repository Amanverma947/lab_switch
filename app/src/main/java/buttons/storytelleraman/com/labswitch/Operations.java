package buttons.storytelleraman.com.labswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Operations extends AppCompatActivity {

    Button configlab,operatelab,switchlab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);
        configlab = findViewById(R.id.config_id);
        operatelab = findViewById(R.id.operate_id);
        switchlab= findViewById(R.id.switch_id);
        configlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i = new Intent(getApplicationContext(), Configure_labs.class);
              startActivity(i);
            }
        });

        operatelab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Operate_Systemscreen.class);
                startActivity(i);
            }
        });
        switchlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Switch_lab.class);
                startActivity(i);
            }
        });




    }



}
