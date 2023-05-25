package net.mbr.reporter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import net.mbr.reporter.model.Data;

import java.util.List;

public class MyDataAdapter  extends RecyclerView.Adapter<MyDataAdapter.ViewHolder> {


    private List<Data> data;

    public MyDataAdapter(List<Data> data) {
        this.data = data;
    }
    @NonNull
    @Override
    public MyDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyDataAdapter.ViewHolder holder, int position) {
        Data item = data.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView tv_name;
        private TextView tv_family;
        private TextView tv_id;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            tv_name = itemView.findViewById(R.id.tv_name_value);
            tv_family=itemView.findViewById(R.id.tv_family_value);
            tv_id= itemView.findViewById(R.id.tv_id);
        }

        public void bind(Data item) {
            tv_name.setText(item.getName());
            tv_family.setText(item.getFamily());
            tv_id.setText(String.valueOf(item.getId()));

        }
    }

}
