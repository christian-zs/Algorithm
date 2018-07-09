package com.example.administrator.algorithm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


@SuppressLint("Registered")
public class BubbleSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[]  bubbleData = {2, 15, 20, 5, 4875, 1, 572};

        bubbleSort(bubbleData);

        Log.d("BubbleSortActivity", "冒泡排序结果");
        print(bubbleData);

        int[] cocktailData = {2, 15, 20, 5, 4875, 1, 572};
        cocktailSort(cocktailData);
        Log.d("BubbleSortActivity","鸡尾酒排序结果");
        print(cocktailData);
    }
    /**
     * 鸡尾酒排序排序
     */
    private void cocktailSort(int[] data) {


    }

    private void print(int[] data) {
        for (int aData : data) {
            Log.d("BubbleSortActivity", aData + "");
        }
    }

    /**
     * 冒泡排序排序
     */
    private void bubbleSort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }


    /**
     * 交换数据
     */
    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
