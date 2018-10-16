package com.example.luisangel.appsimplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterLista extends RecyclerView.Adapter<AdapterLista.ViewHolder> {
    ArrayList<String> listaDatos;

    public AdapterLista(ArrayList<String> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Enlazar el adaptador con el archivo item_list
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        //
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Establece la comunicación entre nuestro adaptador y
        //la clase viewHolder
        holder.cargardatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDato;

        public ViewHolder(View itemView) {
            super(itemView);

            tvDato = (TextView)itemView.findViewById(R.id.tvItem);

        }

        public void cargardatos(String info) {
            tvDato.setText(info);
        }
    }
}
