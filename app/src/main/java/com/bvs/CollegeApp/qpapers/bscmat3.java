package com.bvs.CollegeApp.qpapers;

/**
 * Created by JARVIS on 06-Mar-17.
 */

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bvs.CollegeApp.R;

import static com.bvs.CollegeApp.R.id.dwnld;


public class bscmat3 extends Activity {

    // Text View to show progress dialog
    Button sem;


    // Progress Dialog
    private ProgressDialog pDialog;

    // Progress dialog type (0 - for Horizontal progress bar)
    public static final int progress_bar_type = 0;

    // File url to download

    private static String file_url1 = "http://c63644c6.ngrok.io/question_papers/MAM5R.rar";
    private static String file_url2 = "http://c63644c6.ngrok.io/question_papers/MAM5S.rar";
    private static String file_url3 = "http://c63644c6.ngrok.io/question_papers/MAM5T.rar";
    private static String file_url4 = "http://c63644c6.ngrok.io/question_papers/MAM5W.rar";
    private static String file_url5 = "http://c63644c6.ngrok.io/question_papers/MEM5B.rar";
    private static String file_url6 = "http://c63644c6.ngrok.io/question_papers/MAM6X.rar";
    private static String file_url7 = "http://c63644c6.ngrok.io/question_papers/MAM6Y.rar";
    private static String file_url8 = "http://c63644c6.ngrok.io/question_papers/MAM6Z.rar";
    private static String file_url9 = "http://c63644c6.ngrok.io/question_papers/MEM6A.rar";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qbscmat3);


        // show Text View
        sem = (Button) findViewById(dwnld);


        /**
         * Show Text view link click event
         **/
        sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // new DownloadFileFromURL().execute(file_url1, file_url2, file_url3, file_url4, file_url5, file_url6, file_url7, file_url8, file_url9);
            }
        });

    }


    /**
     * Showing Dialog
     */
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case progress_bar_type: // we set this to 0
                pDialog = new ProgressDialog(this);
                pDialog.setMessage("Downloading file. Please wait...");
                pDialog.setIndeterminate(false);
                pDialog.setMax(100);
                pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pDialog.setCancelable(true);
                pDialog.show();
                return pDialog;
            default:
                return null;
        }
    }

    /**
     * Background Async Task to download file
     */
    class DownloadFileFromURL extends AsyncTask<String, String, String> {

        /**
         * Before starting background thread
         * Show Progress Bar Dialog
         */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(progress_bar_type);
        }

        /**
         * Downloading file in background thread
         */
        @Override
        public String doInBackground(String... f_url) {
            int count, count1, count2,count3,count4,count5,count6,count7,count8;

            try {

                URL url = new URL(f_url[0]);
                URL url1 = new URL(f_url[1]);
                URL url2 = new URL(f_url[2]);
                URL url3 = new URL(f_url[3]);
                URL url4 = new URL(f_url[4]);
                URL url5 = new URL(f_url[5]);
                URL url6 = new URL(f_url[6]);
                URL url7 = new URL(f_url[7]);
                URL url8 = new URL(f_url[8]);

                URLConnection conection = url.openConnection();
                URLConnection conection1 = url1.openConnection();
                URLConnection conection2 = url2.openConnection();
                URLConnection conection3 = url3.openConnection();
                URLConnection conection4 = url4.openConnection();
                URLConnection conection5 = url5.openConnection();
                URLConnection conection6 = url6.openConnection();
                URLConnection conection7 = url7.openConnection();
                URLConnection conection8 = url8.openConnection();

                conection.connect();
                conection1.connect();
                conection2.connect();
                conection3.connect();
                conection4.connect();
                conection5.connect();
                conection6.connect();
                conection7.connect();
                conection8.connect();

                // this will be useful so that you can show a typical 0-100% progress bar
                int lenghtOfFile = conection.getContentLength();
                int lenghtOfFile1 = conection1.getContentLength();
                int lenghtOfFile2 = conection2.getContentLength();
                int lenghtOfFile3 = conection3.getContentLength();
                int lenghtOfFile4 = conection4.getContentLength();
                int lenghtOfFile5 = conection5.getContentLength();
                int lenghtOfFile6 = conection6.getContentLength();
                int lenghtOfFile7 = conection7.getContentLength();
                int lenghtOfFile8 = conection8.getContentLength();

                // download the file
                InputStream input = new BufferedInputStream(url.openStream(), 8192);
                InputStream input1 = new BufferedInputStream(url1.openStream(), 8192);
                InputStream input2 = new BufferedInputStream(url2.openStream(), 8192);
                InputStream input3 = new BufferedInputStream(url3.openStream(), 8192);
                InputStream input4 = new BufferedInputStream(url4.openStream(), 8192);
                InputStream input5 = new BufferedInputStream(url5.openStream(), 8192);
                InputStream input6 = new BufferedInputStream(url6.openStream(), 8192);
                InputStream input7 = new BufferedInputStream(url7.openStream(), 8192);
                InputStream input8 = new BufferedInputStream(url8.openStream(), 8192);

                // Output stream
                OutputStream output = new FileOutputStream("/storage/emulated/0/Download/MAM5R.rar");
                OutputStream output1 = new FileOutputStream("/storage/emulated/0/Download/MAM5S.rar");
                OutputStream output2 = new FileOutputStream("/storage/emulated/0/Download/MAM5T.rar");
                OutputStream output3 = new FileOutputStream("/storage/emulated/0/Download/MAM5W.rar");
                OutputStream output4 = new FileOutputStream("/storage/emulated/0/Download/MEM5B.rar");
                OutputStream output5 = new FileOutputStream("/storage/emulated/0/Download/MAM6X.rar");
                OutputStream output6 = new FileOutputStream("/storage/emulated/0/Download/MAM6Y.rar");
                OutputStream output7 = new FileOutputStream("/storage/emulated/0/Download/MAM6Z.rar");
                OutputStream output8 = new FileOutputStream("/storage/emulated/0/Download/MEM6A.rar");

                byte data[] = new byte[1024];
                byte data1[] = new byte[1024];
                byte data2[] = new byte[1024];
                byte data3[] = new byte[1024];
                byte data4[] = new byte[1024];
                byte data5[] = new byte[1024];
                byte data6[] = new byte[1024];
                byte data7[] = new byte[1024];
                byte data8[] = new byte[1024];


                long total = 0;
                long total1 = 0;
                long total2 = 0;
                long total3 = 0;
                long total4 = 0;
                long total5 = 0;
                long total6 = 0;
                long total7 = 0;
                long total8 = 0;

                while ((count = input.read(data)) != -1) {
                    total += count;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));

                    // writing data to file
                    output.write(data, 0, count);
                }

                while ((count1 = input1.read(data1)) != -1) {
                    total1 += count1;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total1 * 100) / lenghtOfFile1));

                    // writing data to file
                    output1.write(data1, 0, count1);
                }

                while ((count2 = input2.read(data1)) != -1) {
                    total2 += count2;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total2 * 100) / lenghtOfFile2));

                    // writing data to file
                    output2.write(data2, 0, count2);
                }

                while ((count3 = input3.read(data1)) != -1) {
                    total3 += count3;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total3 * 100) / lenghtOfFile3));

                    // writing data to file
                    output3.write(data3, 0, count3);
                }

                while ((count4 = input4.read(data4)) != -1) {
                    total4 += count4;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total4 * 100) / lenghtOfFile4));

                    // writing data to file
                    output4.write(data4, 0, count4);
                }

                while ((count5 = input5.read(data5)) != -1) {
                    total5 += count5;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total5 * 100) / lenghtOfFile5));

                    // writing data to file
                    output5.write(data5, 0, count5);
                }

                while ((count6 = input6.read(data6)) != -1) {
                    total6 += count6;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total6 * 100) / lenghtOfFile6));

                    // writing data to file
                    output6.write(data6, 0, count6);
                }

                while ((count7 = input7.read(data7)) != -1) {
                    total7 += count7;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total7 * 100) / lenghtOfFile7));

                    // writing data to file
                    output7.write(data7, 0, count7);
                }

                while ((count8 = input8.read(data8)) != -1) {
                    total8 += count8;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress("" + (int) ((total8 * 100) / lenghtOfFile8));

                    // writing data to file
                    output8.write(data8, 0, count8);
                }

                // flushing output
                output.flush();
                output1.flush();
                output2.flush();
                output3.flush();
                output4.flush();
                output5.flush();
                output6.flush();
                output7.flush();
                output8.flush();

                // closing streams
                output.close();
                output1.close();
                output2.close();
                output3.close();
                output4.close();
                output5.close();
                output6.close();
                output7.close();
                output8.close();

                input.close();
                input1.close();
                input2.close();
                input3.close();
                input4.close();
                input5.close();
                input6.close();
                input7.close();
                input8.close();

            } catch (Exception e) {
                Log.e("Error: ", e.getMessage());

            }

            return null;
        }

        /**
         * Updating progress bar
         */
        protected void onProgressUpdate(String... progress) {
            // setting progress percentage
            pDialog.setProgress(Integer.parseInt(progress[0]));
        }

        /**
         * After completing background task
         * Dismiss the progress dialog
         **/

        @Override
        protected void onPostExecute(String file_url) {
            // dismiss the dialog after the file was downloaded
            dismissDialog(progress_bar_type);

        }

    }
}
