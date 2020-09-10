package com.example.transliteration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.*;
import java.util.HashMap;

public class SecondActivity extends AppCompatActivity {

    public EditText Chatacter;
    public Button Translate;
    public TextView result;
    public static String rese="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Chatacter=(EditText)findViewById(R.id.editText);
        Translate=(Button)findViewById(R.id.button2);
        result=(TextView)findViewById(R.id.textView3);
        Translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validatee(Chatacter.getText().toString().toLowerCase());
            }
        });

    }
    public void validatee(String characters){
                 String x[]= characters.split("");

        HashMap<String, String> lan = new HashMap<String, String>(){

            private static final long serialVersionUID = 1L;
            {
                put("he", "ሀ");put("hu", "ሁ");put("hi", "ሂ");put("ha", "ሃ");put("hie", "ሄ");put("h", "ህ");put("ho", "ሆ");
                put("le", "ለ");put("lu", "ሉ");put("li", "ሊ");put("la", "ላ");put("lie", "ሌ");put("l", "ል");put("lo", "ሎ");
                put("h.e", "ሐ");put("h.u", "ሑ");put("h.i", "ሒ");put("h.a", "ሓ");put("h.ie", "ሔ");put("h.", "ሕ");put("h.o", "ሖ");
                put("me", "መ");put("mu", "ሙ");put("mi", "ሚ");put("ma", "ማ");put("mie", "ሜ");put("m", "ም");put("mo", "ሞ");
                put("še", "ሠ");put("šu", "ሡ");put("ši", "ሢ");put("ša", "ሣ");put("šie", "ሤ");put("š", "ሥ");put("šo", "ሦ");
                put("re", "ረ");put("ru", "ሩ");put("ri", "ሪ");put("ra", "ራ");put("rie", "ሬ");put("r", "ር") ;put("ro", "ሮ");
                put("se", "ሰ");put("su", "ሱ");put("si", "ሲ");put("sa", "ሳ");put("sie", "ሴ");put("s", "ስ");put("so", "ሶ");
                put("she", "ሸ");put("shu", "ሹ");put("shi", "ሺ");put("sha", "ሻ");put("shie", "ሼ");put("sh", "ሽ");put("sho", "ሾ");
                put("qe", "ቀ");put("qu", "ቁ");put("qi", "ቂ");put("qa", "ቃ");put("qie", "ቄ");put("q", "ቅ");put("qo", "ቆ");
                put("be", "በ");put("bu", "ቡ");put("bi", "ቢ");put("ba", "ባ");put("bie", "ቤ");put("b", "ብ");put("bo", "ቦ");
                put("ve", "ቨ");put("vu", "ቩ");put("vi", "ቪ");put("va", "ቫ");put("vie", "ቬ");put("v", "ቭ");put("vo", "ቮ");
                put("te", "ተ");put("tu", "ቱ");put("ti", "ቲ");put("ta", "ታ");put("tie", "ቴ");put("t", "ት");put("to", "ቶ");
                put("che", "ቸ");put("chu", "ቹ");put("chi", "ቺ");put("cha", "ቻ");put("chie", "ቼ");put("ch", "ች");put("cho", "ቾ");
                put("ne", "ነ");put("nu", "ኑ");put("ni", "ኒ");put("na", "ና");put("nie", "ኔ");put("n", "ን");put("no", "ኖ");
                put("nye", "ኘ");put("nyu", "ኙ");put("nyi", "ኚ");put("nya", "ኛ");put("nyie", "ኜ");put("ny", "ኝ");put("nyo", "ኞ");
                put("ae", "አ");put("u", "ኡ");put("i", "ኢ");put("a", "አ");put("ie", "ኤ");put("e", "እ");put("o", "ኦ");
                put("ke", "ከ");put("ku", "ኩ");put("ki", "ኪ");put("ka", "ካ");put("kie", "ኬ");put("k", "ክ");put("ko", "ኮ");
                put("khe", "ኸ");put("khu", "ኹ");put("khi", "ኺ");put("kha", "ኻ");put("khie", "ኼ");put("kh", "ኽ");put("kho", "ኾ");
                put("oe", "ዐ");put("ou", "ዑ");put("oi", "ዒ");put("oa", "ዓ");put("oie", "ዔ");put("o", "ዕ");put("oo", "ዖ");
                put("we", "ወ");put("wu", "ዉ");put("wi", "ዊ");put("wa", "ዋ");put("wie", "ዌ");put("w", "ው");put("wo", "ዎ");
                put("ze", "ዘ");put("zu", "ዙ");put("zi", "ዚ");put("za", "ዛ");put("zie", "ዜ");put("z", "ዝ");put("zo", "ዞ");
                put("zhe", "ዠ");put("zhu", "ዡ");put("zhi", "ዢ");put("zha", "ዣ");put("zhie", "ዤ");put("zh", "ዥ");put("zho", "ዦ");
                put("ye", "የ");put("yu", "ዩ");put("yi", "ዪ");put("ya", "ያ");put("yie", "ዬ");put("y", "ይ");put("yo", "ዮ");
                put("de", "ደ");put("du", "ዱ");put("di", "ዲ");put("da", "ዳ");put("die", "ዴ");put("d", "ድ");put("do", "ዶ");
                put("je", "ጀ");put("ju", "ጁ");put("ji", "ጂ");put("ja", "ጃ");put("jie", "ጄ");put("j", "ጅ");put("jo", "ጆ");
                put("ge", "ገ");put("gu", "ጉ");put("gi", "ጊ");put("ga", "ጋ");put("gie", "ጌ");put("g", "ግ");put("go", "ጎ");
                put("xe", "ጸ");put("xu", "ጹ");put("xi", "ጺ");put("xa", "ጻ");put("xie", "ጼ");put("x", "ጸ");put("xo", "ጾ");
                put("fe", "ፈ");put("fu", "ፉ");put("fi", "ፊ");put("fa", "ፋ");put("fie", "ፌ");put("f", "ፍ");put("fo", "ፎ");
                put("pe", "ፐ");put("pu", "ፑ");put("pi", "ፒ");put("pa", "ፓ");put("pie", "ፔ");put("p", "ፕ");put("po", "ፖ");
                put("", "  ");put(" ", " ");put(", ", " ፣");put(".", "።");put(":", ":-");put("!", "!") ;put("?", "?");
                put(" a", " አ");put(" u", " ኡ");put(" i", " ኢ");put(" e", " እ");put(" o", " ኦ");
                put("0", "0");  put("1", "1") ; put("2", "2") ; put("3", "3") ; put("4", "4") ; put("5", "5") ; put("6", "6") ;
                put("7", "7") ; put("8", "8") ; put("9", "9") ;



            }
        };

        for(int i=0 ; i<x.length; i++){
            if(x.length==1 ||x.length-1== i ){
                rese += lan.get(x[i]);
                // System.out.println(res);
            }
            else
            {
                if (i < (x.length -1)){
                    String l = x[i+1];
                    if(l.equals("e") || l.equals("a") || l.equals("i") || l.equals("o") || l.equals("u")){
                        String con = x[i] + l;
                        rese += lan.get(con);
                        i++;
                    }
                    else{
                        rese += lan.get(x[i]);

                    }
                }}



        }


      result.setText("The translated Scripts from English to  አማርኛ /ትግርኛ is:" + rese);
      rese="";

    }}
