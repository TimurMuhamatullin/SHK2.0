package nnooadb.shk;

import android.widget.EditText;

class Day {
    String l1;
    String l2;
    String l3;
    String l4;
    String l5;
    String l6;
    String l7;
    String l8;
    String l1r;
    String l2r;
    String l3r;
    String l4r;
    String l5r;
    String l6r;
    String l7r;
    String l8r;
    void setLess(String l1, String l2, String l3, String l4, String l5, String l6, String l7, String l8, int lrnumb, String lr){
        this.l1 = l1;this.l2 = l2;this.l3 = l3;this.l4 = l4;this.l5 = l5;this.l6 = l6;this.l7 = l7;this.l8 = l8;
        if (lrnumb==1){this.l1r = lr;}
        if (lrnumb==2){this.l2r = lr;}
        if (lrnumb==3){this.l3r = lr;}
        if (lrnumb==4){this.l4r = lr;}
        if (lrnumb==5){this.l5r = lr;}
        if (lrnumb==6){this.l6r = lr;}
        if (lrnumb==7){this.l7r = lr;}
        if (lrnumb==8){this.l8r = lr;}

    }
    void loadLess(EditText[] editTexts, int ln){
        editTexts[0].setText(this.l1);
        editTexts[1].setText(this.l2);
        editTexts[2].setText(this.l3);
        editTexts[3].setText(this.l4);
        editTexts[4].setText(this.l5);
        editTexts[5].setText(this.l6);
        editTexts[6].setText(this.l7);
        editTexts[7].setText(this.l8);
        if(ln==1){editTexts[8].setText(this.l1r);}
        if(ln==2){editTexts[8].setText(this.l2r);}
        if(ln==3){editTexts[8].setText(this.l3r);}
        if(ln==4){editTexts[8].setText(this.l4r);}
        if(ln==5){editTexts[8].setText(this.l5r);}
        if(ln==6){editTexts[8].setText(this.l6r);}
        if(ln==7){editTexts[8].setText(this.l7r);}
        if(ln==8){editTexts[8].setText(this.l8r);}
    }
}
