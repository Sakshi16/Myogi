package com.applications.sakshirambhia.yoga;

import android.app.Activity;

/**
 * Created by sakshirambhia on 10/11/16.
 */

public class thankPopup extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thanktutor);

        Button btn_show = (Button) findViewById(R.id.Save_tutor);
        btn_show.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                //Open popup window
                if (p != null)
                    showPopup(thankPopup.this, p);
            }
        });
    }
}
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        int[] location = new int[2];
        Button button = (Button) findViewById(R.id.Save_tutor);

        // Get the x, y location and store it in the location[] array
        // location[0] = x, location[1] = y.
        button.getLocationOnScreen(location);

        //Initialize the Point with x, and y positions
        p = new Point();
        p.x = location[0];
        p.y = location[1];
    }

    // The method that displays the popup.
    private void showPopup(final Activity context, Point p) {
        int popupWidth = 200;
        int popupHeight = 150;

        // Inflate the popup_layout.xml
        LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.thanktutor);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.thanktutor, viewGroup);
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Some offset to align the popup a bit to the right, and a bit down, relative to button's position.
        int OFFSET_X = 30;
        int OFFSET_Y = 30;

        // Clear the default translucent background

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(tutor_home, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);

        // Getting a reference to Close button, and close the popup when clicked.
        Button Ok = (Button) layout.findViewById(R.id.ok);
        close.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }
}
