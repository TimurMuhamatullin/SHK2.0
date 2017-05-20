package nnooadb.shk;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Notes extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoosenote);

        button  = (Button) findViewById(R.id.button8);
        button1 = (Button) findViewById(R.id.button3);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button4);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button6);
        button6 = (Button) findViewById(R.id.button7);

        final Intent intent = new Intent(Notes.this, MainActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        final Intent intent1 = new Intent(Notes.this, Note.class);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){  intent1.putExtra("ZamNumber",1);startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ intent1.putExtra("ZamNumber",2);startActivity(intent1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){  intent1.putExtra("ZamNumber",3);startActivity(intent1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){  intent1.putExtra("ZamNumber",4);startActivity(intent1);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){intent1.putExtra("ZamNumber",5);startActivity(intent1);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){  intent1.putExtra("ZamNumber",6);startActivity(intent1);
            }
        });
    }
    @Override
    protected void onResume(){

        super.onResume();


        openFile("Zam1File.txt",button1);
        openFile("Zam2File.txt",button2);
        openFile("Zam3File.txt",button3);
        openFile("Zam4File.txt",button4);
        openFile("Zam5File.txt",button5);
        openFile("Zam6File.txt",button6);

    }
    private void openFile(String fileName, Button button) {
        try {
            InputStream inputStream = openFileInput(fileName);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    builder.append(line + "\n");
                }

                inputStream.close();
                button.setText(builder.toString());
            }
        } catch (Throwable t) {}
    }
}





