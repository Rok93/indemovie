package com.example.indemovie;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.util.ArrayList;

public class PopupActivity extends Activity{


    @Override
       protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_popup);
        //UI 객체생성

        ArrayList<TextView> txtText = new ArrayList<>();
        ArrayList<String> info = new ArrayList<>();

        txtText.add((TextView)findViewById(R.id.txtText1));
        txtText.add((TextView)findViewById(R.id.txtText2));
        txtText.add((TextView)findViewById(R.id.txtText3));
        txtText.add((TextView)findViewById(R.id.txtText4));
        txtText.add((TextView)findViewById(R.id.txtText5));

        //데이터 가져오기
        Intent intent = getIntent();
        info.add("극장명:" + intent.getStringExtra("theater_nm"));
        info.add("Tel:" + intent.getStringExtra("tel"));
        info.add("주소:" + intent.getStringExtra("addr"));
        info.add("홈페이지:" + intent.getStringExtra("homepage"));
        info.add("휴일:" + intent.getStringExtra("time"));

        for(int i = 0; i < txtText.size(); i++){
            txtText.get(i).setText(info.get(i));
            if(i == 1)
            Linkify.addLinks(txtText.get(i),
                    pattern,
                    scheme,
                    Linkify.MatchFilter ma,
                    Linkify.PHONE_NUMBERS);
        }

        /*
        intent.putExtra("theater_nm", t.getTHEATER_NM());
             intent.putExtra("tel", t.getTEL());
             intent.putExtra("addr", t.getADDR());
             intent.putExtra("homepage", t.getHOMEPAGE());
             intent.putExtra("time", t.getTIME());
         */
    }

    //확인 버튼 클릭
    public void mOnClose(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        intent.putExtra("result", "Close Popup");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }



    }

