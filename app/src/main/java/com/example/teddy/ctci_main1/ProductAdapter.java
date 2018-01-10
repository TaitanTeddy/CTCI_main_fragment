package com.example.teddy.ctci_main1;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Teddy on 2018/1/3.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>  {

    //this  context we will use to inflate the layout
    private Context context;

    //we are storing all the products in a list
    private List<Product> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context context, List<Product> productList){
        this.context = context;
        this.productList = productList;
    }


    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_main,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductAdapter.ProductViewHolder holder, final int position) {
        //getting the product od the specified position
        final Product product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewDate.setText(product.getDate());
        holder.textViewState.setText(product.getStateTitle());
        //holder.textViewTimeTitle.setText(product.getTimeTitle());
        //holder.textViewDurationTitle.setText(product.getDurationTitle());
        holder.textViewTime.setText(product.getTime());
        holder.textViewDuration.setText(product.getDuration());
        //holder.imageView.setImageDrawable(context.getResources().getDrawable(product.getImage()));
        if(product.getState() ==0){
            //holder.cardView.setCardBackgroundColor(ContextCompat.getColor(this.context,R.color.colorPrimary));
        }if (product.getState()==1){
            //holder.cardView.setBackgroundResource(R.drawable.ic_launcher_background);
        }if(product.getState()==2){
            holder.cardView.setBackgroundResource(android.R.drawable.spinner_background);
        }

        //set onclickListener on cardView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Toast.makeText(view.getContext(),"0000000",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(view.getContext(),"1111111",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView textViewDate, textViewState, textViewTimeTitle, textViewDurationTitle, textViewTime,textViewDuration;
       // ImageView imageView;
        CardView cardView;

        public ProductViewHolder(View itemView){
            super(itemView);

            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewState= itemView.findViewById(R.id.textViewState);
            textViewTimeTitle = itemView.findViewById(R.id.textViewTimeTitle);
            textViewDurationTitle = itemView.findViewById(R.id.textViewDurationTitle);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            textViewDuration = itemView.findViewById(R.id.textViewDuration);
            //imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

}
