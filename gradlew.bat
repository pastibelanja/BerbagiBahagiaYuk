<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.kilau.bahagiayuk">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppThemeLogin">
        <activity android:name="com.kilau.bahagiayuk.AbsenActivity"/>
        <activity android:name="com.kilau.bahagiayuk.DashboardActivity" />
        <activity android:name="com.kilau.bahagiayuk.LoginActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name="com.kilau.bahagiayuk.RegisterActivity"
            android:theme="@style/AppThemeRegist" />
        <activity
            android:name="com.kilau.bahagiayuk.MainActivity"
            android:label="Profile"
            android:parentActivityName="com.kilau.bahagiayuk.DashboardActivity"/>
    </application>

</manifest>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               