package com.example.pr5;
import android.content.Context; import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.ArrayAdapter; import android.widget.ImageView; import android.widget.TextView;
import java.util.List;
public class StateAdapterOptimized extends ArrayAdapter<State> {
    private LayoutInflater inflater; private int layout;
    public StateAdapterOptimized(Context ctx, int res, List<State> data) { super(ctx, res, data); inflater=LayoutInflater.from(ctx); layout=res; }
    @Override public View getView(int pos, View conv, ViewGroup parent) {
        ViewHolder vh;
        if(conv==null){ conv=inflater.inflate(layout, parent, false); vh=new ViewHolder(conv); conv.setTag(vh); }
        else vh=(ViewHolder)conv.getTag();
        State s = getItem(pos);
        vh.flag.setImageResource(s.getFlagResource()); vh.name.setText(s.getName()); vh.cap.setText(s.getCapital());
        return conv;
    }
    static class ViewHolder { ImageView flag; TextView name, cap; ViewHolder(View v){ flag=v.findViewById(R.id.flag); name=v.findViewById(R.id.name); cap=v.findViewById(R.id.capital); }}
}