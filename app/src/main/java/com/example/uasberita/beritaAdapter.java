package com.example.uasberita;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class beritaAdapter extends RecyclerView.Adapter<beritaAdapter.ViewHolder>{
    private List<Berita> listBerita;
    private Activity activity;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public beritaAdapter(List<Berita> listBerita, Activity activity){
        this.listBerita = listBerita;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_berita, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Berita berita = listBerita.get(position);
        holder.txtJudul.setText(berita.getJudul());
        holder.txtIsi.setText(berita.getIsi());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setPositiveButton("iya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        databaseReference.child("Berita").child(berita.getKey()).removeValue().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(activity, "Data berita berhasil dihapus", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(activity, "Data gagal dihapus", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setMessage("Apakah yakin akan dihapus? " + berita.getJudul());
                builder.show();
            }
        });

        holder.update.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                FragmentManager fragmentManager = ((AppCompatActivity)activity).getSupportFragmentManager();
                DialogForm dialogForm = new DialogForm(
                        berita.getJudul(),
                        berita.getKategori(),
                        berita.getIsi(),
                        berita.getKey(),
                        "Ubah"
                );
                dialogForm.show(fragmentManager, "form");
                return true;
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), detailBerita.class);

                intent.putExtra("judul", berita.getJudul());
                intent.putExtra("isi", berita.getIsi());
                v.getContext().startActivity(intent);

//                Toast.makeText(holder.itemView.getContext(), "" +
//                        listBerita.get(holder.getAdapterPosition()).getJudul(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtJudul, txtIsi;
        Spinner spinner;
        Button update, delete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtJudul = itemView.findViewById(R.id.txt_judul);
            txtIsi = itemView.findViewById(R.id.txt_isi);
            spinner = itemView.findViewById(R.id.txt_kategori);
            update = itemView.findViewById(R.id.btn_update);
            delete = itemView.findViewById(R.id.btn_delete);
        }
    }
}