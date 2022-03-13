package myProject.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
@Entity
@Table(name = "SHAKHS")
public class ShakhsEntity {
    private Long id;
    private String name;
    private String family;
    private String codeMeli;
    private String birthDate;

    private List<DarkhastEntity> darkhastEntityList;

    @OneToMany(mappedBy = "shakhsEntity", fetch = FetchType.LAZY)
    public List<DarkhastEntity> getDarkhastEntityList() {
        return darkhastEntityList;
    }
    public void setDarkhastEntityList(List<DarkhastEntity> darkhastEntityList) {
        this.darkhastEntityList = darkhastEntityList;
    }

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "FAMILY")
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Basic
    @Column(name = "CODE_MELI")
    public String getCodeMeli() {
        return codeMeli;
    }

    public void setCodeMeli(String codeMeli) {
        this.codeMeli = codeMeli;
    }

    @Basic
    @Column(name = "BIRTH_DATE")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShakhsEntity that = (ShakhsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(family, that.family) &&
                Objects.equals(codeMeli, that.codeMeli) &&
                Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, family, codeMeli, birthDate);
    }
}
