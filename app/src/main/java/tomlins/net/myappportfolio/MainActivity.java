package tomlins.net.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View.OnClickListener listener = new MyButtonClickListener();

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(listener);

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(listener);

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(listener);

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(listener);

        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(listener);

        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(listener);


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

    private void displayToast(View view) {
        if (view instanceof Button) {
            CharSequence text = "This will launch my " + ((Button)view).getText() + " app";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), text, duration);
            toast.show();
        }
    }

    private class MyButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            displayToast(view);
        }
    }
}
