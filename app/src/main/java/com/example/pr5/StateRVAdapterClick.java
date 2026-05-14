package com.example.pr5;
import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.ImageView; import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class StateRVAdapterClick extends RecyclerView.Adapter<StateRVAdapterClick.VH> {
    private final List<State> data; private final OnClick listener;
    public interface OnClick { void onClick(State s, int pos); }
    public StateRVAdapterClick(List<State> d, OnClick l) { data=d; listener=l; }
    @Override public VH onCreateViewHolder(ViewGroup p, int vt) { return new VH(LayoutInflater.from(p.getContext()).inflate(R.layout.item_state, p, false)); }
    @Override public void onBindViewHolder(VH h, int p) { State s=data.get(p); h.flag.setImageResource(s.getFlagResource()); h.name.setText(s.getName()); h.cap.setText(s.getCapital()); h.itemView.setOnClickListener(v -> listener.onClick(s,p)); }
    @Override public int getItemCount() { return data.size(); }
    static class VH extends RecyclerView.ViewHolder { ImageView flag; TextView name, cap; VH(View v){ super(v); flag=v.findViewById(R.id.flag); name=v.findViewById(R.id.name); cap=v.findViewById(R.id.capital); }}
}