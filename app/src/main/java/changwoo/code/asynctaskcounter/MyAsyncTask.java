package changwoo.code.asynctaskcounter;

import android.os.AsyncTask;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MyAsyncTask extends AsyncTask <String, Integer, Boolean>{

    TextView textView;

    public MyAsyncTask(TextView textView) {
        System.out.println("#MyAsyncTask...");
        this.textView = textView;
    }

    @Override
    protected Boolean doInBackground(String... strings){
        System.out.println("#doInBackground strings: " + strings[0]);
        for(int i=0; i < 60; i++)
        {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
        }
        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values){
        System.out.println("#onProgressUpdate values"+ values);
        textView.setText(values[0].toString());

        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Boolean s){
        System.out.println("#onPostExecute Boolean: ");
        super.onPostExecute(s);
    }

    @Override
    protected void onCancelled(Boolean s){
        System.out.println("#onCancelled:");
        super.onCancelled(s);
    }
}
