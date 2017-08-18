package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Controller {

    @FXML
    Button piedra;
    @FXML
    Button papel;
    @FXML
    Button tijera;
    @FXML
    Button reset;
    @FXML
    TextField player1;
    @FXML
    TextField player2;
    @FXML
    TextField player3;
    @FXML
    TextField computadora1;
    @FXML
    TextField computadora2;
    @FXML
    TextField computadora3;
    @FXML
    TextField ganaste;
    @FXML
    TextField fin;
    @FXML
    ImageView jugador;
    @FXML
    ImageView computadora;
    @FXML
    ImageView imagenpiedra;
    @FXML
    ImageView imagenpapel;
    @FXML
    ImageView imagentijera;



    public void piedra(ActionEvent actionEvent) {
        File file = new File("src/imagenes/piedra1.png");
        Image image = new Image(file.toURI().toString());
        jugador.setImage(image);

        int randumnum;
        randumnum = 1 + (int) (Math.random() * 3);
        switch(randumnum) {
            case 1:
                File file1 = new File("src/imagenes/piedra2.png");
                Image image1 = new Image (file1.toURI().toString());
                computadora.setImage(image1);
                break;
            case 2:
                File file2 = new File("src/imagenes/papel2.png");
                Image image2 = new Image (file2.toURI().toString());
                computadora.setImage(image2);
                break;
            case 3:
                File file3 = new File("src/imagenes/tijera2.png");
                Image image3 = new Image (file3.toURI().toString());
                computadora.setImage(image3);
                break;
        }
        if (randumnum == 2) {
            ganaste.setText("PERDISTE");

            if (computadora1.getText().equals("")){
                computadora1.setText("★");
            }

            else if (computadora1.getText().equals("★") && computadora2.getText().equals("")){
                computadora2.setText("★");
            }

            else if (computadora2.getText().equals("★") && computadora3.getText().equals("")){
                computadora3.setText("★");
            }

        }
        else if (randumnum == 3){
            ganaste.setText("GANASTE");

            if (player1.getText().equals("")){
                player1.setText("★");
            }

            else if (player1.getText().equals("★") && player2.getText().equals("")){
                player2.setText("★");
            }

            else if (player2.getText().equals("★") && player3.getText().equals("")){
                player3.setText("★");
            }

        }
        else if (randumnum == 1) ganaste.setText("EMPATE");

        if (player3.getText().equals("★")){
            int numganaste;
            numganaste = 1 + (int) (Math.random() * 4);
            switch(numganaste) {
                case 1:
                    fin.setText("GANASTE LA PARTIDA!");
                    break;
                case 2:
                    fin.setText("ERES EL NUMNERO 1!");
                    break;
                case 3:
                    fin.setText("ARRRRRIBAAAA!");
                    break;
                case 4:
                    fin.setText("Bien por ti.");
                    break;
            }
            fin.setVisible(true);
            fin.setStyle("-fx-background-color:#98fb98; -fx-border-color: black; -fx-border-width:10");
        }

        if (computadora3.getText().equals("★")) {
            int numperdiste;
            numperdiste = 1 + (int) (Math.random() * 4);
            switch(numperdiste) {
                case 1:
                    fin.setText("PERDISTE LA PARTIDA!");
                    break;
                case 2:
                    fin.setText("AYAYAYI!");
                    break;
                case 3:
                    fin.setText("LOSER!");
                    break;
                case 4:
                    fin.setText("TE RETO DEVUELTA!");
                    break;
            }
            fin.setVisible(true);
            fin.setStyle("-fx-background-color:#d3d3d3;  -fx-border-color: black; -fx-border-width:10");
        }
    }

    public void papel(ActionEvent actionEvent) {
        File file = new File("src/imagenes/papel1.png");
        Image image = new Image(file.toURI().toString());
        jugador.setImage(image);

        int randumnum;
        randumnum = 1 + (int) (Math.random() * 3);
        switch(randumnum) {
            case 1:
                File file1 = new File("src/imagenes/piedra2.png");
                Image image1 = new Image (file1.toURI().toString());
                computadora.setImage(image1);
                break;
            case 2:
                File file2 = new File("src/imagenes/papel2.png");
                Image image2 = new Image (file2.toURI().toString());
                computadora.setImage(image2);
                break;
            case 3:
                File file3 = new File("src/imagenes/tijera2.png");
                Image image3 = new Image (file3.toURI().toString());
                computadora.setImage(image3);
                break;
        }
        if (randumnum == 3){
            ganaste.setText("PERDISTE");

            if (computadora1.getText().equals("")){
                computadora1.setText("★");
            }

            else if (computadora1.getText().equals("★") && computadora2.getText().equals("")){
                computadora2.setText("★");
            }

            else if (computadora2.getText().equals("★") && computadora3.getText().equals("")){
                computadora3.setText("★");
            }
        }

        else if (randumnum == 1){
            ganaste.setText("GANASTE");

            if (player1.getText().equals("")){
                player1.setText("★");
            }

            else if (player1.getText().equals("★") && player2.getText().equals("")){
                player2.setText("★");
            }

            else if (player2.getText().equals("★") && player3.getText().equals("")){
                player3.setText("★");
            }
        }
        else if (randumnum == 2) ganaste.setText("EMPATE");

        if (player3.getText().equals("★")){

            int numganaste;
            numganaste = 1 + (int) (Math.random() * 4);
            switch(numganaste) {
                case 1:
                    fin.setText("GANASTE LA PARTIDA!");
                    break;
                case 2:
                    fin.setText("ERES EL NUMNERO 1!");
                    break;
                case 3:
                    fin.setText("ARRRRRIBAAAA!");
                    break;
                case 4:
                    fin.setText("Bien por ti.");
                    break;
            }
                fin.setVisible(true);
                fin.setStyle("-fx-background-color:#98fb98; -fx-border-color: black; -fx-border-width:10");
        }

        if (computadora3.getText().equals("★")) {
            int numperdiste;
            numperdiste = 1 + (int) (Math.random() * 4);
            switch(numperdiste) {
                case 1:
                    fin.setText("PERDISTE LA PARTIDA!");
                    break;
                case 2:
                    fin.setText("AYAYAYI!");
                    break;
                case 3:
                    fin.setText("LOSER!");
                    break;
                case 4:
                    fin.setText("TE RETO DEVUELTA!");
                    break;
            }

            fin.setVisible(true);
            fin.setStyle("-fx-background-color:#d3d3d3;  -fx-border-color: black; -fx-border-width:10");
        }
    }


    public void tijera(ActionEvent actionEvent) {
        File file = new File("src/imagenes/tijera1.png");
        Image image = new Image(file.toURI().toString());
        jugador.setImage(image);

        int randumnum;
        randumnum = 1 + (int) (Math.random() * 3);
        switch(randumnum) {
            case 1:
                File file1 = new File("src/imagenes/piedra2.png");
                Image image1 = new Image (file1.toURI().toString());
                computadora.setImage(image1);
                break;
            case 2:
                File file2 = new File("src/imagenes/papel2.png");
                Image image2 = new Image (file2.toURI().toString());
                computadora.setImage(image2);
                break;
            case 3:
                File file3 = new File("src/imagenes/tijera2.png");
                Image image3 = new Image (file3.toURI().toString());
                computadora.setImage(image3);
                break;
        }
        if (randumnum == 1){
            ganaste.setText("PERDISTE");

            if (computadora1.getText().equals("")){
                computadora1.setText("★");
            }

            else if (computadora1.getText().equals("★") && computadora2.getText().equals("")){
                computadora2.setText("★");
            }

            else if (computadora2.getText().equals("★") && computadora3.getText().equals("")){
                computadora3.setText("★");
            }
        }

        else if (randumnum == 2){
            ganaste.setText("GANASTE");

            if (player1.getText().equals("")){
                player1.setText("★");
            }

            else if (player1.getText().equals("★") && player2.getText().equals("")){
                player2.setText("★");
            }

            else if (player2.getText().equals("★") && player3.getText().equals("")){
                player3.setText("★");
            }
        }

        else if (randumnum == 3) ganaste.setText("EMPATE");

        if (player3.getText().equals("★")){
            int numganaste;
            numganaste = 1 + (int) (Math.random() * 4);
            switch(numganaste) {
                case 1:
                    fin.setText("GANASTE LA PARTIDA!");
                    break;
                case 2:
                    fin.setText("ERES EL NUMNERO 1!");
                    break;
                case 3:
                    fin.setText("ARRRRRIBAAAA!");
                    break;
                case 4:
                    fin.setText("Bien por ti.");
                    break;
            }
            fin.setVisible(true);
            fin.setStyle("-fx-background-color:#98fb98; -fx-border-color: black; -fx-border-width:10");

        }

        if (computadora3.getText().equals("★")) {
            int numperdiste;
            numperdiste = 1 + (int) (Math.random() * 4);
            switch(numperdiste) {
                case 1:
                    fin.setText("PERDISTE LA PARTIDA!");
                    break;
                case 2:
                    fin.setText("AYAYAYI!");
                    break;
                case 3:
                    fin.setText("LOSER!");
                    break;
                case 4:
                    fin.setText("TE RETO DEVUELTA!");
                    break;
            }
            fin.setVisible(true);
            fin.setStyle("-fx-background-color:#d3d3d3;  -fx-border-color: black; -fx-border-width:10");

        }
    }


    public void reset(ActionEvent actionEvent) {
        File file = new File("src/imagenes/blank.png");
        Image image = new Image(file.toURI().toString());
        jugador.setImage(image);
        computadora.setImage((image));
        ganaste.setText("");
        player1.setText("");
        player2.setText("");
        player3.setText("");
        computadora1.setText("");
        computadora2.setText("");
        computadora3.setText("");
        fin.setVisible(false);
        fin.setText("");
    }



}


