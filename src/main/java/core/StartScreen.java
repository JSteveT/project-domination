package core;

import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;

import java.awt.event.*;
import java.util.*;

public class StartScreen extends JFrame implements ActionListener{
    Dimension dim;
    JPanel Colors, Players, Bottom;
    public JTextField Player1;
    JTextField Player2;
    JTextField Player3;
    JTextField Player4;
    JTextField Player5;
    JTextField Player6;
    public JComboBox player1;
    JComboBox player2;
    JComboBox player3;
    JComboBox player4;
    JComboBox player5;
    JComboBox player6;
    String [] colors = {"Empty", "Red", "Blue", "Green", "Yellow", "Black", "Gray"};
    ArrayList <Player> Users;
    int player;
    public boolean start;

    public StartScreen(){ 
        
        //start screen to set up players' names and colors
        super("World Domination");
        setSize(600, 860);
        setLayout(new BorderLayout());
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - 390, dim.height/2 - 500);

        Colors = new JPanel();
        Colors.setLayout(new GridLayout(7, 1));
        Colors.setPreferredSize(new Dimension(80, 400));
        Players = new JPanel();
        Players.setLayout(new GridLayout(7, 1));
        Players.setPreferredSize(new Dimension(200, 400));
        Bottom = new JPanel();
        Bottom.setPreferredSize(new Dimension(280, 50));

        Player1 = new JTextField("Enter name for Player 1"); //text fields for names
        Player1.setPreferredSize(new Dimension(100, 50));
        Player1.setHorizontalAlignment(JTextField.LEFT);
        Player2 = new JTextField("Enter name Player 2: ");
        Player2.setPreferredSize(new Dimension(100, 50));
        Player2.setHorizontalAlignment(JTextField.LEFT);
        Player3 = new JTextField("Enter name Player 3: ");
        Player3.setPreferredSize(new Dimension(100, 50));
        Player3.setHorizontalAlignment(JTextField.LEFT);
        Player4 = new JTextField("Enter name Player 4: ");
        Player4.setPreferredSize(new Dimension(100, 50));
        Player4.setHorizontalAlignment(JTextField.LEFT);
        Player5 = new JTextField("Enter name Player 5: ");
        Player5.setPreferredSize(new Dimension(100, 50));
        Player5.setHorizontalAlignment(JTextField.LEFT);
        Player6 = new JTextField("Enter name Player 6: ");
        Player6.setPreferredSize(new Dimension(100, 50));
        Player6.setHorizontalAlignment(JTextField.LEFT);

        Player1.addMouseListener(
            new MouseAdapter() {
                public void mousePressed( MouseEvent e ) {
                    Player1.setText("");
                }
            }
        );
        Player2.addMouseListener(
            new MouseAdapter() {
                public void mousePressed( MouseEvent e ) {
                    Player2.setText("");
                }
            }
        );
        Player3.addMouseListener(
            new MouseAdapter() {
                public void mousePressed( MouseEvent e ) {
                    Player3.setText("");
                }
            }
        );
        Player4.addMouseListener(
            new MouseAdapter() {
                public void mousePressed( MouseEvent e ) {
                    Player4.setText("");
                }
            }
        );
        Player5.addMouseListener(
            new MouseAdapter() {
                public void mousePressed( MouseEvent e ) {
                    Player5.setText("");
                }
            }
        );
        Player6.addMouseListener(
            new MouseAdapter() {
                public void mousePressed( MouseEvent e ) {
                    Player6.setText("");
                }
            }
        );

        start = false;

        Users = new ArrayList<>();
        player1 = new JComboBox<>(colors); //combobox for colors
        player1.setPreferredSize(new Dimension(80, 50));
        player2 = new JComboBox<>(colors);
        player2.setPreferredSize(new Dimension(80, 50));
        player3 = new JComboBox<>(colors);
        player3.setPreferredSize(new Dimension(80, 50));
        player4 = new JComboBox<>(colors);
        player4.setPreferredSize(new Dimension(80, 50));
        player5 = new JComboBox<>(colors);
        player5.setPreferredSize(new Dimension(80, 50));
        player6 = new JComboBox<>(colors);
        player6.setPreferredSize(new Dimension(80, 50));

        JLabel Name = new JLabel("Please input names", JLabel.CENTER);
        JLabel Color = new JLabel("Please choose player color", JLabel.CENTER);

        //JButton Info = new JButton("Info");
        //Info.addActionListener(this);
        JButton Start = new JButton("Game Start");
        Start.addActionListener(this);

        Players.add(Name);
        Players.add(Player1);
        Players.add(Player2);
        Players.add(Player3);
        Players.add(Player4);
        Players.add(Player5);
        Players.add(Player6);

        Colors.add(Color);
        Colors.add(player1);
        Colors.add(player2);
        Colors.add(player3);
        Colors.add(player4);
        Colors.add(player5);
        Colors.add(player6);

        Bottom.add(new JLabel());
        Bottom.add(new JLabel());
        Bottom.add(Start);

