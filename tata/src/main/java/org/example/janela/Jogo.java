package org.example.janela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame {
    private JButton[][] buttons = new JButton[3][3];
    private char currentPlayer = 'X';
    private boolean gameOver = false;

    public Jogo() {
        setTitle("Jogo do Galo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // centralizar a janela
        this.setResizable(false);

        initUI();

        setVisible(true);
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        Font font = new Font("Arial", Font.BOLD, 60);

        // Criar botões e adicioná-los ao painel
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton btn = new JButton("");
                btn.setFont(font);
                buttons[i][j] = btn;
                btn.addActionListener(new ButtonListener(i, j));
                panel.add(btn);
            }
        }

        add(panel, BorderLayout.CENTER);
    }

    private class ButtonListener implements ActionListener {
        private int row;
        private int col;

        public ButtonListener(int r, int c) {
            this.row = r;
            this.col = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (gameOver) {
                return; // jogo acabou, não aceita cliques
            }

            JButton btn = buttons[row][col];
            if (!btn.getText().equals("")) {
                return; // botão já está marcado
            }

            btn.setText(String.valueOf(currentPlayer));

            if (checkWin(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Jogador " + currentPlayer + " venceu!");
                gameOver = true;
            } else if (checkDraw()) {
                JOptionPane.showMessageDialog(null, "Empate!");
                gameOver = true;
            } else {
                togglePlayer();
            }
        }
    }

    private void togglePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private boolean checkWin(char player) {
        // Checar linhas
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(player)) &&
                    buttons[i][1].getText().equals(String.valueOf(player)) &&
                    buttons[i][2].getText().equals(String.valueOf(player))) {
                return true;
            }
        }

        // Checar colunas
        for (int j = 0; j < 3; j++) {
            if (buttons[0][j].getText().equals(String.valueOf(player)) &&
                    buttons[1][j].getText().equals(String.valueOf(player)) &&
                    buttons[2][j].getText().equals(String.valueOf(player))) {
                return true;
            }
        }

        // Checar diagonais
        if (buttons[0][0].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][2].getText().equals(String.valueOf(player))) {
            return true;
        }

        if (buttons[0][2].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][0].getText().equals(String.valueOf(player))) {
            return true;
        }

        return false;
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false; // ainda tem espaços vazios
                }
            }
        }
        return true; // todos os espaços preenchidos e ninguém ganhou
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Jogo());
    }

}
