package com.example.toolbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private EditText mInputMoney;
    private EditText mInputInfo;
    private Button mBtnOk;
    private CheckBox mBankCardChkBx;
    private CheckBox mMobilePhoneChkBx;
    private CheckBox mCashAddressChkBx;
    private String payMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        initViews();
        buttonClick();
    }

    private void initViews() {
        mInputMoney = findViewById(R.id.inputMoney);
        mInputInfo = findViewById(R.id.inputInfo);
        mBtnOk = findViewById(R.id.btnOK);
        mBankCardChkBx = findViewById(R.id.bankCardChkBx);
        mMobilePhoneChkBx = findViewById(R.id.mobilePhoneChkBx);
        mCashAddressChkBx = findViewById(R.id.cashAddressChkBx);
        mBankCardChkBx.setOnCheckedChangeListener(checkedChangeListener);
        mMobilePhoneChkBx.setOnCheckedChangeListener(checkedChangeListener);
        mCashAddressChkBx.setOnCheckedChangeListener(checkedChangeListener);
    }

    private void resetCheckBoxes(){
        mBankCardChkBx.setChecked(false);
        mMobilePhoneChkBx.setChecked(false);
        mCashAddressChkBx.setChecked(false);
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                switch (compoundButton.getId()) {
                    case R.id.bankCardChkBx:
                        resetCheckBoxes();
                        mBankCardChkBx.setChecked(true);
                        mInputInfo.setInputType(InputType.TYPE_CLASS_NUMBER);
                        payMethod = getText(R.string.card_pay).toString();
                        break;
                    case R.id.mobilePhoneChkBx:
                        resetCheckBoxes();
                        mMobilePhoneChkBx.setChecked(true);
                        mInputInfo.setInputType(InputType.TYPE_CLASS_PHONE);
                        payMethod = getText(R.string.phone_pay).toString();
                        break;
                    case R.id.cashAddressChkBx:
                        resetCheckBoxes();
                        mInputInfo.setInputType(InputType.TYPE_CLASS_TEXT);
                        mCashAddressChkBx.setChecked(true);
                        payMethod = getText(R.string.cash_pay).toString();
                        break;
                    default:
                }
            }
        }
    };

    private void buttonClick() {
        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String money = mInputMoney.getText().toString();
                String info = mInputInfo.getText().toString();
                if (money.isEmpty() || info.isEmpty() || payMethod.isEmpty()){
                    Toast.makeText(CheckBoxActivity.this, getText(R.string.empty_message), Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(CheckBoxActivity.this, getString(R.string.click_message, money,payMethod,info), Toast.LENGTH_LONG).show();
            }
        });
    }
}