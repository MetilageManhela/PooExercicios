
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/**
 *
 * @author Metila
 */
@Entity
public class Pessoa {
    @Id
    @GeneratedValue
    private int id; 
    private String nome;
    private String DataNascimento;
    private String Naturalidade;
    
    

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.Naturalidade = Naturalidade;
        
    }
    /**
     * 
     * @return 
     */   
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", DataNascimento=" + DataNascimento + ", Naturalidade=" + Naturalidade + '}';
    }
    
    
    
}
