package com.bvs.CollegeApp.qpapers;

/**
 * Created by JARVIS on 06-Mar-17.
 */

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bvs.CollegeApp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.R.attr.path;


public class ba3 extends AppCompatActivity implements View.OnClickListener {

    private Button buttonDownload;

    ProgressDialog pd;
    private Uri file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qba3);

        buttonDownload = (Button) findViewById(R.id.dwnld);

        buttonDownload.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == buttonDownload){
            pd=new ProgressDialog(this);
            pd.setMessage("Downloading file. Please wait...");
            pd.setProgress(100);
            pd.setMax(100);
            pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            pd.setCancelable(true);
            pd.show();
            downloadImage();
        }
    }

    private void downloadImage() {

        FirebaseStorage storage=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef = storage.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef.child("question_papers/ARA5A.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
               java.io.File path = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA5A.rar");
                try {
                    FileOutputStream fos=new FileOutputStream(path);
                    fos.write(bytes);
                    fos.close();
                    Toast.makeText(ba3.this, "Files saved to Download folder in internal storage", Toast.LENGTH_LONG).show();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage1=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef1 = storage1.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef1.child("question_papers/ARA5B.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path1 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA5B.rar");
                try {
                    FileOutputStream fos1=new FileOutputStream(path1);
                    fos1.write(bytes);
                    fos1.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage2=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef2 = storage2.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef2.child("question_papers/ARA5C.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path2 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA5C.rar");
                try {
                    FileOutputStream fos2=new FileOutputStream(path2);
                    fos2.write(bytes);
                    fos2.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage3=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef3 = storage3.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef3.child("question_papers/ARA5D.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path3 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA5D.rar");
                try {
                    FileOutputStream fos3=new FileOutputStream(path3);
                    fos3.write(bytes);
                    fos3.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage4=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef4 = storage4.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef4.child("question_papers/ARE5A.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path4 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARE5A.rar");
                try {
                    FileOutputStream fos4=new FileOutputStream(path4);
                    fos4.write(bytes);
                    fos4.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage5=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef5 = storage5.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef5.child("question_papers/ARA6A.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path5 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA6A.rar");
                try {
                    FileOutputStream fos5=new FileOutputStream(path5);
                    fos5.write(bytes);
                    fos5.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage6=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef6 = storage6.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef6.child("question_papers/ARA6B.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path6 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA6B.rar");
                try {
                    FileOutputStream fos6=new FileOutputStream(path6);
                    fos6.write(bytes);
                    fos6.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage7=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef7 = storage7.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef7.child("question_papers/ARA6C.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path7 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARA6C.rar");
                try {
                    FileOutputStream fos7=new FileOutputStream(path7);
                    fos7.write(bytes);
                    fos7.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage8=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef8 = storage8.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef8.child("question_papers/ARE6A.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path8 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARE6A.rar");
                try {
                    FileOutputStream fos8=new FileOutputStream(path8);
                    fos8.write(bytes);
                    fos8.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

        FirebaseStorage storage9=FirebaseStorage.getInstance();
        // Create a storage reference from our app
        StorageReference storageRef9 = storage9.getReferenceFromUrl("gs://pcas-b3eb4.appspot.com");

        storageRef9.child("question_papers/ARE6B.rar").getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                // Use the bytes to display the image
                java.io.File path9 = new java.io.File(Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        + "/ARE6B.rar");
                try {
                    FileOutputStream fos9=new FileOutputStream(path9);
                    fos9.write(bytes);
                    fos9.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ba3.this, e.toString(), Toast.LENGTH_LONG).show();
                }
                pd.dismiss();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                pd.dismiss();
                Toast.makeText(ba3.this, exception.toString()+"!!!", Toast.LENGTH_LONG).show();
            }
        });

    }

}
