package nnooadb.shk;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Note  extends AppCompatActivity{
    private  EditText editText;
    private final static String Zam1 = "Zam1File.txt";
    private final static String Zam2 = "Zam2File.txt";
    private final static String Zam3 = "Zam3File.txt";
    private final static String Zam4 = "Zam4File.txt";
    private final static String Zam5 = "Zam5File.txt";
    private final static String Zam6 = "Zam6File.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button11);
        Button button2 = (Button) findViewById(R.id.button9);
        Button button3 = (Button) findViewById(R.id.button10);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
        final Intent intent = new Intent(Note.this, Notes.class);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("numberofzam",getIntent().getIntExtra("ZamNumber",0));startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Сохранено", Toast.LENGTH_SHORT).show();
                if (getIntent().getIntExtra("ZamNumber",0)==1){saveFile(Zam1);}
                if (getIntent().getIntExtra("ZamNumber",0)==2){saveFile(Zam2);}
                if (getIntent().getIntExtra("ZamNumber",0)==3){saveFile(Zam3);}
                if (getIntent().getIntExtra("ZamNumber",0)==4){saveFile(Zam4);}
                if (getIntent().getIntExtra("ZamNumber",0)==5){saveFile(Zam5);}
                if (getIntent().getIntExtra("ZamNumber",0)==6){saveFile(Zam6);}
            }
        });

    }
    @Override
    protected void onResume(){
        super.onResume();
        if (getIntent().getIntExtra("ZamNumber",0)==1){openFile(Zam1);}
        if (getIntent().getIntExtra("ZamNumber",0)==2){openFile(Zam2);}
        if (getIntent().getIntExtra("ZamNumber",0)==3){openFile(Zam3);}
        if (getIntent().getIntExtra("ZamNumber",0)==4){openFile(Zam4);}
        if (getIntent().getIntExtra("ZamNumber",0)==5){openFile(Zam5);}
        if (getIntent().getIntExtra("ZamNumber",0)==6){openFile(Zam6);}
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
                editText.setText(builder.toString());
            }
        } catch (Throwable ignored) {}
    }
    private void saveFile(String fileName) {
        try {
            OutputStream outputStream = openFileOutput(fileName, 0);
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            osw.write(editText.getText().toString());
            osw.close();
        } catch (Throwable ignored) {}
    }
}

