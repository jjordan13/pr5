package com.example.pr5;
import android.content.Context; import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.ArrayAdapter; import android.widget.Button; import android.widget.TextView;
import java.util.List;
public class ProductAdapter extends ArrayAdapter<Product> {
    private LayoutInflater inflater;
    public ProductAdapter(Context ctx, int res, List<Product> data) { super(ctx, res, data); inflater=LayoutInflater.from(ctx); }
    @Override public View getView(int pos, View conv, ViewGroup parent) {
        ViewHolder vh;
        if(conv==null){ conv=inflater.inflate(R.layout.item_product, parent, false); vh=new ViewHolder(conv); conv.setTag(vh); }
        else vh=(ViewHolder)conv.getTag();
        final Product p = getItem(pos);
        vh.name.setText(p.getName()); vh.count.setText(p.getCount()+" "+p.getUnit());
        vh.add.setOnClickListener(v -> { p.setCount(p.getCount()+1); vh.count.setText(p.getCount()+" "+p.getUnit()); });
        vh.rem.setOnClickListener(v -> { int c=p.getCount()-1; if(c<0)c=0; p.setCount(c); vh.count.setText(c+" "+p.getUnit()); });
        return conv;
    }
    static class ViewHolder{ Button add,rem; TextView name,count; ViewHolder(View v){ add=v.findViewById(R.id.add); rem=v.findViewById(R.id.rem); name=v.findViewById(R.id.name); count=v.findViewById(R.id.count); }}
}