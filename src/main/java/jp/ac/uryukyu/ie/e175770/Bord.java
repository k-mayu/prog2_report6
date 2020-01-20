package jp.ac.uryukyu.ie.e175770;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Bord extends JFrame {

    public Bord() {
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

        //フレームを作成する
        JButton[] gameButtons = new JButton[9];
        int num = 0;
        for (int i = 0; i < gameButtons.length; i++) {
            gameButtons[i] = new JButton(String.valueOf(i));
            gameButtons[i].setForeground(Color.white);
            gameButtons[i] = new JButton();
            mainPanel.add(gameButtons[i]);
            frame.setVisible(true);

            //押されたボタン取得
            gameButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    int num = Integer.parseInt(command);
                    System.out.println(command);
                }
            });
            gameButtons[i].setActionCommand(String.valueOf(i));
        }

        gameButtons[num].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                for (int count = 0; count < 9; count++) {
                    if (count % 2 == 0) {
                        gameButtons[num].setText("o");
                        int b1 = 1;
                        System.out.println(b1);
                    } else {
                        gameButtons[num].setText("x");
                        int b1 = -1;
                        System.out.println(b1);
                    }
                }
            }
            });  //ここまでがイベントの定義


                        }

        }