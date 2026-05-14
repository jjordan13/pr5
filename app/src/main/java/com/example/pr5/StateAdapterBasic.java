package com.example.pr5;
import android.content.Context; import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.ArrayAdapter; import android.widget.ImageView; import android.widget.TextView;
import java.util.List;
public class StateAdapterBasic extends ArrayAdapter<State> {
    private LayoutInflater inflater; private int layout;
    public StateAdapterBasic(Context ctx, int res, List<State> data) { super(ctx, res, data); inflater=LayoutInflater.from(ctx); layout=res; }
    @Override public View getView(int pos, View conv, ViewGroup parent) {
        View view = inflater.inflate(layout, parent, false);
        State s = getItem(pos);
        ((ImageView)view.findViewById(R.id.flag)).setImageResource(s.getFlagResource());
        ((TextView)view.findViewById(R.id.name)).setText(s.getName());
        ((TextView)view.findViewById(R.id.capital)).setText(s.getCapital());
        return view;
    }
}