package com.assesment.profileactivity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class ProfileActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageView
    private lateinit var btnSupport: ImageView
    private lateinit var btnEditProfile: ImageView
    private lateinit var profileImage: CircleImageView
    private lateinit var tvUserName: TextView
    private lateinit var tvMemberSince: TextView

    // Layout items
    private lateinit var layoutCredGarage: LinearLayout
    private lateinit var layoutCreditScore: LinearLayout
    private lateinit var layoutCashback: LinearLayout
    private lateinit var layoutBankBalance: LinearLayout
    private lateinit var layoutCashbackBalance: LinearLayout
    private lateinit var layoutCoins: LinearLayout
    private lateinit var layoutRewards: LinearLayout
    private lateinit var layoutTransactions: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        initViews()
        setupClickListeners()
        loadUserData()
    }

    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)
        btnSupport = findViewById(R.id.btnSupport)
        btnEditProfile = findViewById(R.id.btnEditProfile)
        profileImage = findViewById(R.id.profileImage)
        tvUserName = findViewById(R.id.tvUserName)
        tvMemberSince = findViewById(R.id.tvMemberSince)


        layoutCreditScore = findViewById(R.id.layoutCreditScore)
        layoutCashback = findViewById(R.id.layoutCashback)
        layoutBankBalance = findViewById(R.id.layoutBankBalance)
        layoutCashbackBalance = findViewById(R.id.layoutCashbackBalance)
        layoutCoins = findViewById(R.id.layoutCoins)
        layoutRewards = findViewById(R.id.layoutRewards)

    }

    private fun setupClickListeners() {
        btnBack.setOnClickListener {
            finish()
        }

        btnSupport.setOnClickListener {
            showToast("Support clicked")
            // Navigate to support activity
            // startActivity(Intent(this, SupportActivity::class.java))
        }

        btnEditProfile.setOnClickListener {
            showToast("Edit profile clicked")
            // Navigate to edit profile activity
            // startActivity(Intent(this, EditProfileActivity::class.java))
        }

        layoutCreditScore.setOnClickListener {
            showToast("Credit Score clicked")
            // Navigate to credit score activity
            // startActivity(Intent(this, CreditScoreActivity::class.java))
        }

        layoutCashback.setOnClickListener {
            showToast("Lifetime Cashback clicked")
            // Navigate to cashback details
            // startActivity(Intent(this, CashbackActivity::class.java))
        }

        layoutBankBalance.setOnClickListener {
            showToast("Bank Balance clicked")
            // Navigate to bank balance activity
            // startActivity(Intent(this, BankBalanceActivity::class.java))
        }

        layoutCashbackBalance.setOnClickListener {
            showToast("Cashback Balance clicked")
            // Navigate to cashback balance details
            // startActivity(Intent(this, CashbackBalanceActivity::class.java))
        }

        layoutCoins.setOnClickListener {
            showToast("Coins clicked")
            // Navigate to coins activity
            // startActivity(Intent(this, CoinsActivity::class.java))
        }

        layoutRewards.setOnClickListener {
            showToast("Rewards clicked")
            // Navigate to rewards activity
            // startActivity(Intent(this, RewardsActivity::class.java))
        }


    }

    private fun loadUserData() {
        // Load user data from preferences or API
        // This is sample data
        tvUserName.text = "andaz Kumar"
        tvMemberSince.text = "member since Dec, 2020"

        // Load profile image
        // You can use Glide or Picasso to load image from URL
        // Glide.with(this).load(profileImageUrl).into(profileImage)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    // Method to update user profile data
    fun updateUserProfile(name: String, memberSince: String) {
        tvUserName.text = name
        tvMemberSince.text = memberSince
    }

    // Method to update credit score
    fun updateCreditScore(score: String) {
        // Find and update credit score text view
        val creditScoreText = layoutCreditScore.findViewById<TextView>(R.id.tvCreditScore)
        creditScoreText?.text = score
    }

    // Method to update cashback amount
    fun updateCashback(amount: String) {
        // Find and update cashback text view
        val cashbackText = layoutCashback.findViewById<TextView>(R.id.tvCashback)
        cashbackText?.text = amount
    }
}