package bjs.dev.Adapter;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import com.marshalchen.ultimaterecyclerview.*;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import bjs.dev.model.Mobil;
import com.marshalchen.ultimaterecyclerview.expanx.Util.parent;

import java.util.ArrayList;

public class MobilAdapter extends RecyclerView.Adapter<MobilAdapter.ListViewHolder> {

    private ArrayList<Mobil> listMobil;
 /*   private OnItemClickCallback onItemClickCallback;

    void SetOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback=onItemClickCallback;
    }
   */

   MobilAdapter(ArrayList<Mobil> list){
       this.listMobil=list;
   }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

       View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ro,viewGroup,false);

       return new MobilAdapter(view);





    }

    @Override
    public void onBindViewHolder(@NonNull MobilAdapter.ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
