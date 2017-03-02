package com.example.lee.studytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button button3 = (Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
                /*
                Intent的中文意思是“意图，意向”，在Android中提供了Intent机制来协助应
                用间的交互与通讯，Intent负责对应用中一次操作的动作、动作涉及数据、附加
                数据进行描述，Android则根据此Intent的描述，负责找到对应的组件，将
                 Intent传递给调用的组件，并完成组件的调用。Intent不仅可用于应用程序
                 之间，也可用于应用程序内部的Activity/Service之间的交互。因此，可以
                 将Intent理解为不同组件之间通信的“媒介”专门提供组件互相调用的相关
                 信息。，
                 */
            }
        });
    }
}
