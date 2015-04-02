package ucsc.mcs13440012.assignment04;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void Calculate(View v){
        Button button = (Button) v;
        int firstNumber = Integer.parseInt(((EditText) findViewById(R.id.firstNumber)).getText().toString());
        int secondNumber = Integer.parseInt(((EditText) findViewById(R.id.secondNumber)).getText().toString());

        TextView answerText = (TextView) findViewById(R.id.answer);
        if(button.getText()=="ADD")
        {
            answerText.setText(firstNumber+secondNumber);
        }
        else
        {
            answerText.setText(firstNumber-secondNumber);
        }
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
