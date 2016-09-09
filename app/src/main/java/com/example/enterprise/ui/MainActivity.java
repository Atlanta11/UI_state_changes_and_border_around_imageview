package com.example.enterprise.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Called at the start of the full lifetime.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize Activity and inflate the UI.
        Toast.makeText(getApplicationContext(), "1: Initialize Activity and inflate the UI.", Toast.LENGTH_LONG).show();

    }
    // Called after onCreate has finished, use to restore UI state
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "2: onRestoreInstanceState", Toast.LENGTH_LONG).show();
// Restore UI state from the savedInstanceState.
// This bundle has also been passed to onCreate.
// Will only be called if the Activity has been
// killed by the system since it was last visible.
    }
    // Called before subsequent visible lifetimes
// for an Activity process.
    @Override
    public void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "3: onRestart", Toast.LENGTH_LONG).show();
// Load changes knowing that the Activity has already
// been visible within this process.
    }
    // Called at the start of the visible lifetime.
    @Override
    public void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "4: onStart", Toast.LENGTH_LONG).show();
// Apply any required UI change now that the Activity is visible.
    }
    // Called at the start of the active lifetime.
    @Override
    public void onResume(){
        super.onResume();
// Resume any paused UI updates, threads, or processes required
// by the Activity but suspended when it was inactive.
        Toast.makeText(getApplicationContext(), "5: onResume", Toast.LENGTH_LONG).show();

    }
    // Called to save UI state changes at the
// end of the active lifecycle.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Toast.makeText(getApplicationContext(), "6: Save UI state changes to the savedInstanceState.", Toast.LENGTH_LONG).show();
// Save UI state changes to the savedInstanceState.
// This bundle will be passed to onCreate and
// onRestoreInstanceState if the process is
// killed and restarted by the run time.
        super.onSaveInstanceState(savedInstanceState);
    }
    // Called at the end of the active lifetime.
    @Override
    public void onPause(){
        Toast.makeText(getApplicationContext(), "7: onPause", Toast.LENGTH_LONG).show();
// Suspend UI updates, threads, or CPU intensive processes
// that don’t need to be updated when the Activity isn’t
// the active foreground Activity.
        super.onPause();
    }
    // Called at the end of the visible lifetime.
    @Override
    public void onStop(){
        Toast.makeText(getApplicationContext(), "8: onStop", Toast.LENGTH_LONG).show();
// Suspend remaining UI updates, threads, or processing
// that aren’t required when the Activity isn’t visible.
// Persist all edits or state changes
// as after this call the process is likely to be killed.
        super.onStop();
    }
    // Sometimes called at the end of the full lifetime.
    @Override
    public void onDestroy(){
        Toast.makeText(getApplicationContext(), "9: onDestroy", Toast.LENGTH_LONG).show();
// Clean up any resources including ending threads,
// closing database connections etc.
        super.onDestroy();
    }
}

