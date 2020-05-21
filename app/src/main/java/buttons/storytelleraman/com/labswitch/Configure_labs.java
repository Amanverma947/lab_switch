package buttons.storytelleraman.com.labswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Configure_labs extends AppCompatActivity {
    RelativeLayout rl_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_labs);
        rl_1=(RelativeLayout)findViewById(R.id.relative_1);
        rl_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Add_system.class);
                startActivity(i);

            }
        });
    }
}
