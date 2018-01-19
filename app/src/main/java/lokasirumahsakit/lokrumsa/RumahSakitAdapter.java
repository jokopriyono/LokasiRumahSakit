package lokasirumahsakit.lokrumsa;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RumahSakitAdapter extends RecyclerView.Adapter<RumahSakitAdapter.ViewHolder>{
    private List<DataRumahSakit> dataRumahSakit;

    public RumahSakitAdapter(List<DataRumahSakit> dataRumahSakit) {
        this.dataRumahSakit = dataRumahSakit;
    }

    @Override
    public RumahSakitAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rumah_sakit, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RumahSakitAdapter.ViewHolder holder, int position) {
        holder.txtNama.setText(dataRumahSakit.get(position).getNama());
        holder.txtAlamat.setText(dataRumahSakit.get(position).getAlamat());
    }

    @Override
    public int getItemCount() {
        return dataRumahSakit.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNama, txtAlamat;

        ViewHolder(View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txt_nama);
            txtAlamat = itemView.findViewById(R.id.txt_alamat);
        }
    }
}
