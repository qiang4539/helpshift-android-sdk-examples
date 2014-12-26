package com.helpshift.helpshiftdemogradle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.helpshift.Helpshift;

public class DemoActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo);
    Helpshift.install(getApplication(),
        "518c9d6472a68a2ab99a42c26567e24f",
        "test.helpshift.com",
        "test_platform_20121108053758969-8f405d202ca65d5");
    android.util.Log.d("daniel", Helpshift.libraryVersion + " - is the version for gradle");

    Button helpButton = (Button) findViewById(R.id.help);
    helpButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Helpshift.showFAQs(DemoActivity.this);
      }
    });

  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.demo, menu);
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
