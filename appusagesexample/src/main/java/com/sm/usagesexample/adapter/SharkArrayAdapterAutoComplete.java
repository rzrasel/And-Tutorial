package com.sm.usagesexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sm.usagesexample.ModelAutoComplete;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rz Rasel on 2017-12-26.
 */

public class SharkArrayAdapterAutoComplete extends ArrayAdapter<ModelAutoComplete> {
    private Context context;
    private int layoutResourceId;
    public ArrayList<SharkModelRowViewFields> rowViewFieldListItems = new ArrayList<SharkModelRowViewFields>();
    private ArrayList<ModelAutoComplete> adapterListItems; // = new ArrayList<ModelInit>();
    //private ArrayList<T> customers, tempCustomer, suggestions;
    private ArrayList<ModelAutoComplete> suggestions;
    private OnFieldListenerHandler onFieldListenerHandler = null;
    //private AdapterDynamicArrayAdapter.OnEventsListenerHandler onEventsListenerHandler = null;
    private boolean isClicked = false;
    private int selectedPosition;
    private int checkedColor;

    public SharkArrayAdapterAutoComplete(Context argContext, int argLayoutResourceId, ArrayList<ModelAutoComplete> argAdapterListItems) {
        super(argContext, argLayoutResourceId, argAdapterListItems);
        this.context = argContext;
        this.layoutResourceId = argLayoutResourceId;
        this.adapterListItems = argAdapterListItems;
        this.suggestions = argAdapterListItems;
    }

    @Override
    public int getCount() {
        return adapterListItems.size();
    }

    @Override
    public ModelAutoComplete getItem(int argPosition) {
        return adapterListItems.get(argPosition);
    }

    @Override
    public long getItemId(int argPosition) {
        return argPosition;
    }

    public SharkArrayAdapterAutoComplete onSetRowViewFieldList(ArrayList<SharkModelRowViewFields> argRowViewFieldListItems) {
        rowViewFieldListItems = argRowViewFieldListItems;
        return this;
    }

    public SharkArrayAdapterAutoComplete onSetRowViewFieldListenerHandler(OnFieldListenerHandler argOnFieldListenerHandler) {
        onFieldListenerHandler = argOnFieldListenerHandler;
        return this;
    }

    @Override
    public View getView(int argPosition, View argConvertView, ViewGroup argParent) {
        View rowViewRoot = argConvertView;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (argConvertView == null) {
            rowViewRoot = layoutInflater.inflate(layoutResourceId, argParent, false);
            //rowViewRoot.setTag(listRowViewFields);
        } else {
        }
        if (rowViewRoot != null) {
            //onInitializedLayoutFields(context, rowViewRoot);
            SharkInitializedRowLayout.onSetRowFields(context, rowViewRoot, rowViewFieldListItems);
            //Object item = getItem(argPosition);
            Object items = adapterListItems.get(argPosition);
            //if(list.get(argPosition)  instanceof A)
            if (onFieldListenerHandler != null) {
                onFieldListenerHandler.onSetFieldValue(rowViewFieldListItems, items);
            }
        }
        //System.out.println("|----|------------|AdapterData|----|" + argPosition);
        return rowViewRoot;
    }

    public void setSelectedPosition(int argPosition, boolean argIsClicked, int argCheckedColor) {

        this.selectedPosition = argPosition;
        this.isClicked = argIsClicked;
        this.checkedColor = argCheckedColor;

    }

    public interface OnFieldListenerHandler {
        public void onSetFieldValue(ArrayList<SharkModelRowViewFields> argRowViewFieldList, Object argObject);
        //public void onSetResourceLayout(int argLayoutResourceId);
        //Customer cust = (Customer) pObject;
    }

    @Override
    public Filter getFilter() {
        return myFilter;
    }

    Filter myFilter = new Filter() {
        @Override
        public CharSequence convertResultToString(Object resultValue) {
            ModelAutoComplete modelAutoComplete = (ModelAutoComplete) resultValue;
            return modelAutoComplete.getTitle() + " " + modelAutoComplete.getDescription();
        }

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            if (constraint != null) {
                suggestions.clear();
                //suggestions = new ArrayList<>();
                for (ModelAutoComplete item : adapterListItems) {
                    if (item.getTitle().toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        suggestions.add(item);
                    }
                }
                /*for (Iterator iterator = adapterListItems.iterator(); iterator.hasNext(); ) {
                    Object object = iterator.next();
                    ModelAutoComplete item = (ModelAutoComplete) object;
                    if (item.getTitle().toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        modelAutoCompletes.add(item);
                    }
                }
                suggestions = modelAutoCompletes;*/

                FilterResults filterResults = new FilterResults();
                filterResults.values = suggestions;
                filterResults.count = suggestions.size();
                return filterResults;
            } else {
                return new FilterResults();
            }
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            ArrayList<ModelAutoComplete> autoCompletes = (ArrayList<ModelAutoComplete>) results.values;
            if (results != null && results.count > 0) {
                clear();
                for (ModelAutoComplete cust : autoCompletes) {
                    //Object object = cust;
                    add(cust);
                    notifyDataSetChanged();
                }
            }
        }
    };
}