package intelligence.geniusapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;


public class GameModes extends ActionBarActivity {
/*    GridView gridView;

    static final String[] modes = new String[] {

            "흑과 백 I", "흑과 백 II", "전략윷놀이", "인디언 포커", "인디언 홀덤"
    };*/
    TextView t1, t2, t3, t4, t5, t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_modes);
        /*gridView = (GridView) findViewById(R.id.gridview1);

        // Create adapter to set value for grid view
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, modes);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Toast.makeText(getApplicationContext(),
                        ((TextView) v).getText()  , Toast.LENGTH_SHORT).show();

            }
        });

*/
        t1 = (TextView) findViewById(R.id.text1);
        t2 = (TextView) findViewById(R.id.text2);
        t3 = (TextView) findViewById(R.id.text3);
        t4 = (TextView) findViewById(R.id.text4);
        t5 = (TextView) findViewById(R.id.text5);
        t6 = (TextView) findViewById(R.id.text6);


        t1.setClickable(true);
        t2.setClickable(true);
        t3.setClickable(true);
        t4.setClickable(true);
        t5.setClickable(true);
        t6.setClickable(true);


        t1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[0,0] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[0,1] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[0,2] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[1,0] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[1,1] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[1,2] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_modes, menu);
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
