package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class ShoppingCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart)

        val btnProceedToCheekOut: MaterialButton = findViewById(R.id.md_btn_proceed_to_cheek_out)
        btnProceedToCheekOut.setOnClickListener {
            intent = Intent(this, CashShoppingCartChekOut::class.java)
            startActivity(intent)
        }

        val btnLoan: MaterialButton = findViewById(R.id.md_btn_loan_shopping_cart)
        btnLoan.setOnClickListener {
            intent = Intent(this, LoanShoppingCartActivity::class.java)
            startActivity(intent)

        }


    }

}