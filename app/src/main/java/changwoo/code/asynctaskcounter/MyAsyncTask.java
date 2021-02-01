package changwoo.code.asynctaskcounter;

import android.os.AsyncTask;
import android.widget.TextView;

public class MyAsyncTask extends AsyncTask <String, Integer, Boolean>{

    TextView textView;

    public MyAsyncTask(TextView textView) {
        this.textView = textView;
    }

    @Override
    protected Boolean doInBackground(String... strings){
        for(int i=0; i < 10000; i++)
        {
            publishProgress(i);
        }
        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values){

        textView.setText(values[0].toString());

        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Boolean s){
        super.onPostExecute(s);
    }

    @Override
    protected void onCancelled(Boolean s){
        super.onCancelled(s);
    }
}
