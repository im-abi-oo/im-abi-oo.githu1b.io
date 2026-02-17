# قوانین پایه برای Capacitor
-keep class com.getcapacitor.** { *; }
-keepclasseswithmembers class * {
  @com.getcapacitor.NativePlugin public *;
}
-keepclasseswithmembers class * {
  @com.getcapacitor.CapacitorPlugin public *;
}

# حفظ اینترفیس‌های جاوااسکریپت برای کارکرد صحیح WebView
-keepattributes JavascriptInterface
-keepattributes *Annotation*
-keep class com.saino.TwoManga.MainActivity { *; }

# مبهم‌سازی شدیدتر رشته‌ها و متغیرها
-dontpreverify
-optimizationpasses 5
-allowaccessmodification

# پنهان کردن نام فایل‌های اصلی و شماره خط‌ها
-renamesourcefileattribute SourceFile
-keepattributes SourceFile,LineNumberTable

# حفظ کتابخانه‌های اندروید برای جلوگیری از کرش
-keep class androidx.appcompat.** { *; }
-keep class com.google.android.gms.** { *; }

# جلوگیری از لو رفتن متدهای Native
-keepclassmembers class * {
    native <methods>;
}