        add("North", new ScreenLogo());
        add("Center", Colors);
        add("East", Players);
        add("South", Bottom);

       

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int empty = 0;
        int red = 0;
        int blue = 0;
        int green = 0;
        int yellow = 0;
        int black = 0;
        int grey = 0;
        switch (player1.getSelectedIndex()) { //checks the color of every player
            case 0 -> empty++;
            case 1 -> red++;
            case 2 -> blue++;
            case 3 -> green++;
            case 4 -> yellow++;
            case 5 -> black++;
            case 6 -> grey++;
        }
        switch (player2.getSelectedIndex()) {
            case 0 -> empty++;
            case 1 -> red++;
            case 2 -> blue++;
            case 3 -> green++;
            case 4 -> yellow++;
            case 5 -> black++;
            case 6 -> grey++;
        }
        switch (player3.getSelectedIndex()) {
            case 0 -> empty++;
            case 1 -> red++;
            case 2 -> blue++;
            case 3 -> green++;
            case 4 -> yellow++;
            case 5 -> black++;
            case 6 -> grey++;
        }
        switch (player4.getSelectedIndex()) {
            case 0 -> empty++;
            case 1 -> red++;
            case 2 -> blue++;
            case 3 -> green++;
            case 4 -> yellow++;
            case 5 -> black++;
            case 6 -> grey++;
        }
        switch (player5.getSelectedIndex()) {
            case 0 -> empty++;
            case 1 -> red++;
            case 2 -> blue++;
            case 3 -> green++;
            case 4 -> yellow++;
            case 5 -> black++;
            case 6 -> grey++;
        }
        switch (player6.getSelectedIndex()){
            case 0: empty++;    break;
            case 1: red++;      break;
            case 2: blue++;     break;
            case 3: green++;    break;
            case 4: yellow++;   break;
            case 5: black++;    break;
            case 6: grey++;     break;
        }
        if (e.getActionCommand() == "Start"){
            JFrame frame = new JFrame();
            if(empty == 6){ //shows errors such as no players, only1 player, multiple players with the same colors or no names
                JOptionPane.showMessageDialog(frame,
                    "There are no players!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            else if (empty == 5){
                JOptionPane.showMessageDialog(frame,
                    "There is only 1 player!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            else if((red>1) || (blue>1) || (green>1) || (yellow>1) || (black>1) || (grey>1)){
                JOptionPane.showMessageDialog(frame,
                    "You have more than 1 player with the same color!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            else if((Player1.getText().isEmpty() && player1.getSelectedIndex()!=0) || (Player2.getText().isEmpty() && player2.getSelectedIndex()!=0) || (Player3.getText().isEmpty() && player3.getSelectedIndex()!=0) || (Player4.getText().isEmpty() && player4.getSelectedIndex()!=0) || (Player5.getText().isEmpty() && player5.getSelectedIndex()!=0) || (Player6.getText().isEmpty() && player6.getSelectedIndex()!=0)){
                JOptionPane.showMessageDialog(frame,
                    "There is a player with no name!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            else{ //starts the game by setting every player up 
                Color temp = Color.white;
                start = true;
                if(player1.getSelectedIndex()!=0){
                    switch (player1.getSelectedIndex()) {
                        case 0 -> {
                        }
                        case 1 -> temp = Color.red;
                        case 2 -> temp = Color.blue;
                        case 3 -> temp = Color.green;
                        case 4 -> temp = Color.yellow;
                        case 5 -> temp = Color.black;
                        case 6 -> temp = Color.gray;
                    }
                    Users.add(new Player(Player1.getText(), player, temp));
                    player++;
                }
                if(player2.getSelectedIndex()!=0){
                    switch (player2.getSelectedIndex()) {
                        case 0 -> {
                        }
                        case 1 -> temp = Color.red;
                        case 2 -> temp = Color.blue;
                        case 3 -> temp = Color.green;
                        case 4 -> temp = Color.yellow;
                        case 5 -> temp = Color.black;
                        case 6 -> temp = Color.gray;
                    }
                    Users.add(new Player(Player2.getText(), player, temp));
                    player++;
                }
                if(player3.getSelectedIndex()!=0){
                    switch (player3.getSelectedIndex()) {
                        case 0 -> {
                        }
                        case 1 -> temp = Color.red;
                        case 2 -> temp = Color.blue;
                        case 3 -> temp = Color.green;
                        case 4 -> temp = Color.yellow;
                        case 5 -> temp = Color.black;
                        case 6 -> temp = Color.gray;
                    }
                    Users.add(new Player(Player3.getText(), player, temp));
                    player++;
                }
                if(player4.getSelectedIndex()!=0){
                    switch (player4.getSelectedIndex()) {
                        case 0 -> {
                        }
                        case 1 -> temp = Color.red;
                        case 2 -> temp = Color.blue;
                        case 3 -> temp = Color.green;
                        case 4 -> temp = Color.yellow;
                        case 5 -> temp = Color.black;
                        case 6 -> temp = Color.gray;
                    }
                    Users.add(new Player(Player4.getText(), player, temp));
                    player++;
                }
                if(player5.getSelectedIndex()!=0){
                    switch (player5.getSelectedIndex()) {
                        case 0 -> {
                        }
                        case 1 -> temp = Color.red;
                        case 2 -> temp = Color.blue;
                        case 3 -> temp = Color.green;
                        case 4 -> temp = Color.yellow;
                        case 5 -> temp = Color.black;
                        case 6 -> temp = Color.gray;
                    }
                    Users.add(new Player(Player5.getText(), player, temp));
                    player++;
                }
                if(player6.getSelectedIndex()!=0){
                    switch(player6.getSelectedIndex()){
                        case 0:                        break;
                        case 1: temp = Color.red;      break;
                        case 2: temp = Color.blue;     break;
                        case 3: temp = Color.green;    break;
                        case 4: temp = Color.yellow;   break;
                        case 5: temp = Color.black;    break;
                        case 6: temp = Color.gray;     break;
                    }
                    Users.add(new Player(Player6.getText(), player, temp));
                    player++;
                }
                setVisible(false);
            }
        }
    }

    public boolean started(){
        return start;
    }

    public ArrayList<Player> getPlayers(){
        return Users;
    }
}