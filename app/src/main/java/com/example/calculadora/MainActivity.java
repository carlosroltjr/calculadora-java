package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String num1 = "";
    private String num2 = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Caluladora");
        this.display = findViewById(R.id.tv_display);
    }

    public  void onClickBtn1(View v) {
        atualizarNumeroDigitado("1");
        atualizarDisplay("1");
    }

    public  void onClickBtn2(View v) {
        atualizarNumeroDigitado("2");
        atualizarDisplay("2");
    }

    public  void onClickBtn3(View v) {
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");
    }

    public  void onClickBtn4(View v) {
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");
    }

    public  void onClickBtn5(View v) {
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");
    }

    public  void onClickBtn6(View v) {
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }

    public  void onClickBtn7(View v) {
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }

    public  void onClickBtn8(View v) {
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }

    public  void onClickBtn9(View v) {
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }

    public  void onClickBtn0(View v) {
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public  void onClickBtnSoma(View v) {
        if (!this.num1.isEmpty()) {
            this.operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_SHORT).show();
        }
    }

    public  void onClickBtnMenos(View v) {
        if (!this.num1.isEmpty()) {
            this.operacao = "-";
            atualizarDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_SHORT).show();
        }
    }

    public  void onClickBtnVezes(View v) {
        if (!this.num1.isEmpty()) {
            this.operacao = "*";
            atualizarDisplay("*");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_SHORT).show();
        }
    }

    public  void onClickBtnDivide(View v) {
        if (!this.num1.isEmpty()) {
            this.operacao = "/";
            atualizarDisplay("/");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickIgual(View v) {
        if (!this.num1.isEmpty() && !this.num2.isEmpty()) {
            int valor1 = Integer.parseInt(this.num1);
            int valor2 = Integer.parseInt(this.num2);
            int resultado = 0;

            if (operacao.equals("+")) {
                resultado = valor1 + valor2;
                this.display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("-")) {
                resultado = valor1 - valor2;
                this.display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("*")) {
                resultado = valor1 * valor2;
                this.display.setText(String.valueOf(resultado));
            }

            if (operacao.equals("/")) {
                if (valor2 != 0) {
                    double valor1Double = Double.parseDouble(this.num1);
                    double valor2Double = Double.parseDouble(this.num2);
                    double resultadoDouble = valor1Double / valor2Double;
                    this.display.setText(String.valueOf(resultadoDouble));
                } else {
                    Toast.makeText(MainActivity.this, "Divisão por zero negada", Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickBtnLimpar(View v) {
        this.display.setText("");
        this.num1 = "";
        this.num2 = "";
        this.operacao = "";
    }

    private void atualizarNumeroDigitado(String numero) {
        if (this.operacao.isEmpty()) {
            this.num1 += numero;
        } else {
            this.num2 += numero;
        }
    }

    private void atualizarDisplay(String texto) {
        String displayTexto = this.display.getText().toString();
        displayTexto += texto;
        this.display.setText(displayTexto);
    }
}