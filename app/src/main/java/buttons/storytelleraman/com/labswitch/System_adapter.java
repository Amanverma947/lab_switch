package buttons.storytelleraman.com.labswitch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class System_adapter extends RecyclerView.Adapter<System_adapter.System_viewholder> {
    private String system_IP[];

    public  System_adapter(String system_IP[]){
        this.system_IP=system_IP;
    }
    @NonNull
    @Override
    public System_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.add_system_view,parent,false);
        return new System_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull System_viewholder holder, int position) {
        String name = system_IP[position];
        holder.sys_name.setText(name);

    }

    @Override
    public int getItemCount() {
        return system_IP.length;
    }

    public  class System_viewholder extends RecyclerView.ViewHolder {
        ImageView sys_icon;
        TextView sys_name;
        public System_viewholder(@NonNull View itemView) {
            super(itemView);
            sys_icon=itemView.findViewById(R.id.system_icon);
            sys_name=itemView.findViewById(R.id.system_name);
        }
    }
}
