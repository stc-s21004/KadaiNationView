package jp.suntech.s21004.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ListViewオブジェクトを取得
        ListView lvMenu = findViewById(R.id.lvNation);
        // ListViewにリスナを設定
        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    // リストがタップされた時の処理が記述されたメンバクラス
    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // タップされた国家名を取得
            String item = (String) parent.getItemAtPosition(position);
            String text = "選択した国家: " + item;
            TextView tvShow = (TextView) findViewById(R.id.tvShow);
            // テキストビューにテキストを設定
            tvShow.setText(text);
        }
    }
}