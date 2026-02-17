package com.saino.TwoManga;

import android.os.Bundle;
import android.view.WindowManager;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // این خط باعث می‌شود سیستم‌عامل اندروید اجازه اسکرین‌شات 
        // و ضبط صفحه (Screen Record) را به هیچ اپلیکیشنی ندهد.
        // همچنین در لیست Recent Apps محتوای برنامه شما سیاه دیده می‌شود.
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_SECURE, 
            WindowManager.LayoutParams.FLAG_SECURE
        );
    }
}