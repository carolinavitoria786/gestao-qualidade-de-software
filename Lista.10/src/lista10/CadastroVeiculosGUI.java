package lista10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroVeiculosGUI extends JFrame {
    private JTextField txtNumeroChassi;
    private JTextField txtPlaca;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtAno;

    private DefaultListModel<Veiculo> listModel;
    private JList<Veiculo> veiculosList;

    public class Veiculo {
        private String numeroChassi;
        private String placa;
        private String marca;
        private String modelo;
        private int ano;

        public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
            this.numeroChassi = numeroChassi;
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        // Getters e setters
        public String getNumeroChassi() {
            return numeroChassi;
        }

        public void setNumeroChassi(String numeroChassi) {
            this.numeroChassi = numeroChassi;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        @Override
        public String toString() {
            return "Veiculo{" +
                    "numeroChassi='" + numeroChassi + '\'' +
                    ", placa='" + placa + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", ano=" + ano +
                    '}';
        }
    }

    public CadastroVeiculosGUI() {
        super("Cadastro de Veículos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();
        veiculosList = new JList<>(listModel);

        JPanel panelCadastro = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        panelCadastro.add(new JLabel("Número do Chassi:"), constraints);

        constraints.gridx = 1;
        txtNumeroChassi = new JTextField(20);
        panelCadastro.add(txtNumeroChassi, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panelCadastro.add(new JLabel("Placa:"), constraints);

        constraints.gridx = 1;
        txtPlaca = new JTextField(20);
        panelCadastro.add(txtPlaca, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panelCadastro.add(new JLabel("Marca:"), constraints);

        constraints.gridx = 1;
        txtMarca = new JTextField(20);
        panelCadastro.add(txtMarca, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panelCadastro.add(new JLabel("Modelo:"), constraints);

        constraints.gridx = 1;
        txtModelo = new JTextField(20);
        panelCadastro.add(txtModelo, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        panelCadastro.add(new JLabel("Ano:"), constraints);

        constraints.gridx = 1;
        txtAno = new JTextField(20);
        panelCadastro.add(txtAno, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarVeiculo();
            }
        });
        panelCadastro.add(btnCadastrar, constraints);

        constraints.gridy = 6;
        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesquisarVeiculo();
            }
        });
        panelCadastro.add(btnPesquisar, constraints);

        constraints.gridy = 7;
        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarVeiculo();
            }
        });
        panelCadastro.add(btnAtualizar, constraints);

        constraints.gridy = 8;
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirVeiculo();
            }
        });
        panelCadastro.add(btnExcluir, constraints);

        getContentPane().add(panelCadastro, BorderLayout.NORTH);

        getContentPane().add(new JScrollPane(veiculosList), BorderLayout.CENTER);
    }

    private void cadastrarVeiculo() {
        String numeroChassi = txtNumeroChassi.getText();
        String placa = txtPlaca.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        int ano = Integer.parseInt(txtAno.getText());

        Veiculo veiculo = new Veiculo(numeroChassi, placa, marca, modelo, ano);
        listModel.addElement(veiculo);
    }

    private void excluirVeiculo() {
        int selectedIndex = veiculosList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
        }
    }

    private void pesquisarVeiculo() {
        String chave = JOptionPane.showInputDialog("Digite o número do chassi:");
        if (chave != null && !chave.isEmpty()) {
            for (int i = 0; i < listModel.getSize(); i++) {
                Veiculo veiculo = listModel.getElementAt(i);
                if (veiculo.getNumeroChassi().equals(chave)) {
                    veiculosList.setSelectedIndex(i);
                    veiculosList.ensureIndexIsVisible(i);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
        }
    }

    private void atualizarVeiculo() {
        int selectedIndex = veiculosList.getSelectedIndex();
        if (selectedIndex != -1) {
            String placa = txtPlaca.getText();
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            int ano = Integer.parseInt(txtAno.getText());

            Veiculo veiculo = listModel.getElementAt(selectedIndex);
            veiculo.setPlaca(placa);
            veiculo.setMarca(marca);
            veiculo.setModelo(modelo);
            veiculo.setAno(ano);
            listModel.setElementAt(veiculo, selectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CadastroVeiculosGUI cadastroVeiculosGUI = new CadastroVeiculosGUI();
                cadastroVeiculosGUI.setVisible(true);
            }
        });
    }
}
