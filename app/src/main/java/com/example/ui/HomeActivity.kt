package com.example.ui

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //dialog
        val btnBagShop: MaterialButton = findViewById(R.id.md_btn_bag_shop)
        btnBagShop.setOnClickListener {
            val mDialogViewProductDetails = LayoutInflater.from(this).inflate(R.layout.product_details, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogViewProductDetails)

            val mAlertDialog = mBuilder.show()
            mDialogViewProductDetails.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        val btnBagShop2: MaterialButton = findViewById(R.id.md_btn_bag_shop2)
        btnBagShop2.setOnClickListener {
            val mDialogViewProductDetails = LayoutInflater.from(this).inflate(R.layout.product_details, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogViewProductDetails)

            val mAlertDialog = mBuilder.show()
            mDialogViewProductDetails.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }


        //iv shop
        val ivBagShop: ImageView = findViewById(R.id.md_btn_shop_bag_home)
        ivBagShop.setOnClickListener {
            intent = Intent(this, ShoppingCart::class.java)
            startActivity(intent)
        }




    }

}