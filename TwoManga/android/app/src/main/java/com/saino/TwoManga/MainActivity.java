package com.saino.TwoManga;

import android.os.Bundle;
import android.view.WindowManager;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // شرط ۱: جلوگیری از اسکرین‌شات و ضبط صفحه (Screen Recording)
        // این کد باعث می‌شود در لیست برنامه‌های اخیر (Recent Apps) هم صفحه سیاه نشان داده شود
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    }
}