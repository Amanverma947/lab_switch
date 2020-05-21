package buttons.storytelleraman.com.labswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Add_system extends AppCompatActivity implements Add_System_dialog.Add_system_dialog_listener
{
    Button add;
    Database_handeler dbhandeler= Temp_DB.getDB_handler();
    String default_list[]={"System 1","System 2","System 3","System 4","System 5","System 6","System 7","System 8","System 9","System 10","System 11","System 12"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_system);
        Database_handeler database_handeler=new Database_handeler(getApplicationContext(),"lab_Switch_DB",null,1);

        RecyclerView system_list=(RecyclerView)findViewById(R.id.system_list);
        system_list.setLayoutManager(new LinearLayoutManager(this));
        system_list.setAdapter(new System_adapter(default_list));
        Temp_DB.setDB_handler(database_handeler);
        add=(Button)findViewById(R.id.add_button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }


        });


    }
    private void openDialog() {
        Add_System_dialog addDialog = new Add_System_dialog();
        addDialog.show(getSupportFragmentManager(),"ADD Systems");
    }


    @Override
    public void saveTexts(String IP, String Name) {

        default_list[1]=Name;default_list[3]=IP;

        if(IP.equals("")||(Name.equals(""))){
            Toast.makeText(this,"Please fill all the details",Toast.LENGTH_SHORT).show();
        }
        else {
            User_DB user = new User_DB();
            user.setIP_address(IP);
            user.setSystem_name(Name);
            int i =dbhandeler.insertSystem(user);
            if(i==1)
            {
                Toast toast=Toast.makeText(this,"Data Inserted",Toast.LENGTH_LONG);
                toast.setGravity(50,50,50);
                toast.show();

            }
            else
            {
                Toast.makeText(this,"Data Not Inserted",Toast.LENGTH_LONG).show();

            }

        }

    }
}
