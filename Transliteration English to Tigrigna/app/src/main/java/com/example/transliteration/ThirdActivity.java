package com.example.transliteration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class ThirdActivity extends AppCompatActivity {
public EditText characters;
public Button Translatee;
public TextView resultee;
public static String resu="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        characters=findViewById(R.id.editText4);
        Translatee=findViewById(R.id.button4);
        resultee=findViewById(R.id.textView5);
        Translatee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateee(characters.getText().toString().toLowerCase());
            }
        });

    }

    private void validateee(String characters) {

        String x[]= characters.split("");
        HashMap<String, String> lan = new HashMap<String, String>(){

            private static final long serialVersionUID = 1L;
            {
                put("ሀ", "he");put("ሁ ", "hu");put(" ሂ", "hi");put("ሃ", "ha");put("ሄ", "hie");put("ህ", "h");put("ሆ", "ho");
                put("ለ", "le");put("ሉ", "lu");put("ሊ", "li");put("ላ", "la");put("ሌ", "lie");put("ል", "l");put("ሎ", "lo");
                put("ሐ", "he");put("ሑ", "hu");put("ሒ", "hi");put("ሓ", "ha");put("ሔ", "hie");put("ሕ", "h");put("ሖ", "ho");
                put("መ", "me");put("ሙ", "mu");put("ሚ", "mi");put("ማ", "ma");put("ሜ", "mie");put("ም", "m");put("ሞ", "mo");
                put("ሠ", "se");put("ሡ", "su");put("ሢ", "si");put("ሣ", "sa");put("ሤ", "sie");put("ሥ", "s");put("ሦ", "so");
                put("ረ", "re");put("ሩ", "ru");put("ሪ", "ri");put("ራ", "ra");put("ሬ", "rie");put("ር", "r");put("ሮ", "ro");
                put("ሰ", "se");put("ሱ", "su");put("ሲ", "si");put("ሳ", "sa");put("ሴ", "sie");put("ስ", "s");put("ሶ", "so");
                put("ሸ", "she");put("ሹ", "shu");put("ሺ", "shi");put("ሻ", "sha");put("ሼ", "shie");put("ሽ", "sh");put("ሾ", "sho");
                put("ቀ", "qe");put("ቁ", "qu");put("ቂ", "qi");put("ቃ", "qa");put("ቄ", "qie");put("ቅ", "q");put("ቆ", "qo");
                put("በ", "be");put("ቡ", "bu");put("ቢ", "bi");put("ባ", "ba");put("ቤ", "bie");put("ብ", "b");put("ቦ", "bo");
                put("ቨ", "ve");put("ቩ", "vu");put("ቪ", "vi");put("ቫ", "va");put("ቬ", "vie");put("ቭ", "v");put("ቮ", "vo");
                put("ተ", "te");put("ቱ", "tu");put("ቲ", "ti");put("ታ", "ta");put("ቴ", "tie");put("ት", "t");put("ቶ", "to");
                put("ቸ", "che");put("ቹ", "chu");put("ቺ", "chi");put("ቻ", "cha");put("ቼ", "chie");put("ች", "ch");put("ቾ", "cho");
                put("ነ", "ne");put("ኑ", "nu");put("ኒ", "ni");put("ና", "na");put("ኔ", "nie");put("ን", "n");put("ኖ", "no");
                put("ኘ", "nye");put("ኙ", "nyu");put("ኚ", "nyi");put("ኛ", "nya");put("ኜ", "nyie");put("ኝ", "ny");put("ኞ", "nyo");
                put("አ", "ae");put("ኡ", "u");put("ኢ", "i");put("ኣ", " a");put("ኤ", "ie");put("እ", "e");put("ኦ", "o");
                put("ከ", "ke");put("ኩ", "ku");put("ኪ", "ki");put("ካ", "ka");put("ኬ", "kie");put("ክ", "k");put("ኮ", "ko");
                put("ኸ", "khe");put("ኹ", "khu");put("ኺ", "khi");put("ኻ", "kha");put("ኼ", "khie");put("ኽ", "kh");put("ኾ", "kho");
                put("ዐ", "oe");put("ዑ", "ou");put("ዒ", "oi");put("ዓ", "oa");put("ዔ", "oie");put("ዕ", "e");put("ዖ", "oo");
                put("ወ", "we");put("ዉ", "wu");put("ዊ", "wi");put("ዋ", "wa");put("ዌ", "wie");put("ው", "w");put("ዎ", "wo");
                put("ዘ", "ze");put("ዙ", "zu");put("ዚ", "zi");put("ዛ", "za");put("ዜ", "zie");put("ዝ", "z");put("ዞ", "zo");
                put("ዠ", "zhe");put("ዡ", "zhu");put("ዢ", "zhi");put("ዣ", "zha");put("ዤ", "zhie");put("ዥ", "zh");put("ዦ", "zho");
                put("የ", "ye");put("ዩ", "yu");put("ዪ", "yi");put("ያ", "ya");put("ዬ", "yie");put("ይ", "y");put("ዮ", "yo");
                put("ደ", "de");put("ዱ", "du");put("ዲ", "di");put("ዳ", "da");put("ዴ", "die");put("ድ", "d");put("ዶ", "do");
                put("ጀ", "je") ;put("ጁ", "ju");put("ጂ", "ji"); put("ጃ", "ja"); put("ጄ", "jie");put("ጅ", "j");put("ጆ", "jo");
                put("ገ", "ge");put("ጉ", "gu") ;put("ጊ", "gi");put("ጋ", "ga");put("ጌ", "gie");put("ግ", "g");put("ጎ", "go");
                put("ጸ", "tse");put("ጹ", "tsu");put("ጺ", "tsi");put("ጻ", "tsa"); put("ጼ", "tsie");put("ጸ", "ts");put("ጾ", "tso");
                put("ፈ", "fe");put("ፉ", "fu");put("ፊ", "fi");put("ፋ", "fa");put("ፌ", "fie");put("ፍ", "f");put("ፎ", "fo");
                put("ፐ", "pe");put("ፑ", "pu");put("ፒ", "pi");put("ፓ", "pa");put("ፔ", "pie"); put("ፕ", "p");put("ፖ", "po");
                put(" ", " "); put("", "");put("፣ ", ", ") ; put("።", ".") ; put("？", "?")  ;put("!", "!") ; put(":-", ";");
                put(" አ", " ae");put( " ኡ"," u");put(" ኢ"," i");put( " እ"," e");put( " ኦ"," o");
                put("0", "0");  put("1", "1") ; put("2", "2") ; put("3", "3") ; put("4", "4") ; put("5", "5") ; put("6", "6") ;
                put("7", "7") ; put("8", "8") ; put("9", "9") ;
    }

        };
        for(int i=0 ; i<x.length; i++){

            resu += lan.get(x[i]);

        }
        resultee.setText("The translated Scripts from አማርኛ /ትግርኛ to English: is:" + resu);
        resu="";
    }}
