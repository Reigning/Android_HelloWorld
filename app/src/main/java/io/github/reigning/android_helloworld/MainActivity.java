package io.github.reigning.android_helloworld;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.程序运行开始对话框();
        setContentView(R.layout.activity_main);
    }


    public void clickHandler(View view) {

        a = 1;

        EditText editText =(EditText)findViewById(R.id.editText);
        String txt = editText.getText().toString();
        if(txt.length() == 0) {
            Toast.makeText(this, "1.输入不能为空", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        EditText editText2 =(EditText)findViewById(R.id.editText2);
        String txt2 = editText2.getText().toString();
        if(txt2.length() == 0) {
            Toast.makeText(this, "2.输入不能为空", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        EditText editText3 =(EditText)findViewById(R.id.editText3);
        String txt3 = editText3.getText().toString();
        if(txt3.length() == 0) {
            Toast.makeText(this, "3.输入不能为空", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        EditText editText4 =(EditText)findViewById(R.id.editText4);
        String txt4 = editText4.getText().toString();
        if(txt4.length() == 0) {
            Toast.makeText(this, "4.输入不能为空", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        EditText editText5 =(EditText)findViewById(R.id.editText5);
        String txt5 = editText5.getText().toString();
        if(txt5.length() == 0) {
            Toast.makeText(this, "5.输入不能为空", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        double num3 =Double.parseDouble(txt3);
        if(num3 != 2) {
            Toast.makeText(this, "亲, 1+1=2 哦,你真的是太傻了", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        double num4 =Double.parseDouble(txt4);
        if(num4 != 2.5) {
            Toast.makeText(this, "亲, 5/2 等于2.5 吧? 你脑子没有发烧吧?", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
            a = 0;
            return ;
        }else{
            a++;
        }

        if(a == 8) {
            this.输出结果(view);
            //进入界面layout2.xml
            setContentView(R.layout.layout2);
        }else{
            a = 1;
        }
        //这段代码有些啰嗦 不想改...

    }

    public void 输出结果(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("根据大数据(装比)复杂的处理,\n 经过0.000000001秒, 得出如下结果:\n 别看了, 说你呢, 哈哈哈...\n我都不信,,,");
        builder.setTitle("分析结果完毕");
        builder.setPositiveButton("关闭窗口", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }

    public void 你才是傻比(View view) {
//        Toast.makeText(this, "你才是真正的最傻的傻比!", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("你才是真正的最傻的傻比!~\n啦啦啦德玛西亚");
        builder.setTitle("哈哈被整了吧");
        builder.setPositiveButton("关闭", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }

    public void 没错我就是傻比(View view) {
//        Toast.makeText(this, "呵呵\n你终于承认你是傻比了!\n像你这样有自知之明的人已经不多了\n你最傻了", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("呵呵\n你终于承认你是傻比了!\n像你这样有自知之明的人已经不多了\n我都被你傻哭了!\n使用本App后果自负\n开了学可别打我啊\n本宝宝胆子小\n不要打我不要打我不要打我哈");
        builder.setTitle("同学不要放弃治疗");
        builder.setPositiveButton("愉快地退出程序~", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
            }
        });
        builder.create().show();
    }

    public void 退出程序(View view) {
//        Toast.makeText(this, "呵呵\n想退出程序?\n你还没有承认自己是傻比呢!", Toast.LENGTH_SHORT).show();    //弹出一个自动消失的提示框
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("呵呵\n想退出程序?\n你还没有承认自己是傻比呢!");
        builder.setTitle("你真的太傻了");
        builder.setPositiveButton("关闭", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }


    public void 关于作者(final View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("小小测试 APP\n计科二班@张晓君\n学了一点Java 还是写个App练练手吧~\n主要是假期太闲了\n遇到Bug请及时反馈到我的QQ:\n 610915518\n我的博客地址:\n http://reigning.github.io");
        builder.setTitle("关于作者");
        builder.setPositiveButton("复制我的QQ号", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                onClickCopy(view);
            }
        });
        builder.setNegativeButton("访问我的博客@_@", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://reigning.github.io")));
            }
        });
        builder.create().show();
    }

    protected void 程序运行开始对话框() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("小小测试 APP\n本人Java首个App 部分机型没有适配 有些bug撒\n回到正题 勇敢的战士们 接受挑战吧 啊哈哈哈\n本程序有毒 请做好心理准备\n逗比君练手专用App\n大家不要乱用 后果自负");
        builder.setTitle("小小测试");
        builder.setPositiveButton("\n承担风险, 接受测试! 保证后果自负!\n", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("前方高能 我等非战斗人员还是撤退吧~", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
            }
        });
        builder.create().show();
    }
    public void onClickCopy(View v) {
        // 从API11开始android推荐使用android.content.ClipboardManager
        // 为了兼容低版本我们这里使用旧版的android.text.ClipboardManager，虽然提示deprecated，但不影响使用。
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        // 将文本内容"610915518"放到系统剪贴板里。
        cm.setText("610915518");
        Toast.makeText(this, "复制成功, 可以加我为好友了.", Toast.LENGTH_LONG).show();
    }
}



