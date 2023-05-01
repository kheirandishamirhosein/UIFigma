package com.example.ui

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.button.MaterialButton

class ShoppingCartAddProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart_add_product)

        val btnProceedToCheekOut2: MaterialButton = findViewById(R.id.md_btn_cheek_out_loan_success_2)
        btnProceedToCheekOut2.setOnClickListener {
            val mDialogViewProductDetails = LayoutInflater.from(this).inflate(R.layout.successful_product_shopping_cart, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogViewProductDetails)

            val mAlertDialog = mBuilder.show()
            mDialogViewProductDetails.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
    }
}