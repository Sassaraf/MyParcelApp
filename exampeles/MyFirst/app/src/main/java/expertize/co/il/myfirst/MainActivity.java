package expertize.co.il.myfirst;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getString(R.string.app_name),"onCreate");

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(getString(R.string.app_name),"button click");
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getString(R.string.app_name),"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getString(R.string.app_name),"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(getString(R.string.app_name),"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getString(R.string.app_name),"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getString(R.string.app_name),"onDestroy");
    }


}
