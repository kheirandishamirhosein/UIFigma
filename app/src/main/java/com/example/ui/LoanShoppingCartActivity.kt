package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class LoanShoppingCartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loan_shopping_cart)

        val btnLoan: MaterialButton = findViewById(R.id.md_btn_proceed_to_cheek_out_loan_shopping_cart)
        btnLoan.setOnClickListener {
            intent = Intent(this, ShoppingCartAddProductActivity::class.java)
            startActivity(intent)

        }
    }
}