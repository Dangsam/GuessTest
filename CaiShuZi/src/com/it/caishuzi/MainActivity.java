package com.it.caishuzi;

import java.util.Random;
import java.util.Scanner;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	int rand;

	/**
	 * 产生随机数
	 */
	public void startgame(View view) {
		EditText num1ET = (EditText) findViewById(R.id.num1_et);
		EditText num2ET = (EditText) findViewById(R.id.num2_et);
		int num1 = Integer.parseInt(num1ET.getText().toString());

		int num2 = Integer.parseInt(num2ET.getText().toString());
		if (num1 >= num2) {
			Toast.makeText(this, "第一个数字必须小于第二个数字", Toast.LENGTH_LONG).show();
		} else {
			rand = new Random().nextInt(num2 - num1) + num1;
			System.out.println(rand);
		}

	}

	/**
	 * 将用户输入的数字与产生的随机数进行对比
	 */
	public void submit(View view) {
		EditText numET = (EditText) findViewById(R.id.num_et);
		int num = Integer.parseInt(numET.getText().toString());

		if (num == rand) {
			Toast.makeText(this, "恭喜您答对啦", Toast.LENGTH_LONG).show();
		} else if (num > rand) {
			Toast.makeText(this, "您猜大啦", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(this, "您猜小啦", Toast.LENGTH_LONG).show();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
