package com.example.lee.studytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener ( new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                Toast.makeText(MainActivity.this,"You Click button 1",
//                Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.GitHub.com"));
//                startActivity(intent);//关于Intent的网页活动响应
                String data = "Hello SecondActivity";
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);
            }
                /*
                对于隐式Intent和显示Intent的浅谈
                对于显示Intent来说，更多的是明确响应的组件，在同一程序中的应用是比较
                方便的，可能避免一些不必要的错误，但是当你需要去，但如果你想要去跨程序
                响应事件和组件的时候显示的弊端就体现出来了。
                第一，因为格式问题我们必须去明确声明响应的是什么组件或者是活动，而隐式
                在这个方面对于系统的优化，他会自动去匹配你自己设定的指令在全局下
                第二，在响应多事件的时候，隐式会自动匹配所有然后给你选择界面，这就类似于你
                在手机界面中选择播放器的功能一样，在你点击文件以后他会根据文件性质匹配
                然后让你在一下的播放器中进行选择
                第三，代码的简便，显示的话往往需要申明所有的东西而隐式的唯一不足便是可能匹配
                不精确但是对于这个问题你也可以多设置几个匹配量用来提高匹配精度，但如果只是简单
                的Intent响应，显示的操作似乎更方便进行，由于是刚刚看完理解或许不是十分透彻
                之后再进行补充
                android:scheme:用于指定数据的协议部分，如上例中的http部分
                android:host： 用于制定数据的主机名部分，如上例中的www.GitHub.com部分
                android:port:  用于指定数据的端口部分，一般紧随在主机名之后
                Android:path:  用于指定主机名和端口之后的部分，如一网址中跟在域名之后的内容
                android:mimeType：用于指定可以处理的数据类型，允许使用通配符的方式进行指定
                 */
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You Clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You Clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
