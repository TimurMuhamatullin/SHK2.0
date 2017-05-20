package nnooadb.shk;

import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private Handler handler;
    private Time time;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView  = (TextView) findViewById(R.id.textView12);
        textView2 = (TextView) findViewById(R.id.textView13);
        textView3 = (TextView) findViewById(R.id.textView14);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button12);

        final Intent intent  = new Intent(MainActivity.this, Notes.class);
        final Intent intent2 = new Intent(MainActivity.this, Rospisaniye.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
        if(!watchFile("Zam6File.txt")){openFile("Zam6File.txt");}
        if(!watchFile("Zam5File.txt")){openFile("Zam5File.txt");}
        if(!watchFile("Zam4File.txt")){openFile("Zam4File.txt");}
        if(!watchFile("Zam3File.txt")){openFile("Zam3File.txt");}
        if(!watchFile("Zam2File.txt")){openFile("Zam2File.txt");}
        if(!watchFile("Zam1File.txt")){openFile("Zam1File.txt");}

        time = new Time();
        time.setToNow();
        textView.setText(time.format("%H:%M:%S"));
        textView2.setText(time.format("%d.%m.%Y"));
        Runnable r = new Runnable(){

            @Override
            public void run() {
                        time.setToNow();
                        textView.setText(time.format("%H:%M:%S"));
                        textView2.setText(time.format("%d.%m.%Y"));
                        handler.postDelayed(this, 1000);
            }
        };

        handler = new Handler();
        handler.postDelayed(r, 1000);
    }

    protected void onResume(){
        super.onResume();
        if(!watchFile("Zam6File.txt")){openFile("Zam6File.txt");}
        if(!watchFile("Zam5File.txt")){openFile("Zam5File.txt");}
        if(!watchFile("Zam4File.txt")){openFile("Zam4File.txt");}
        if(!watchFile("Zam3File.txt")){openFile("Zam3File.txt");}
        if(!watchFile("Zam2File.txt")){openFile("Zam2File.txt");}
        if(!watchFile("Zam1File.txt")){openFile("Zam1File.txt");}

    }
    private void openFile(String fileName) {
        try {
            InputStream inputStream = openFileInput(fileName);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    builder.append(line).append("\n");
                }

                inputStream.close();
                textView3.setText(builder.toString());
            }
        } catch (Throwable ignored) {}
    }
    private boolean watchFile(String fileName) {
        try {
            InputStream inputStream = openFileInput(fileName);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    builder.append(line).append("\n");
                }

                inputStream.close();
                if(builder.toString().isEmpty()){return true;}
            }
        } catch (Throwable ignored) {}
        return false;
    }
    }

