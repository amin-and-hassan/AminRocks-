package com.elmehalawi.httprequest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HTTPRequestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void httpOnClick(View v) {
    	TextView text = (TextView) findViewById(R.id.textView1);
    	RequestTask t = new RequestTask(text);
        t.execute("http://yahoo.com");
    }
    
}
