package buttons.storytelleraman.com.labswitch;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Add_System_dialog extends AppCompatDialogFragment {

    EditText nameIP,nameSys;
   private  Add_system_dialog_listener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater dialog_inflater = getActivity().getLayoutInflater();

        View view =dialog_inflater.inflate(R.layout.add_system_dialog,null);

        builder.setView(view).setTitle("ADD SYSTEMS")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String Sname=nameIP.getText().toString();
                        String S_IP=nameSys.getText().toString();
                       listener.saveTexts(S_IP,Sname);
                    }
                });
        nameIP=(EditText)view.findViewById(R.id.IP_dialog_id);
        nameSys=(EditText)view.findViewById(R.id.Sys_name_id);
        return  builder.create();


    }
     @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        /*try {
            listener =(Add_system_dialog_listener) context;
        } catch (ClassCastException e) {
           throw new  ClassCastException(context.toString()+"must implement Add_system_dialog_listener");
        }*/
    }

    public  interface Add_system_dialog_listener{
        void saveTexts(String IP,String Name);



   }
}
