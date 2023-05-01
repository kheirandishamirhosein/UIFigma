package com.example.ui

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.button.MaterialButton

class CashShoppingCartChekOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cash_shopping_cart_chek_out)

        val btnCheckOut: MaterialButton = findViewById(R.id.md_btn_cheek_out)
        btnCheckOut.setOnClickListener {
            val mDialogViewProductDetails = LayoutInflater.from(this).inflate(R.layout.success_cash_shopping_cart, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogViewProductDetails)
            val mAlertDialog = mBuilder.show()
            mDialogViewProductDetails.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }


    }
}