package views.user;

import models.Usuario;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UserListTableModel extends AbstractTableModel {
    private List<Usuario> usuarios;
    private final String[] colunas = {
            "ID", "Nome", "Email", "Senha",
            "Editar", "Excluir"
    };

    public UserListTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario u = this.usuarios.get(rowIndex);
        switch ( columnIndex){
            case 0: return u.getId();
            case 1: return u.getNome();
            case 2: return u.getEmail();
            case 3: return u.getSenha();
            case 4: return "Editar";
            case 5: return "Excluir";
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 4 || columnIndex == 5;
    }

    public Usuario getUsuarioAt(int rowIndex){
        return this.usuarios.get(rowIndex);
    }

    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
        fireTableDataChanged();
    }


}
