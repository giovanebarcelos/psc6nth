package views.user;

import models.Usuario;
import models.dao.UsuarioDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class UsuarioList extends JPanel {
    private UserListTableModel tableModel;
    private JTable table;
    private JButton btnNew;
    private UsuarioDAO usarioDAO;

    public UsuarioList(){
        this.initComponents();
        this.loadUsuarios();
    }

    private void loadUsuarios() {
        List<Usuario> usuarios = usarioDAO.findAll();
        tableModel.setUsuarios(usuarios);
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        
        this.tableModel = new UserListTableModel(List.of());
        table = new JTable(this.tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        btnNew = new JButton("Novo Usuário");
        btnNew.addActionListener( e -> {
            JOptionPane.showMessageDialog(this,
                    "Não implementado ainda!");
        });

        JPanel panelBtn = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBtn.add(btnNew);

        add(scrollPane, BorderLayout.CENTER);
        add(panelBtn, BorderLayout.SOUTH);
    }
}
