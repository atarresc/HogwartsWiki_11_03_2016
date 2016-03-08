package cat.albert.hogwartswiki.views.impl.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Object;

public class ObjectListAdapter extends ArrayAdapter<Object>{
    private Context context;
    private LayoutInflater inflater;

    public ObjectListAdapter(Context context, List<Object> comments) {
        super(context, 0, comments);

        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ObjectHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.object_list, parent, false);

            holder = new ObjectHolder();
            addViewsToHolder(convertView, holder);
            convertView.setTag(holder);
        } else {
            holder = (ObjectHolder) convertView.getTag();
        }
        Object object = getItem(position);
        setDataIntoHolder(holder, object);

        return convertView;
    }

    private void addViewsToHolder(View convertView, ObjectHolder holder) {
        holder.objectName = (TextView) convertView.findViewById(R.id.main_txtview_objectname);
        holder.objectInfo = (TextView) convertView.findViewById(R.id.main_txtview_objectinfo);
        holder.imageView = (ImageView) convertView.findViewById(R.id.imageView_3);
    }

    private void setDataIntoHolder(ObjectHolder holder, Object object) {
        holder.objectName.setText(String.format("Nom: %s", object.getObjectName()));
        holder.objectInfo.setText(String.format("Funció: %s", object.getObjectInfo()));
        holder.imageView.setImageResource(object.getImatge());
    }

    class ObjectHolder {
        TextView objectName;
        TextView objectInfo;
        ImageView imageView;
    }
}