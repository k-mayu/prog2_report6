package jp.ac.uryukyu.ie.e175770;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Main {
    static JButton[] gameButtons = new JButton[9];

    public static void main(String[] args) {

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
        for (int i = 0; i < gameButtons.length; i++) {
            gameButtons[i] = new JButton(String.valueOf(i));
            gameButtons[i].setForeground(Color.white);
            mainPanel.add(gameButtons[i]);
            frame.setVisible(true);
        }
    }
}