package com.example.pr5;
import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.ImageView; import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class StateRVAdapter extends RecyclerView.Adapter<StateRVAdapter.VH> {
    private final List<State> data;
    public StateRVAdapter(List<State> data) { this.data = data; }
    @Override public VH onCreateViewHolder(ViewGroup p, int vt) { return new VH(LayoutInflater.from(p.getContext()).inflate(R.layout.item_state, p, false)); }
    @Override public void onBindViewHolder(VH h, int p) { State s=data.get(p); h.flag.setImageResource(s.getFlagResource()); h.name.setText(s.getName()); h.cap.setText(s.getCapital()); }
    @Override public int getItemCount() { return data.size(); }
    static class VH extends RecyclerView.ViewHolder { ImageView flag; TextView name, cap; VH(View v){ super(v); flag=v.findViewById(R.id.flag); name=v.findViewById(R.id.name); cap=v.findViewById(R.id.capital); }}
}