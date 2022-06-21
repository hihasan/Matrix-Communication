package com.hihasan.matrix.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.hihasan.matrix.R;

public class DialogUtil {
    private Context context;
    private ProgressDialog progressDialog;
    public DialogUtil(Context context) {
        this.context = context;
        progressDialog= new ProgressDialog(context);
    }

    //different type of method is available for alert dialog
    public void showProgressDialog() {
        progressDialog.setMessage(context.getString(R.string.loading));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }


    public void showProgressDialog(String msg) {
        //    progressDialog = new ProgressDialog(context);
        if(msg == null || msg.isEmpty()){
            msg = "Please wait...";
        }
        progressDialog.setMessage(msg);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }


    public void dismissProgress(){
        if(progressDialog != null && progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }


    public void showDialogYesNo(String msg, DialogInterface.OnClickListener yesListener, DialogInterface.OnClickListener noListener) {
        MaterialAlertDialogBuilder dialog = new MaterialAlertDialogBuilder(context);
        dialog.setMessage(msg);
        dialog.setCancelable(false);
        dialog.setPositiveButton(R.string.yes, yesListener);
        dialog.setNegativeButton(R.string.no,noListener);
        dialog.show();
    }
}

