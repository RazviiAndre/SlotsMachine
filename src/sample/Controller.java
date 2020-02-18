package sample;

import com.sun.xml.internal.bind.v2.TODO;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Controller {

//    BUTTONS
    public Button dubleazaNEGRU;
    public Button dubleazaROSU;
    public Button JOACA;
//    Linia 1
    public Label label1_1SLOT;
    public Label label1_2SLOT;
    public Label label1_3SLOT;
    public Label label1_4SLOT;
    public Label label1_5SLOT;
//    Linia 2
    public Label label2_1SLOT;
    public Label label2_2SLOT;
    public Label label2_3SLOT;
    public Label label2_4SLOT;
    public Label label2_5SLOT;

//    Linia 3
    public Label label3_1SLOT;
    public Label label3_2SLOT;
    public Label label3_3SLOT;
    public Label label3_4SLOT;
    public Label label3_5SLOT;

//    Labels
    public Label labelCASH;
    public Label labelWIN;
    public Label labelBET;

    //    GAME VARIABLES
    static int cash = 1000;
    static int bet = 50;
//    static int win = 0;
     boolean isWin = false;
    static int slot1_1;
    static int slot1_2;
    static int slot1_3;
    static int slot1_4;
    static int slot1_5;

    static int slot2_1;
    static int slot2_2;
    static int slot2_3;
    static int slot2_4;
    static int slot2_5;

    static int slot3_1,slot3_2,slot3_3,slot3_4,slot3_5;

    public void setDubleaza(){
//        @TODO - bug la dublaj (functioneaza butonul o singura data doar cand ai vreun dublaj) - REZOLVAT
//        @TODO - implementare functionalitate de a dubla de 5 ori daca dublajele sunt corecte.

        if(isWin){

            Random random = new Random();
            int getColor = random.nextInt(2);


                if (getColor == 0) {
                    System.out.println("Ai dublat corect !");
                  isWin = false;
                } else {
                    System.out.println("A dublat gresit !");
                    isWin = false;
                }
        } else {
            System.out.println(" MAI INTAI TREBUIE SA CASTIGI !");
        }
    }

    public void setJOACA(){
//        VARIABLES
         int win = 0;
        Random random = new Random();
//        Aici punem imagini pe linii
        slot1_1 = random.nextInt(8);
        slot1_2 = random.nextInt(8);
        slot1_3 = random.nextInt(8);
        slot1_4 = random.nextInt(8);
        slot1_5 = random.nextInt(8);

        slot2_1 = random.nextInt(8);
        slot2_2 = random.nextInt(8);
        slot2_3 = random.nextInt(8);
        slot2_4 = random.nextInt(8);
        slot2_5 = random.nextInt(8);

        slot3_1 = random.nextInt(8);
        slot3_2 = random.nextInt(8);
        slot3_3 = random.nextInt(8);
        slot3_4 = random.nextInt(8);
        slot3_5 = random.nextInt(8);

//        GAME ALGORITHM
        if(cash <= 0) {
            System.out.println("Ai nevoie de bani!");
            return;
        }
            if(slot1_1 == slot1_2 && slot1_2 != slot1_3){
                win = 3 * bet;
                cash += win;
                isWin = true;
            }

            if(slot1_1 == slot1_2 && slot1_2 == slot1_3 && slot1_3 != slot1_4){
                win = 9 * bet;
                cash += win;
                isWin = true;
            }

            if(slot1_1 == slot1_2 && slot1_2 == slot1_3 && slot1_3 == slot1_4 && slot1_4 != slot1_5){
                win = 20 * bet;
                cash += win;
                isWin = true;
            }

            if (slot1_1 == slot1_2 && slot1_2 == slot1_3 && slot1_3 == slot1_4 && slot1_4 == slot1_5) {
                win = 100 * bet;
                cash += win;
                isWin = true;
            }

        if(slot2_1 == slot2_2 && slot2_2 != slot2_3){
            win = 3 * bet;
            cash += win;
            isWin = true;
        }

        if(slot2_1 == slot2_2 && slot2_2 == slot2_3 && slot2_3 != slot2_4){
            win = 9 * bet;
            cash += win;
            isWin = true;
        }

        if(slot2_1 == slot2_2 && slot2_2 == slot2_3 && slot2_3 == slot2_4 && slot2_4 != slot2_5){
            win = 20 * bet;
            cash += win;
            isWin = true;
        }

        if (slot2_1 == slot2_2 && slot2_2 == slot2_3 && slot2_3 == slot2_4 && slot2_4 == slot2_5) {
            win = 100 * bet;
            cash += win;
            isWin = true;
        }

        else
            cash -= bet;

        System.out.println("LINIA 1 : " + slot1_1 + " " + slot1_2 + " " + slot1_3 + " " + slot1_4 + " " + slot1_5 + "    WIN : " + win + " CASH : " + cash + " BET : " + bet);
        System.out.println("LINIA 2 : " + slot2_1 + " " + slot2_2 + " " + slot2_3 + " " + slot2_4 + " " + slot2_5 + "    WIN : " + win + " CASH : " + cash + " BET : " + bet);


//       GAME LABELS
        labelBET.setText(String.valueOf(bet));
        labelWIN.setText(String.valueOf(win));
        labelCASH.setText(String.valueOf(cash));

//        GAME VIEW
        switch (slot1_1) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                    label1_1SLOT.setGraphic(new ImageView(image));
                    break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                     label1_1SLOT.setGraphic(new ImageView(image1));
                    break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                      label1_1SLOT.setGraphic(new ImageView(image2));
                    break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                    label1_1SLOT.setGraphic(new ImageView(image3));
                    break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                    label1_1SLOT.setGraphic(new ImageView(image4));
                    break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                    label1_1SLOT.setGraphic(new ImageView(image5));
                    break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                    label1_1SLOT.setGraphic(new ImageView(image6));
                    break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                    label1_1SLOT.setGraphic(new ImageView(image7));
                    break;

            default:
                label1_1SLOT.setGraphic(null);

            }

        switch (slot1_2) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                     label1_2SLOT.setGraphic(new ImageView(image));
                     break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                    label1_2SLOT.setGraphic(new ImageView(image1));
                    break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                    label1_2SLOT.setGraphic(new ImageView(image2));
                     break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                    label1_2SLOT.setGraphic(new ImageView(image3));
                    break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                    label1_2SLOT.setGraphic(new ImageView(image4));
                    break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label1_2SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label1_2SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label1_2SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label1_2SLOT.setGraphic(null);
        }

        switch (slot1_3) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                    label1_3SLOT.setGraphic(new ImageView(image));
                    break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                    label1_3SLOT.setGraphic(new ImageView(image1));
                    break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                    label1_3SLOT.setGraphic(new ImageView(image2));
                     break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                    label1_3SLOT.setGraphic(new ImageView(image3));
                    break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                    label1_3SLOT.setGraphic(new ImageView(image4));
                    break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label1_3SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label1_3SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label1_3SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label1_3SLOT.setGraphic(null);
        }

        switch (slot1_4) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label1_4SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label1_4SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label1_4SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label1_4SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label1_4SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label1_4SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label1_4SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label1_4SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label1_4SLOT.setGraphic(null);
        }

        switch (slot1_5) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label1_5SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label1_5SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label1_5SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label1_5SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label1_5SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label1_5SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label1_5SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label1_5SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label1_5SLOT.setGraphic(null);
        }

        switch (slot2_1) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label2_1SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label2_1SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label2_1SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label2_1SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label2_1SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label2_1SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label2_1SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label2_1SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label2_1SLOT.setGraphic(null);
        }

        switch (slot2_2) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label2_2SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label2_2SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label2_2SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label2_2SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label2_2SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label2_2SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label2_2SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label2_2SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label2_2SLOT.setGraphic(null);
        }

        switch (slot2_3) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label2_3SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label2_3SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label2_3SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label2_3SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label2_3SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label2_3SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label2_3SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label2_3SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label2_3SLOT.setGraphic(null);
        }

        switch (slot2_4) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label2_4SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label2_4SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label2_4SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label2_4SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label2_4SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label2_4SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label2_4SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label2_4SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label2_4SLOT.setGraphic(null);
        }

        switch (slot2_5) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label2_5SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label2_5SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label2_5SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label2_5SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label2_5SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label2_5SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label2_5SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label2_5SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label2_5SLOT.setGraphic(null);
        }

        switch (slot3_1) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label3_1SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label3_1SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label3_1SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label3_1SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label3_1SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label3_1SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label3_1SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label3_1SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label3_1SLOT.setGraphic(null);
        }

        switch (slot3_2) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label3_2SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label3_2SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label3_2SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label3_2SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label3_2SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label3_2SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label3_2SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label3_2SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label3_2SLOT.setGraphic(null);
        }

        switch (slot3_3) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label3_3SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label3_3SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label3_3SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label3_3SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label3_3SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label3_3SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label3_3SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label3_3SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label3_3SLOT.setGraphic(null);
        }

        switch (slot3_4) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label3_4SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label3_4SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label3_4SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label3_4SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label3_4SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label3_4SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label3_4SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label3_4SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label3_4SLOT.setGraphic(null);
        }

        switch (slot3_5) {
            case 0 : Image image = new Image(getClass().getResourceAsStream("/images/septar.png"));
                label3_5SLOT.setGraphic(new ImageView(image));
                break;
            case 1 : Image image1 = new Image(getClass().getResourceAsStream("/images/struguri.png"));
                label3_5SLOT.setGraphic(new ImageView(image1));
                break;
            case 2 : Image image2 = new Image(getClass().getResourceAsStream("/images/portocala.png"));
                label3_5SLOT.setGraphic(new ImageView(image2));
                break;
            case 3 : Image image3 = new Image(getClass().getResourceAsStream("/images/lamaie.png"));
                label3_5SLOT.setGraphic(new ImageView(image3));
                break;
            case 4 : Image image4 = new Image(getClass().getResourceAsStream("/images/cirese.png"));
                label3_5SLOT.setGraphic(new ImageView(image4));
                break;
            case 5 : Image image5 = new Image(getClass().getResourceAsStream("/images/steluta.png"));
                label3_5SLOT.setGraphic(new ImageView(image5));
                break;
            case 6 : Image image6 = new Image(getClass().getResourceAsStream("/images/pepene.png"));
                label3_5SLOT.setGraphic(new ImageView(image6));
                break;
            case 7 : Image image7 = new Image(getClass().getResourceAsStream("/images/pruna.png"));
                label3_5SLOT.setGraphic(new ImageView(image7));
                break;

            default:
                label3_5SLOT.setGraphic(null);
        }





    }
}
