
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Cliente {
    
    private String Nome;

    public static final String PROP_NOME = "Nome";

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        String oldNome = this.Nome;
        this.Nome = Nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, Nome);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

        private String Email;

    public static final String PROP_EMAIL = "Email";

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        String oldEmail = this.Email;
        this.Email = Email;
        propertyChangeSupport.firePropertyChange(PROP_EMAIL, oldEmail, Email);
    }

    private String Senha;

    public static final String PROP_SENHA = "Senha";

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        String oldSenha = this.Senha;
        this.Senha = Senha;
        propertyChangeSupport.firePropertyChange(PROP_SENHA, oldSenha, Senha);
    }

}
