package jp.ac.uryukyu.ie.e175770;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Test extends JFrame{

    public static void main(String[] args) {
        new Test();
    }

    public Test(){
        // ウィンドウの作成およびタイトルの設定
        JFrame frame = new JFrame("三目並べ");
        // バツボタンでプログラムを終了するようにする
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ウィンドウサイズの指定
        frame.setSize(500, 500);
        // ウィンドウを画面中央に配置
        frame.setLocationRelativeTo(null);
        // ウィンドウを可視状態にする
        frame.setVisible(true);

        JPanel mainPanel = new JPanel(new GridLayout(3, 3));
        frame.add(mainPanel);
        JButton button1 = new JButton("");
        mainPanel.add(button1);
        JButton button2 = new JButton("");
        mainPanel.add(button2);
        JButton button3 = new JButton("");
        mainPanel.add(button3);
        JButton button4 = new JButton("");
        mainPanel.add(button4);
        JButton button5 = new JButton("");
        mainPanel.add(button5);
        JButton button6 = new JButton("");
        mainPanel.add(button6);
        JButton button7 = new JButton("");
        mainPanel.add(button7);
        JButton button8 = new JButton("");
        mainPanel.add(button8);
        JButton button9 = new JButton("");
        mainPanel.add(button9);
        frame.setVisible(true);
//        JButton[] gameButtons = new JButton[9];
//
//        for (int i = 0; i < gameButtons.length; i++) {
//            gameButtons[i] = new JButton(String.valueOf(i));
//            gameButtons[i].setForeground(Color.white);
//            mainPanel.add(gameButtons[i]);
//            frame.setVisible(true);
//        }
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    button1.setText("o");
                }
        });  //ここまでがイベントの定義
    }
}