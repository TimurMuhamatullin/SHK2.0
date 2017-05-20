package nnooadb.shk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Rospisaniye extends AppCompatActivity{
    private Button button;
    private  Button buttonpn;
    private  Button buttonvt;
    private  Button buttonsr;
    private  Button buttonchtv;
    private  Button buttonpt;
    private  Button buttonsubb;
    private  Button save;
    private  Button delete;
    private  Button write;
    private  Button l1;
    private  Button l2;
    private  Button l3;
    private  Button l4;
    private  Button l5;
    private  Button l6;
    private  Button l7;
    private  Button l8;
    private  Button buttonshow;
    private EditText [] editTexts;
    private int lnumber;
    private int daynumber;
    private int mCount  = 0;
    private int mCount1 = 0;
    private static String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rospisaniye);

        editTexts = new EditText[9];
        final Intent intent = new Intent(Rospisaniye.this, MainActivity.class);
        button = (Button) findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        buttonpn   =(Button) findViewById(R.id.button14);
        buttonvt   =(Button) findViewById(R.id.button15);
        buttonsr   =(Button) findViewById(R.id.button16);
        buttonchtv =(Button) findViewById(R.id.button17);
        buttonpt   =(Button) findViewById(R.id.button18);
        buttonsubb =(Button) findViewById(R.id.button19);
        save       =(Button) findViewById(R.id.button28);
        delete     =(Button) findViewById(R.id.button30);
        write      =(Button) findViewById(R.id.button31);
        buttonshow =(Button) findViewById(R.id.button29);
        l1 = (Button) findViewById(R.id.button20);
        l2 = (Button) findViewById(R.id.button21);
        l3 = (Button) findViewById(R.id.button22);
        l4 = (Button) findViewById(R.id.button23);
        l5 = (Button) findViewById(R.id.button24);
        l6 = (Button) findViewById(R.id.button25);
        l7 = (Button) findViewById(R.id.button26);
        l8 = (Button) findViewById(R.id.button27);

        editTexts[0]  = (EditText)findViewById(R.id.editText2);
        editTexts[1] = (EditText)findViewById(R.id.editText3);
        editTexts[2] = (EditText)findViewById(R.id.editText4);
        editTexts[3] = (EditText)findViewById(R.id.editText5);
        editTexts[4] = (EditText)findViewById(R.id.editText6);
        editTexts[5] = (EditText)findViewById(R.id.editText7);
        editTexts[6] = (EditText)findViewById(R.id.editText8);
        editTexts[7] = (EditText)findViewById(R.id.editText9);
        editTexts[8] = (EditText)findViewById(R.id.editText10);
        final Day[] Days = new Day[6];
        for(int i = 0;i<6;i++){
            Days[i] = new Day();
        }




    }
    private void saveFile(Day[] days,String filename) {
        try {
            OutputStream outputStream = openFileOutput(filename, 0);
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            for(int i = 0;i<6;i++){
                if (days[i].l1==null &&days[i].l2==null &&days[i].l3==null &&days[i].l4==null &&days[i].l5==null &&days[i].l6==null &&days[i].l7==null &&days[i].l8==null){osw.write(" "+ "\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");}
            else {osw.write(days[i].l1 + "\n" +days[i].l2 + "\n" +days[i].l3 + "\n" +days[i].l4 + "\n" +days[i].l5 + "\n" +days[i].l6 + "\n" +days[i].l7 + "\n" +days[i].l8 + "\n");}}
            for(int i = 0;i<6;i++){
                if (days[i].l1r==null &&days[i].l2r==null &&days[i].l3r==null &&days[i].l4r==null &&days[i].l5r==null &&days[i].l6r==null &&days[i].l7r==null &&days[i].l8r==null){osw.write(" "+ "\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");}
                else {
             osw.write(days[i].l1r + "\n" +days[i].l2r + "\n" +days[i].l3r + "\n" +days[i].l4r + "\n" +days[i].l5r + "\n" +days[i].l6r + "\n" +days[i].l7r + "\n" +days[i].l8r + "\n");}}
            osw.close();
        } catch (Throwable ignored) {}
    }
    private void openFile(Day[] days,String filename) {
        try {
            InputStream inputStream = openFileInput(filename);
            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                try {
                    for(int i = 0;i<6;i++){
                line = reader.readLine(); days[i].l1 = line;
                    line = reader.readLine(); days[i].l2 = line;
                    line = reader.readLine(); days[i].l3 = line;
                    line = reader.readLine(); days[i].l4 = line;
                    line = reader.readLine(); days[i].l5 = line;
                    line = reader.readLine(); days[i].l6 = line;
                    line = reader.readLine(); days[i].l7 = line;
                    line = reader.readLine(); days[i].l8 = line;
                    }
                }
                catch (IOException e){e.printStackTrace();}

                try {
                    for(int i = 0;i<6;i++){
                        line = reader.readLine(); days[i].l1r = line;
                        line = reader.readLine(); days[i].l2r = line;
                        line = reader.readLine(); days[i].l3r = line;
                        line = reader.readLine(); days[i].l4r = line;
                        line = reader.readLine(); days[i].l5r = line;
                        line = reader.readLine(); days[i].l6r = line;
                        line = reader.readLine(); days[i].l7r = line;
                        line = reader.readLine(); days[i].l8r = line;
                    }
                }
                catch (IOException e){e.printStackTrace();}

                inputStream.close();
            }
        } catch (Throwable ignored) {}
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onResume() {
        super.onResume();
        mCount = 0;
        mCount1 = 0;
        final Day[] Days = new Day[6];
        for(int i = 0;i<6;i++){Days[i] = new Day();}
        openFile(Days,"Days.txt");
        Days[daynumber].loadLess(editTexts,lnumber);
        if (daynumber == 0){buttonpn.setBackground  (getResources().getDrawable(R.drawable.pn1)); }
        if (daynumber == 1){buttonvt.setBackground  (getResources().getDrawable(R.drawable.vt1)); }
        if (daynumber == 2){buttonsr.setBackground  (getResources().getDrawable(R.drawable.sr1)); }
        if (daynumber == 3){buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht1));}
        if (daynumber == 4){buttonpt.setBackground  (getResources().getDrawable(R.drawable.pt1)); }
        if (daynumber == 5){buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb1)); }
        for (int i = 0; i<8;i++)
        {
            editTexts[i].setEnabled(false); editTexts[i].setCursorVisible(false);
        }

        buttonpn.setOnClickListener  (new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {daynumber=0;Days[daynumber].loadLess(editTexts,lnumber);buttonpn.setBackground(getResources().getDrawable(R.drawable.pn1));buttonvt.setBackground(getResources().getDrawable(R.drawable.vt2));buttonsr.setBackground(getResources().getDrawable(R.drawable.sr2));buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht2));buttonpt.setBackground(getResources().getDrawable(R.drawable.pt2));buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb2));}
        });
        buttonvt.setOnClickListener  (new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {daynumber=1;Days[daynumber].loadLess(editTexts,lnumber);buttonpn.setBackground(getResources().getDrawable(R.drawable.pn2));buttonvt.setBackground(getResources().getDrawable(R.drawable.vt1));buttonsr.setBackground(getResources().getDrawable(R.drawable.sr2));buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht2));buttonpt.setBackground(getResources().getDrawable(R.drawable.pt2));buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb2));}
        });
        buttonsr.setOnClickListener  (new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {daynumber=2;Days[daynumber].loadLess(editTexts,lnumber);buttonpn.setBackground(getResources().getDrawable(R.drawable.pn2));buttonvt.setBackground(getResources().getDrawable(R.drawable.vt2));buttonsr.setBackground(getResources().getDrawable(R.drawable.sr1));buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht2));buttonpt.setBackground(getResources().getDrawable(R.drawable.pt2));buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb2));}
        });
        buttonchtv.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {daynumber=3;Days[daynumber].loadLess(editTexts,lnumber);buttonpn.setBackground(getResources().getDrawable(R.drawable.pn2));buttonvt.setBackground(getResources().getDrawable(R.drawable.vt2));buttonsr.setBackground(getResources().getDrawable(R.drawable.sr2));buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht1));buttonpt.setBackground(getResources().getDrawable(R.drawable.pt2));buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb2));}
        });
        buttonpt.setOnClickListener  (new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {daynumber=4;Days[daynumber].loadLess(editTexts,lnumber);buttonpn.setBackground(getResources().getDrawable(R.drawable.pn2));buttonvt.setBackground(getResources().getDrawable(R.drawable.vt2));buttonsr.setBackground(getResources().getDrawable(R.drawable.sr2));buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht2));buttonpt.setBackground(getResources().getDrawable(R.drawable.pt1));buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb2));}
        });
        buttonsubb.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {daynumber=5;Days[daynumber].loadLess(editTexts,lnumber);buttonpn.setBackground(getResources().getDrawable(R.drawable.pn2));buttonvt.setBackground(getResources().getDrawable(R.drawable.vt2));buttonsr.setBackground(getResources().getDrawable(R.drawable.sr2));buttonchtv.setBackground(getResources().getDrawable(R.drawable.cht2));buttonpt.setBackground(getResources().getDrawable(R.drawable.pt2));buttonsubb.setBackground(getResources().getDrawable(R.drawable.sb1));}
        });


        l1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=1;editTexts[8].setText(Days[daynumber].l1r);l1.setBackground(getResources().getDrawable(R.drawable.hw)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=2;editTexts[8].setText(Days[daynumber].l2r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hw));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=3;editTexts[8].setText(Days[daynumber].l3r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hw));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=4;editTexts[8].setText(Days[daynumber].l4r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hw));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=5;editTexts[8].setText(Days[daynumber].l5r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hw));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=6;editTexts[8].setText(Days[daynumber].l6r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hw));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=7;editTexts[8].setText(Days[daynumber].l7r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hw));l8.setBackground(getResources().getDrawable(R.drawable.hwbl));}
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {lnumber=8;editTexts[8].setText(Days[daynumber].l8r);l1.setBackground(getResources().getDrawable(R.drawable.hwbl)); l2.setBackground(getResources().getDrawable(R.drawable.hwbl));l3.setBackground(getResources().getDrawable(R.drawable.hwbl));l4.setBackground(getResources().getDrawable(R.drawable.hwbl));l5.setBackground(getResources().getDrawable(R.drawable.hwbl));l6.setBackground(getResources().getDrawable(R.drawable.hwbl));l7.setBackground(getResources().getDrawable(R.drawable.hwbl));l8.setBackground(getResources().getDrawable(R.drawable.hw));}
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Days[daynumber].setLess(editTexts[0].getText().toString(),editTexts[1].getText().toString(),editTexts[2].getText().toString(),editTexts[3].getText().toString(),editTexts[4].getText().toString(),editTexts[5].getText().toString(),editTexts[6].getText().toString(),editTexts[7].getText().toString(),lnumber,editTexts[8].getText().toString()); Toast.makeText(getApplicationContext(), "Сохранено", Toast.LENGTH_SHORT).show();saveFile(Days,"Days.txt");}
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Days[daynumber].l1  = null;Days[daynumber].l2  = null;Days[daynumber].l3  = null;Days[daynumber].l4  = null;Days[daynumber].l5  = null;Days[daynumber].l6  = null;Days[daynumber].l7  = null;Days[daynumber].l8  = null;
                Days[daynumber].loadLess(editTexts,lnumber);}});
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCount % 2 == 0){
                    for (int i = 0; i<8;i++)
                    {
                        editTexts[i].setEnabled(true); editTexts[i].setCursorVisible(true);
                    }}
              else {
                    for (int i = 0; i<8;i++)
                    {
                        editTexts[i].setEnabled(false); editTexts[i].setCursorVisible(false);
                    }}
                ++mCount;
            }
        });
        buttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCount1 % 2 == 0){
                    buttonpn.setEnabled(false);buttonvt.setEnabled(false);buttonsr.setEnabled(false);buttonchtv.setEnabled(false);buttonpt.setEnabled(false);buttonsubb.setEnabled(false);save.setEnabled(false);delete.setEnabled(false);write.setEnabled(false);button.setEnabled(false);
                    l1.setEnabled(false);l2.setEnabled(false);l3.setEnabled(false);l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);
                    s = editTexts[8].getText().toString();
                    editTexts[8].setText("");editTexts[0].setText(Days[daynumber].l1r);editTexts[1].setText(Days[daynumber].l2r);editTexts[2].setText(Days[daynumber].l3r);editTexts[3].setText(Days[daynumber].l4r);editTexts[4].setText(Days[daynumber].l5r);editTexts[5].setText(Days[daynumber].l6r);editTexts[6].setText(Days[daynumber].l7r);editTexts[7].setText(Days[daynumber].l8r);
                    for (int i = 0; i<8;i++)
                    {
                        editTexts[i].setEnabled(false); editTexts[i].setCursorVisible(false);
                    }}
                else {
                    buttonpn.setEnabled(true);buttonvt.setEnabled(true);buttonsr.setEnabled(true);buttonchtv.setEnabled(true);buttonpt.setEnabled(true);buttonsubb.setEnabled(true);save.setEnabled(true);delete.setEnabled(true);write.setEnabled(true);button.setEnabled(true);
                    l1.setEnabled(true);l2.setEnabled(true);l3.setEnabled(true);l4.setEnabled(true);l5.setEnabled(true);l6.setEnabled(true);l7.setEnabled(true);l8.setEnabled(true);
                    editTexts[8].setText(s);editTexts[0].setText(Days[daynumber].l1);editTexts[1].setText(Days[daynumber].l2);editTexts[2].setText(Days[daynumber].l3);editTexts[3].setText(Days[daynumber].l4);editTexts[4].setText(Days[daynumber].l5);editTexts[5].setText(Days[daynumber].l6);editTexts[6].setText(Days[daynumber].l7);editTexts[7].setText(Days[daynumber].l8);
                   }
                ++mCount1;
            }
        });
    }
}
