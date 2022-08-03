package com.example.gestion_viviendas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.gestion_viviendas.R;

import java.util.ArrayList;
import java.util.Map;

public class OportunidadesAdapter extends BaseExpandableListAdapter {

    private ArrayList<String> listcategoria;
    private Map<String,ArrayList<String>> mapchild;
    private Context context;

    public OportunidadesAdapter(ArrayList<String> listcategoria, Map<String, ArrayList<String>> mapchild, Context context) {
        this.listcategoria = listcategoria;
        this.mapchild = mapchild;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return listcategoria.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mapchild.get(listcategoria.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listcategoria.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mapchild.get(listcategoria.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String categoria= (String) getGroup(groupPosition);
        convertView= LayoutInflater.from(context).inflate(R.layout.group_oportunity,null);
        TextView group=convertView.findViewById(R.id.group2);
        group.setText(categoria);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String item= (String) getChild(groupPosition,childPosition);
        convertView= LayoutInflater.from(context).inflate(R.layout.child_oportunity,null);
        TextView child=convertView.findViewById(R.id.child2);
        child.setText(item);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
