package com.applications.sakshirambhia.yoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ArrayList<String> mCountries = new ArrayList<String>();
    public void getCountryData()
    {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales)
        {
            String country = locale.getDisplayCountry();
            if (country.trim().length()>0 && !mCountries.contains(country))
            {
                mCountries.add(country);
            }
        }
        Collections.sort(mCountries);
    }

    package com.example.hp1.materialtoolbar;

    import android.support.v4.widget.DrawerLayout;
    import android.support.v7.app.ActionBarActivity;
    import android.os.Bundle;
    import android.support.v7.app.ActionBarDrawerToggle;
    import android.support.v7.widget.LinearLayoutManager;
    import android.support.v7.widget.RecyclerView;
    import android.support.v7.widget.Toolbar;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.MotionEvent;
    import android.view.View;
    import android.widget.Toast;


    public class MainActivity extends ActionBarActivity { /* When using Appcombat support library
                                                         you need to extend Main Activity to
                                                         ActionBarActivity.
                                                      */


        private Toolbar toolbar;                              // Declaring the Toolbar Object


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);

            toolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
            setSupportActionBar(toolbar);                   // Setting toolbar as the ActionBar with setSupportActionBar() call

        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }

