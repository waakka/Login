package com.waakka.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");

    private TextView tvName,tvPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;

        tvName = findViewById(R.id.et_name);
        tvPwd = findViewById(R.id.et_pwd);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("tag", sdf.format(new Date()) + "  点击了登陆按钮");
                // 获取用户名
                String username = tvName.getText() + "";
                // 获取密码
                String password = tvPwd.getText() + "";
                User user = new User(username, password);
                user.getInner().setDetail(username+password);
                if (isLoginSuc(user)) {
                    Toast.makeText(MainActivity.this, "登陆成功！", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                } else {
                    Toast.makeText(MainActivity.this, "登陆失败！", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus){
            Log.e("tag","****登陆界面获得焦点 " + sdf.format(new Date()));
        }else{
            Log.e("tag","****登陆界面丢失焦点 " + sdf.format(new Date()));
        }
    }

    private boolean isLoginSuc(User user){
        if(TextUtils.isEmpty(user.getName())||TextUtils.isEmpty(user.getPwd())){
//            Toast.makeText(MainActivity.this, "账号密码不能为空！", Toast.LENGTH_LONG).show();
            return false;
        }
        if("waakka".equals(user.getName())&&"123".equals(user.getPwd())){
            return true;
        }
        return false;
    }

}
