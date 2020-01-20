package jp.ac.uryukyu.ie.e175770;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
public class Bord extends JFrame {
    private int num;
    private int count;
    JButton[] gameButtons = new JButton[9];
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
        mainPanel.setPreferredSize(new Dimension(500, 550));
        frame.add(mainPanel,BorderLayout.SOUTH);
        //更新ボタンの作成(テスト用)
        JButton OK = new JButton("OK");
        frame.add(OK, BorderLayout.NORTH);
        //フレームを作成する
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
                if(judge() == null){
                    if(count % 2 == 0){
                        System.out.println("a"+num);
                        gameButtons[num].setText("o");
                        count++;
                    }else{
                        System.out.println("a"+num);
                        gameButtons[num].setText("x");
                        count++;
                    }
                }else{
                    System.out.println("game over");
                }
            }
        });
    }
    public String judge(){
        for (int a = 0; a < 8;a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = gameButtons[0].getText() + gameButtons[1].getText() + gameButtons[2].getText();
                    break;
                case 1:
                    line = gameButtons[3].getText() + gameButtons[4].getText() + gameButtons[5].getText();
                    break;
                case 2:
                    line = gameButtons[6].getText() + gameButtons[7].getText() + gameButtons[8].getText();
                    break;
                case 3:
                    line = gameButtons[0].getText() + gameButtons[3].getText() +gameButtons[6].getText();
                    break;
                case 4:
                    line = gameButtons[1].getText() + gameButtons[4].getText() + gameButtons[7].getText();
                    break;
                case 5:
                    line = gameButtons[2].getText() + gameButtons[5].getText() + gameButtons[8].getText();
                    break;
                case 6:
                    line = gameButtons[0].getText() + gameButtons[4].getText() + gameButtons[8].getText();
                    break;
                case 7:
                    line = gameButtons[2].getText() + gameButtons[4].getText() + gameButtons[6].getText();
                    break;
            }
            if (line.equals("xxx")) {
                return "x";
            } else if (line.equals("ooo")) {
                return "o";
            }
        }
        return null;
    }
}