package com.example.tugas6prak_1918102;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final OneTimeWorkRequest request1 = new
                OneTimeWorkRequest.Builder(MyWorker1.class).build();
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkManager.getInstance().enqueueUniqueWork(
                        "Notifikasi",
                        ExistingWorkPolicy.REPLACE, request1);
            }
        });

        final OneTimeWorkRequest request2 = new
                OneTimeWorkRequest.Builder(MyWorker2.class).build();
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkManager.getInstance().enqueueUniqueWork(
                        "Notifikasi2",
                        ExistingWorkPolicy.REPLACE, request2);
            }
        });

        final OneTimeWorkRequest request3 = new
                OneTimeWorkRequest.Builder(MyWorker3.class).build();
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkManager.getInstance().enqueueUniqueWork(
                        "Notifikasi",
                        ExistingWorkPolicy.REPLACE, request3);
            }
        });
    }
}