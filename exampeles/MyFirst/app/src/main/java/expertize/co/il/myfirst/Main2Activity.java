package expertize.co.il.myfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void open3(View view) {
        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }
}
