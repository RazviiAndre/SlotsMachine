package sample;

import java.util.Random;

import javafx.animation.PathTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    //    BUTTONS
    public Button dubleazaNEGRU;
    public Button dubleazaROSU;
    public Button JOACA;

    //    LINE 1
    public Label label1_1SLOT;
    public Label label1_2SLOT;
    public Label label1_3SLOT;
    public Label label1_4SLOT;
    public Label label1_5SLOT;

    //    LINE 2
    public Label label2_1SLOT;
    public Label label2_2SLOT;
    public Label label2_3SLOT;
    public Label label2_4SLOT;
    public Label label2_5SLOT;

    //    LINE 3
    public Label label3_1SLOT;
    public Label label3_2SLOT;
    public Label label3_3SLOT;
    public Label label3_4SLOT;
    public Label label3_5SLOT;

    //    LABEL VIEW FOR CASH,WIN,BET
    public Label labelCASH;
    public Label labelWIN;
    public Label labelBET;

    //    PLAY VARIABLES
    static int cash = 1000;
    static int bet = 50;
    static int win = 0;
    boolean isWin = false;
    static int lastWin = win;

    //    VARIABLES FOR FRUIT IMAGES(3 ROWS 5 COLUMNS)
    static int slot1_1,slot1_2,slot1_3,slot1_4,slot1_5;
    static int slot2_1,slot2_2,slot2_3,slot2_4,slot2_5;
    static int slot3_1,slot3_2,slot3_3,slot3_4,slot3_5;





    public void setDubleaza(){
//        @TODO - implementare functionalitate de a dubla de 5 ori daca dublajele sunt corect

        if(isWin){
            Random random = new Random();
            int getColor = random.nextInt(2);

            if (getColor == 0) {
                System.out.println("Ai dublat corect !");
                win = lastWin * 2;
                cash += win;
                lastWin = 0;
                win = 0;
                isWin = false;
            } else {
                System.out.println("Ai dublat gresit !");
                lastWin = 0;
                win = 0;
                isWin = false;
            }
        } else {
            System.out.println("MAI INTAI TREBUIE SA CASTIGI !");
        }
    }

    public void setJOACA(){
//        VARIABLES
        cash += lastWin;
        isWin = false;
        Random random = new Random();

//      PUT FRUITS IMAGES ON LINES
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

//        STAR CASE ( just one star on the column )
//        FIRST COLUMN
        if(slot1_1 == 5) {
            while(slot2_1 == 5) {
                slot2_1 = random.nextInt(8);
            }
            while(slot3_1 == 5) {
                slot3_1 = random.nextInt(8);
            }
        }

        if(slot2_1 == 5) {
            while(slot1_1 == 5) {
                slot1_1 = random.nextInt(8);
            }
            while(slot3_1 == 5) {
                slot3_1 = random.nextInt(8);
            }
        }

        if(slot3_1 == 5) {
            while(slot1_1 == 5) {
                slot1_1 = random.nextInt(8);
            }
            while(slot2_1 == 5) {
                slot2_1 = random.nextInt(8);
            }
        }

//       SECOND COLUMN
        if(slot1_2 == 5) {
            while(slot2_2 == 5) {
                slot2_2 = random.nextInt(8);
            }
            while(slot3_2 == 5) {
                slot3_2 = random.nextInt(8);
            }
        }
        if(slot2_2 == 5) {
            while(slot1_2 == 5) {
                slot1_2 = random.nextInt(8);
            }
            while(slot3_2 == 5) {
                slot3_2 = random.nextInt(8);
            }
        }

        if(slot3_2 == 5) {
            while(slot1_2 == 5) {
                slot1_2 = random.nextInt(8);
            }
            while(slot2_2 == 5) {
                slot2_2 = random.nextInt(8);
            }
        }

//      THIRD COLUMN
        if(slot1_3 == 5) {
            while(slot2_3 == 5) {
                slot2_3 = random.nextInt(8);
            }
            while(slot3_3 == 5) {
                slot3_3 = random.nextInt(8);
            }
        }
        if(slot2_3 == 5) {
            while(slot1_3 == 5) {
                slot1_3 = random.nextInt(8);
            }
            while(slot3_3 == 5) {
                slot3_3 = random.nextInt(8);
            }
        }

        if(slot3_3 == 5) {
            while(slot1_3 == 5) {
                slot1_3 = random.nextInt(8);
            }
            while(slot2_3 == 5) {
                slot2_3 = random.nextInt(8);
            }
        }
//        FOURTH COLUMN
        if(slot1_4 == 5) {
            while(slot2_4 == 5) {
                slot2_4 = random.nextInt(8);
            }
            while(slot3_4 == 5) {
                slot3_4 = random.nextInt(8);
            }
        }
        if(slot2_4 == 5) {
            while(slot1_4 == 5) {
                slot1_4 = random.nextInt(8);
            }
            while(slot3_4 == 5) {
                slot3_4 = random.nextInt(8);
            }
        }

        if(slot3_4 == 5) {
            while(slot1_4 == 5) {
                slot1_4 = random.nextInt(8);
            }
            while(slot2_4 == 5) {
                slot2_4 = random.nextInt(8);
            }
        }
//        FIFTH COLUMN
        if(slot1_5 == 5) {
            while(slot2_5 == 5) {
                slot2_5 = random.nextInt(8);
            }
            while(slot3_5 == 5) {
                slot3_5 = random.nextInt(8);
            }
        }
        if(slot2_5 == 5) {
            while(slot1_5 == 5) {
                slot1_5 = random.nextInt(8);
            }
            while(slot3_5 == 5) {
                slot3_5 = random.nextInt(8);
            }
        }

        if(slot3_5 == 5) {
            while(slot1_5 == 5) {
                slot1_5 = random.nextInt(8);
            }
            while(slot2_5 == 5) {
                slot2_5 = random.nextInt(8);
            }
        }


//     SEVENS CASE ( just one seven on the column )
//     FIRST COLUMN
        if(slot1_1 == 0) {
            while(slot2_1 == 0) {
                slot2_1 = random.nextInt(8);
            }
            while(slot3_1 == 0) {
                slot3_1 = random.nextInt(8);
            }
        }

        if(slot2_1 == 0) {
            while(slot1_1 == 0) {
                slot1_1 = random.nextInt(8);
            }
            while(slot3_1 == 0) {
                slot3_1 = random.nextInt(8);
            }
        }

        if(slot3_1 == 0) {
            while(slot1_1 == 0) {
                slot1_1 = random.nextInt(8);
            }
            while(slot2_1 == 0) {
                slot2_1 = random.nextInt(8);
            }
        }

//      SECOND COLUMN
        if(slot1_2 == 0) {
            while(slot2_2 == 0) {
                slot2_2 = random.nextInt(8);
            }
            while(slot3_2 == 0) {
                slot3_2 = random.nextInt(8);
            }
        }
        if(slot2_2 == 0) {
            while(slot1_2 == 0) {
                slot1_2 = random.nextInt(8);
            }
            while(slot3_2 == 0) {
                slot3_2 = random.nextInt(8);
            }
        }

        if(slot3_2 == 0) {
            while(slot1_2 == 0) {
                slot1_2 = random.nextInt(8);
            }
            while(slot2_2 == 0) {
                slot2_2 = random.nextInt(8);
            }
        }

//    THIRD COLUMN
        if(slot1_3 == 0) {
            while(slot2_3 == 0) {
                slot2_3 = random.nextInt(8);
            }
            while(slot3_3 == 0) {
                slot3_3 = random.nextInt(8);
            }
        }
        if(slot2_3 == 0) {
            while(slot1_3 == 0) {
                slot1_3 = random.nextInt(8);
            }
            while(slot3_3 == 0) {
                slot3_3 = random.nextInt(8);
            }
        }

        if(slot3_3 == 0) {
            while(slot1_3 == 0) {
                slot1_3 = random.nextInt(8);
            }
            while(slot2_3 == 0) {
                slot2_3 = random.nextInt(8);
            }
        }
//      FOURTH COLUMN
        if(slot1_4 == 0) {
            while(slot2_4 == 0) {
                slot2_4 = random.nextInt(8);
            }
            while(slot3_4 == 0) {
                slot3_4 = random.nextInt(8);
            }
        }
        if(slot2_4 == 0) {
            while(slot1_4 == 0) {
                slot1_4 = random.nextInt(8);
            }
            while(slot3_4 == 0) {
                slot3_4 = random.nextInt(8);
            }
        }

        if(slot3_4 == 0) {
            while(slot1_4 == 0) {
                slot1_4 = random.nextInt(8);
            }
            while(slot2_4 == 0) {
                slot2_4 = random.nextInt(8);
            }
        }
//      FIFTH COLUMN
        if(slot1_5 == 0) {
            while(slot2_5 == 0) {
                slot2_5 = random.nextInt(8);
            }
            while(slot3_5 == 0) {
                slot3_5 = random.nextInt(8);
            }
        }
        if(slot2_5 == 0) {
            while(slot1_5 == 0) {
                slot1_5 = random.nextInt(8);
            }
            while(slot3_5 == 0) {
                slot3_5 = random.nextInt(8);
            }
        }

        if(slot3_5 == 0) {
            while(slot1_5 == 0) {
                slot1_5 = random.nextInt(8);
            }
            while(slot2_5 == 0) {
                slot2_5 = random.nextInt(8);
            }
        }





//        GAME LOGIC ALGORITHM
//        IF CASH < 0
        if(cash <= 0) {
            System.out.println("Ai nevoie de bani!");
            return;
        }


//    	WINS FRUITS
//      FIRST LINE
        if(slot1_1 == 4 && slot1_1 == slot1_2 && slot1_2 != slot1_3) {
            isWin = true;
            System.out.println("PRIMA LINIE 1 == 2");
            win += (3*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot1_1 == slot1_2 && slot1_2 == slot1_3 && slot1_3 != slot1_4) {
            isWin = true;
            System.out.println("PRIMA LINIE 1 == 2 == 3");
            win += (6*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot1_1 == slot1_2 && slot1_2 == slot1_3 && slot1_3 == slot1_4 && slot1_4 != slot1_5) {
            isWin = true;
            System.out.println("PRIMA LINIE 1 == 2 == 3 == 4");
            win += (9*bet);
            labelWIN.setText(String.valueOf(win));
        } else if(slot1_1 == slot1_2 && slot1_2 == slot1_3 && slot1_3 == slot1_4 && slot1_4 == slot1_5) {
            isWin = true;
            System.out.println("PRIMA LINIE 1 == 2 == 3 == 4 == 5");
            win += (40*bet);
            labelWIN.setText(String.valueOf(win));
        }

//       SECOND LINE
        if(slot2_1 == 4 && slot2_1 == slot2_2 && slot2_2 != slot2_3) {
            isWin = true;
            System.out.println("A DOUA LINIE 1 == 2");
            win += (3*bet);
            labelWIN.setText(String.valueOf(win));
        } else if(slot2_1 == slot2_2 && slot2_2 == slot2_3 && slot2_3 != slot2_4) {
            isWin = true;
            System.out.println("A DOUA LINIE 1 == 2 == 3");
            win += (6*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot2_1 == slot2_2 && slot2_2 == slot2_3 && slot2_3 == slot2_4 && slot2_4 != slot2_5) {
            isWin = true;
            System.out.println("A DOUA LINIE 1 == 2 == 3 == 4");
            win += (9*bet);
            labelWIN.setText(String.valueOf(win));
        } else if(slot2_1 == slot2_2 && slot2_2 == slot2_3 && slot2_3 == slot2_4 && slot2_4 == slot2_5) {
            isWin = true;
            System.out.println("A DOUA LINIE 1 == 2 == 3 == 4 == 5");
            win += (40*bet);
            labelWIN.setText(String.valueOf(win));
        }

//        THIRD LINE
        if(slot3_1 == 4 && slot3_1 == slot3_2 && slot3_2 != slot3_3) {
            isWin = true;
            System.out.println("A TREIA LINIE 1 == 2");
            win += (9*bet);
            labelWIN.setText(String.valueOf(win));
        } else if(slot3_1 == slot3_2 && slot3_2 == slot3_3 && slot3_3 != slot3_4) {
            isWin = true;
            System.out.println("A TREIA LINIE 1 == 2 == 3");
            win += (6*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot3_1 == slot3_2 && slot3_2 == slot3_3 && slot3_3 == slot3_4 && slot3_4 != slot3_5) {
            isWin = true;
            System.out.println("A TREIA LINIE 1 == 2 == 3 == 4");
            win += (9*bet);
            labelWIN.setText(String.valueOf(win));
        } else if(slot3_1 == slot3_2 && slot3_2 == slot3_3 && slot3_3 == slot3_4 && slot3_4 == slot3_5) {
            isWin = true;
            System.out.println("A TREIA LINIE 1 == 2 == 3 == 4 == 5");
            win += (40*bet);
            labelWIN.setText(String.valueOf(win));
        }

//        LINE \/
        if(slot1_1 == 4 && slot1_1 == slot2_2 && slot2_2 != slot3_3) {
            isWin = true;
            System.out.println("LINIE IN V : 1 == 2");
            win += (3*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot1_1 == slot2_2 && slot2_2 == slot3_3 && slot3_3 != slot2_4) {
            isWin = true;
            System.out.println("LINIE IN V : 1 == 2 == 3");
            win += (6*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot1_1 == slot2_2 && slot2_2 == slot3_3 && slot3_3 == slot2_4 && slot2_4 != slot1_5) {
            isWin = true;
            System.out.println("LINIE IN V : 1 == 2 == 3 == 4");
            win += (9*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot1_1 == slot2_2 && slot2_2 == slot3_3 && slot3_3 == slot2_4 && slot2_4 == slot1_5) {
            isWin = true;
            System.out.println("LINIE IN V : 1 == 2 == 3 == 4 == 5");
            win += (40*bet);
            labelWIN.setText(String.valueOf(win));
        }

//        LINE /\
        if(slot3_1 == 4 && slot3_1 == slot2_2 && slot2_2 != slot1_3) {
            isWin = true;
            System.out.println("LINIE IN A : 3 == 2");
            win += (3*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot3_1 == slot2_2 && slot2_2 == slot1_3 && slot1_3 != slot2_4) {
            isWin = true;
            System.out.println("LINIE IN A : 3 == 2 == 1");
            win += (6*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot3_1 == slot2_2 && slot2_2 == slot1_3 && slot1_3 == slot2_4 && slot2_4 != slot3_5) {
            isWin = true;
            System.out.println("LINIE IN A : 4 == 3 == 2 == 1");
            win += (9*bet);
            labelWIN.setText(String.valueOf(win));
        } else if (slot3_1 == slot2_2 && slot2_2 == slot1_3 && slot1_3 == slot2_4 && slot2_4 == slot3_5) {
            isWin = true;
            System.out.println("LINIE IN A : 5 == 4 == 3 == 2 == 1");
            win += (40*bet);
            labelWIN.setText(String.valueOf(win));
        }

        lastWin = win;
        cash -= bet;

        System.out.println("LINIA 1 : " + slot1_1 + " " + slot1_2 + " " + slot1_3 + " " + slot1_4 + " " + slot1_5 + "    WIN : " + win + " CASH : " + cash + " BET : " + bet);
        System.out.println("LINIA 2 : " + slot2_1 + " " + slot2_2 + " " + slot2_3 + " " + slot2_4 + " " + slot2_5 + "    WIN : " + win + " CASH : " + cash + " BET : " + bet);
        System.out.println("LINIA 3 : " + slot3_1 + " " + slot3_2 + " " + slot3_3 + " " + slot3_4 + " " + slot3_5 + "    WIN : " + win + " CASH : " + cash + " BET : " + bet);

//      SET THE TEXT FOR BET,WIN,CASH LABELS
        labelBET.setText(String.valueOf(bet));
        labelWIN.setText(String.valueOf(win));
        labelCASH.setText(String.valueOf(cash));

//		SET THE FRUITS IMAGES
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

        win = 0;

    }
}
