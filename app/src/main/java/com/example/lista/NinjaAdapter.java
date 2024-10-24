package com.example.lista;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NinjaAdapter extends RecyclerView.Adapter<NinjaAdapter.NinjaViewHolder> {

    private List<Ninja> ninjaList;

    public NinjaAdapter(List<Ninja> ninjaList) {
        this.ninjaList = ninjaList;
    }

    @NonNull
    @Override
    public NinjaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ninja, parent, false);
        return new NinjaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NinjaViewHolder holder, int position) {
        Ninja ninja = ninjaList.get(position);
        holder.imageViewNinja.setImageResource(ninja.getImagen());
        holder.textViewName.setText(ninja.getNombre());
        holder.textViewWeapon.setText(ninja.getArma());
        holder.textViewFeature.setText(ninja.getCaracteristica());
    }

    @Override
    public int getItemCount() {
        return ninjaList.size();
    }

    static class NinjaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewNinja;
        TextView textViewName, textViewWeapon, textViewFeature;

        public NinjaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewNinja = itemView.findViewById(R.id.imageViewNinja);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewWeapon = itemView.findViewById(R.id.textViewWeapon);
            textViewFeature = itemView.findViewById(R.id.textViewFeature);
        }
    }
}
