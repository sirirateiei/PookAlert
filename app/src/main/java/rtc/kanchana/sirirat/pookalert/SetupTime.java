package rtc.kanchana.sirirat.pookalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class SetupTime extends AppCompatActivity {
    //Explicit
    private CalendarView calendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_time);
        //Bind Widget
        calendarView = (CalendarView) findViewById(R.id.calendarView);

        //Calendarview Controller
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {

                Log.d("pookV1","date ==> " + day + "/" + (month + 1) + "/" + year);


            }   //onSelected
        });


    }   // Main Method

}   // Main Class
