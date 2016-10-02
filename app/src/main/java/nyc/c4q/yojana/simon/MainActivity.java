package nyc.c4q.yojana.simon;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final String TAG = "SimonApp";

    public void onClick(View v) {
        final ImageButton button = (ImageButton) v;
        Log.d(TAG, v.getResources().getResourceName(v.getId()));
        switch (v.getId()) {
            case R.id.red:
                button.setColorFilter(Color.argb(100, 200, 0, 0));
                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                Log.i("tag", "This'll run 500 milliseconds later");
                                button.clearColorFilter();
                            }
                        }, 500);
                break;
            case R.id.blue1:
                button.setColorFilter(Color.argb(100, 0, 0, 200));
                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                Log.i("tag", "This'll run 500 milliseconds later");
                                button.clearColorFilter();
                            }
                        }, 500);


                break;
            case R.id.green:
                button.setColorFilter(Color.argb(100, 0, 200, 0));
                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                Log.i("tag", "This'll run 500 milliseconds later");
                                button.clearColorFilter();
                            }
                        }, 500);
                break;
            case R.id.yellow:
                button.setColorFilter(Color.argb(50, 0, 0, 0));
                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                Log.i("tag", "This'll run 500 milliseconds later");
                                button.clearColorFilter();
                            }
                        }, 500);

                break;
            default:
                Log.e(TAG, "Unknow Button");
        }
    }
}

//TAG= value never change
//catogorize the messsage,
//final for constants