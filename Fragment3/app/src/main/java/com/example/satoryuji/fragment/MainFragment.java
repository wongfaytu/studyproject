package com.example.satoryuji.fragment;

import android.os.Bundle;
// 下位のバージョンにも対応させる場合はsupport-v4パッケージを使用します
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by satoryuji on 2018/07/30.
 */

public class MainFragment extends Fragment{

    private TextView mTextView;

    // Fragmentで表示するViewを作成するメソッド
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            super.onCreateView(inflater, container, savedInstanceState);
            // 先ほどのレイアウトをここでViewとして作成します
            return inflater.inflate(R.layout.fragment_main, container, false);
        }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // TextViewをひも付けます
        mTextView = (TextView) view.findViewById(R.id.textView);
        // Buttonのクリックした時の処理を書きます
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "!");
            }
        });
    }
    }
