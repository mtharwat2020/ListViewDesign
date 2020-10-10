package com.example.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.ArrayList;
import de.hdodenhof.circleimageview.CircleImageView;



public class CustomAdapter extends ArrayAdapter<TestObject> {

    public static final String LOG_TAG = CustomAdapter.class.getSimpleName();


    private ArrayList<Boolean> hasMedal = new ArrayList<Boolean>(); // arrayList for store medals


    public CustomAdapter(Context context, ArrayList<TestObject> testObjects) {
        super(context, 0, testObjects);


        // loop to identify that the first, second and third person in the arrayList (testObjects) has medals
        // note that : The two ArrayLists should be equal in size
        for (int i = 0; i < testObjects.size(); i++) {
            if (i < 3) {
                hasMedal.add(i, true);
            } else {
                hasMedal.add(i, false);
            }
        }


    }


    public View getView(int position, View convertView,ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_test, parent, false);
        }


        TestObject testObject = getItem(position);


        View backgroundView = listItemView.findViewById(R.id.item);
        Drawable itemViewBackground = (Drawable) backgroundView.getBackground().mutate();
        int backgroundColor = ContextCompat.getColor(getContext(), getBackgroundColor(testObject.getRank()));
        DrawableCompat.setTint(itemViewBackground, backgroundColor);


        TextView rankTextView = listItemView.findViewById(R.id.rank);
        rankTextView.setText(String.valueOf(testObject.getRank()));


        CircleImageView picImageView = listItemView.findViewById(R.id.pic);
        picImageView.setImageResource(testObject.getPersonImageResourceId());


        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(testObject.getName());


        TextView pointsTextView = listItemView.findViewById(R.id.points);
        pointsTextView.setText(String.valueOf(testObject.getTotalPoints()));




        // pos will refer to index in the boolean arrayList
        // items with both true and false values implement line 85 , but
        // if statement works with ----just----- true values to show medals on the screen
        ImageView medalImageView = listItemView.findViewById(R.id.medal);
        medalImageView.setVisibility(View.INVISIBLE);

        final int pos = position;
        if (hasMedal.get(pos)) {
            int medalResourceId = getMedal(testObject.getRank());
            medalImageView.setImageResource(medalResourceId);
            medalImageView.setVisibility(View.VISIBLE);
        }


        // you can see logs for more info , and
        // try to comment line 85 or 91 or both of them and watch the difference
        Log.i(LOG_TAG, "position: " + pos + " - boolean state: " + hasMedal.get(position));


        return listItemView;
    }


    private int getBackgroundColor(int num) {

        int resourceId;
        switch (num) {
            case 1:
                resourceId = R.color.goldBackground;
                break;
            case 2:
                resourceId = R.color.silverBackground;
                break;
            case 3:
                resourceId = R.color.bronzeBackground;
                break;
            default:
                resourceId = R.color.primaryLightColor;
        }
        return resourceId;
    }


    private int getMedal(int num) {

        int resourceId;

        if (num == 1) {
            resourceId = R.drawable.medal_gold;
        } else if ( num == 2) {
            resourceId = R.drawable.medal_silver;
        } else {
            resourceId = R.drawable.medal_bronze;
        }

        return resourceId;
    }


}