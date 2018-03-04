package lokasirumahsakit.lokrumsa;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RumahSakitAdapter extends RecyclerView.Adapter<RumahSakitAdapter.ViewHolder>{
    private List<DataRumahSakit> dataRumahSakit;
    private Context context;

    public RumahSakitAdapter(List<DataRumahSakit> dataRumahSakit, Context context) {
        this.dataRumahSakit = dataRumahSakit;
        this.context = context;
    }

    @Override
    public RumahSakitAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rumah_sakit, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RumahSakitAdapter.ViewHolder holder, int position) {
        if (dataRumahSakit.get(position).getUrlRS()!=null)
            Picasso.with(context).load(dataRumahSakit.get(position).getUrlRS())
                    .placeholder(R.drawable.blank).into(holder.imgRS);

        holder.txtNama.setText(dataRumahSakit.get(position).getNama());
        holder.txtAlamat.setText(dataRumahSakit.get(position).getAlamat());
        holder.cardRumahSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.linearDetail.getVisibility()==View.VISIBLE){
                    holder.linearDetail.setVisibility(View.GONE);
                } else {
                    holder.linearDetail.setVisibility(View.VISIBLE);
                }
            }
        });
        if (dataRumahSakit.get(position).getFasilitas1()!=null)
            holder.txtFasilitas1.setText(dataRumahSakit.get(position).getFasilitas1());
        if (dataRumahSakit.get(position).getFasilitas2()!=null)
            holder.txtFasilitas2.setText(dataRumahSakit.get(position).getFasilitas2());
        if (dataRumahSakit.get(position).getFasilitas3()!=null)
            holder.txtFasilitas3.setText(dataRumahSakit.get(position).getFasilitas3());
        if (dataRumahSakit.get(position).getFasilitas4()!=null)
            holder.txtFasilitas4.setText(dataRumahSakit.get(position).getFasilitas4());
        if (dataRumahSakit.get(position).getFasilitas5()!=null)
            holder.txtFasilitas5.setText(dataRumahSakit.get(position).getFasilitas5());
        if (dataRumahSakit.get(position).getFasilitas6()!=null)
            holder.txtFasilitas6.setText(dataRumahSakit.get(position).getFasilitas6());
        if (dataRumahSakit.get(position).getFasilitas7()!=null)
            holder.txtFasilitas7.setText(dataRumahSakit.get(position).getFasilitas7());
        if (dataRumahSakit.get(position).getFasilitas8()!=null)
            holder.txtFasilitas8.setText(dataRumahSakit.get(position).getFasilitas8());
        if (dataRumahSakit.get(position).getFasilitas9()!=null)
            holder.txtFasilitas9.setText(dataRumahSakit.get(position).getFasilitas9());
        if (dataRumahSakit.get(position).getFasilitas10()!=null)
            holder.txtFasilitas10.setText(dataRumahSakit.get(position).getFasilitas10());
        if (dataRumahSakit.get(position).getFasilitas11()!=null)
            holder.txtFasilitas11.setText(dataRumahSakit.get(position).getFasilitas11());
        if (dataRumahSakit.get(position).getFasilitas12()!=null)
            holder.txtFasilitas12.setText(dataRumahSakit.get(position).getFasilitas12());
        if (dataRumahSakit.get(position).getFasilitas13()!=null)
            holder.txtFasilitas13.setText(dataRumahSakit.get(position).getFasilitas13());
    }

    @Override
    public int getItemCount() {
        return dataRumahSakit.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNama, txtAlamat, txtFasilitas1, txtFasilitas2, txtFasilitas3, txtFasilitas4, txtFasilitas5, txtFasilitas6, txtFasilitas7, txtFasilitas8, txtFasilitas9, txtFasilitas10, txtFasilitas11, txtFasilitas12, txtFasilitas13;
        CardView cardRumahSakit;
        LinearLayout linearDetail;
        ImageView imgRS;

        ViewHolder(View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txt_nama);
            txtAlamat = itemView.findViewById(R.id.txt_alamat);
            txtFasilitas1 = itemView.findViewById(R.id.txt_fasilitas_1);
            txtFasilitas2 = itemView.findViewById(R.id.txt_fasilitas_2);
            txtFasilitas3 = itemView.findViewById(R.id.txt_fasilitas_3);
            txtFasilitas4 = itemView.findViewById(R.id.txt_fasilitas_4);
            txtFasilitas5 = itemView.findViewById(R.id.txt_fasilitas_5);
            txtFasilitas6 = itemView.findViewById(R.id.txt_fasilitas_6);
            txtFasilitas7 = itemView.findViewById(R.id.txt_fasilitas_7);
            txtFasilitas8 = itemView.findViewById(R.id.txt_fasilitas_8);
            txtFasilitas9 = itemView.findViewById(R.id.txt_fasilitas_9);
            txtFasilitas10 = itemView.findViewById(R.id.txt_fasilitas_10);
            txtFasilitas11 = itemView.findViewById(R.id.txt_fasilitas_11);
            txtFasilitas12 = itemView.findViewById(R.id.txt_fasilitas_12);
            txtFasilitas13 = itemView.findViewById(R.id.txt_fasilitas_13);
            cardRumahSakit = itemView.findViewById(R.id.card_rumah_sakit);
            linearDetail = itemView.findViewById(R.id.linear_detail);
            imgRS = itemView.findViewById(R.id.img_rumah_sakit);
        }
    }
}
