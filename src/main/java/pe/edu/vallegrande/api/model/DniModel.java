package pe.edu.vallegrande.api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "consultas")
public class DniModel {
    @Id
    private Long id;

    @Column("dni")
    private String dni;

    @Column("nombres")
    private String nombres;

    @Column("apellido_paterno")
    private String apellidoPaterno;

    @Column("apellido_materno")
    private String apellidoMaterno;

    @Column("cod_verifica")
    private String codVerifica; 

    @Column("status")
    private String status;
}
