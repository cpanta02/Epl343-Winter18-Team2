package com.example.panta.farmakio_client;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NgocTri on 11/15/2015.
 */
public class ProductListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Product> mProductList;

    //Constructor

    public ProductListAdapter(Context mContext, List<Product> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.product_object, null);
        TextView tvName = (TextView)v.findViewById(R.id.ProductName);
        TextView tvPrice = (TextView)v.findViewById(R.id.ProductPrice);
        //TextView tvDescription = (TextView)v.findViewById(R.id.tv_description);
        //Set text for TextView
        tvName.setText(mProductList.get(position).getName());
        tvPrice.setText(String.valueOf(mProductList.get(position).getPrice()) + " $");
      //  tvDescription.setText(mProductList.get(position).getDescription());

        //Save product id to tag
        v.setTag(mProductList.get(position).getId());

        return v;
    }
}
