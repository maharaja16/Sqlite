package com.example.recycle;

import android.net.sip.SipSession;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> implements Filterable {

    private List<Exampleitem> ExampleList;
    private ArrayList<Exampleitem> mExampleList;
     private List<Exampleitem>  exampleitemListFull;


   public static class ExampleViewHolder extends RecyclerView.ViewHolder {


       private ArrayList<Exampleitem> mExampleList;
       public ImageView mImageView;
       public TextView mTextView1;
       public TextView mTextView2;


       public ExampleViewHolder(ArrayList<Exampleitem> mExampleList, View itemView, MainActivity.OnItemClickListener listener) {
           super (itemView);
           this.mExampleList = mExampleList;
           mImageView = itemView.findViewById (R.id.imageView);
           mTextView1 = itemView.findViewById (R.id.textview);
           mTextView2 = itemView.findViewById (R.id.textview2);


       }
   }
     <exampleList> ExampleAdapter(List<Exampleitem> exampleList) {
       this.ExampleList = exampleList;
       exampleitemListFull =   exampleList ;
     }







    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V = LayoutInflater.from (parent.getContext ()).inflate (R.layout.example_item, parent, false);
        MainActivity.OnItemClickListener mListener = null;
        ExampleViewHolder evh= new ExampleViewHolder (mExampleList, V, mListener);
        return evh;
    }


    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
       Exampleitem currentItem = mExampleList.get (position);

       holder.mImageView.setImageResource (currentItem.getmImageResource ());
       holder.mTextView1.setText (currentItem.getmTEXT1 ());
       holder.mTextView2.setText (currentItem.getmText2 ());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size ();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private final Filter exampleFilter = new Filter ( ) {
        private Object Constraints;

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Exampleitem> filteredList = new ArrayList<> ( );

            if (Constraints == null) {
                filteredList.addAll (exampleitemListFull);
            } else {
                String filterPattern = constraint.toString ( ).toLowerCase ( ).trim ( );

                for (Exampleitem item: exampleitemListFull){
                    if (item.getmTEXT1 ().toLowerCase ().contains (filterPattern)) {
                        filteredList.add (item);
                    }
                }
            }

            FilterResults results = new FilterResults ();
            results.values = filteredList;

            return results;

        }




        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            exampleitemListFull.clear ();
            exampleitemListFull.addAll ((List)results.values);
            notifyDataSetChanged ();

        }
    };
    }