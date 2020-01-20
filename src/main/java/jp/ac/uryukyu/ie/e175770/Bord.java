package jp.ac.uryukyu.ie.e175770;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;



public class Bord extends JFrame {
    private int num;
    private int count;


    public Bord() {
        // ウィンドウの作成およびタイトルの設定
        JFrame frame = new JFrame("三目並べ");
        // バツボタンでプログラムを終了するようにする
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ウィンドウサイズの指定
        frame.setSize(500, 600);
        // ウィンドウを画面中央に配置
        frame.setLocationRelativeTo(null);
        // ウィンドウを可視状態にする
        frame.setVisible(true);

        JPanel mainPanel = new JPanel(new GridLayout(3, 3));
        mainPanel.setPreferredSize(new Dimension(500, 500));
        frame.add(mainPanel);

        //更新ボタンの作成
        JButton OK = new JButton("OK");
        frame.add(OK, BorderLayout.NORTH);
        
        //フレームを作成する
        JButton[] gameButtons = new JButton[9];
        //int num ;
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
                     num = Integer.parseInt(command);
                    System.out.println("num:"+num);
                }
            });
            gameButtons[i].setActionCommand(String.valueOf(i));
        }

        OK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               // int count = 0;
                if(count % 2 == 0){
                    System.out.println("a"+num);
                    gameButtons[num].setText("o");
                    count++;
                }else{
                    System.out.println("a"+num);
                    gameButtons[num].setText("x");
                    count++;
                }
            }
        });  //ここまでがイベントの定義
    }
}



