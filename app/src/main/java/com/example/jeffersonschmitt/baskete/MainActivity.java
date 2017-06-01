package com.example.jeffersonschmitt.baskete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private int pontuacaoTimeA = 0;

  private int pontuacaoTimeB = 0;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button botaoTresPontosA = (Button) findViewById(R.id.trespontosA);
    botaoTresPontosA.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        addTresPontosTimeA();
      }
    });

    Button botaoDoisPontosA = (Button) findViewById(R.id.doisPontosA);

    botaoDoisPontosA.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        addDoisPontosTimeA();
      }
    });

    Button botaoUmPontoA = (Button) findViewById(R.id.tiroLivreA);

    botaoUmPontoA.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        addUmPontoTimeA();
      }
    });

    Button botaoTresPontosB = (Button) findViewById(R.id.trespontosB);

    botaoTresPontosB.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        addTresPontosTimeB();
      }
    });

    Button botaoDoisPontosB = (Button) findViewById(R.id.doisPontosB);

    botaoDoisPontosB.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        addDoisPontosTimeB();
      }
    });

    Button botaoUmPontosB = (Button) findViewById(R.id.tiroLivreB);

    botaoUmPontosB.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        addUmPontoTimeB();
      }
    });

    Button botaoReiniciarPartida= (Button) findViewById(R.id.reiniciarPartida);

    botaoReiniciarPartida.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        reiniciarPartida();
      }
    });


  }


  public void reiniciarPartida(){
    pontuacaoTimeA=0;
    pontuacaoTimeB=0;
    mostrarPlacarTimeA(pontuacaoTimeA);
    mostrarPlacarTimeB(pontuacaoTimeB);
  }

  public void mostrarPlacarTimeA(int pontuacao) {
    TextView placarTimeA = (TextView) findViewById(R.id.placarTimeA);
    placarTimeA.setText(String.valueOf(pontuacao));
  }

  public void addTresPontosTimeA() {
    pontuacaoTimeA = pontuacaoTimeA + 3;
    mostrarPlacarTimeA(pontuacaoTimeA);
  }

  public void addDoisPontosTimeA() {
    pontuacaoTimeA = pontuacaoTimeA + 2;
    mostrarPlacarTimeA(pontuacaoTimeA);
  }

  public void addUmPontoTimeA() {
    pontuacaoTimeA = pontuacaoTimeA + 1;
    mostrarPlacarTimeA(pontuacaoTimeA);
  }

  public void mostrarPlacarTimeB(int pontuacao) {
    TextView placarTimeB = (TextView) findViewById(R.id.placarTimeB);
    placarTimeB.setText(String.valueOf(pontuacao));
  }

  public void addTresPontosTimeB() {
    pontuacaoTimeB = pontuacaoTimeB + 3;
    mostrarPlacarTimeB(pontuacaoTimeB);
  }

  public void addDoisPontosTimeB() {
    pontuacaoTimeB = pontuacaoTimeB + 2;
    mostrarPlacarTimeB(pontuacaoTimeB);
  }

  public void addUmPontoTimeB() {
    pontuacaoTimeB = pontuacaoTimeB + 1;
    mostrarPlacarTimeB(pontuacaoTimeB);
  }
}
