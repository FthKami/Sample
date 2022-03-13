package myProject.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
@Entity
@Table(name = "DARKHAST")
public class DarkhastEntity {
    private Long id;
    private Long shakhsId;
    private Long darkhstType;
    private Long darkhstStatus;

    private ShakhsEntity shakhsEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHAKHS_ID", referencedColumnName = "ID")
    public ShakhsEntity getShakhsEntity() {
        return shakhsEntity;
    }
    public void setShakhsEntity(ShakhsEntity shakhsEntity) {
        this.shakhsEntity = shakhsEntity;
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
    @Column(name = "SHAKHS_ID", insertable = false , updatable = false)
    public Long getShakhsId() {
        return shakhsId;
    }

    public void setShakhsId(Long shakhsId) {
        this.shakhsId = shakhsId;
    }

    @Basic
    @Column(name = "DARKHST_TYPE")
    public Long getDarkhstType() {
        return darkhstType;
    }

    public void setDarkhstType(Long darkhstType) {
        this.darkhstType = darkhstType;
    }

    @Basic
    @Column(name = "DARKHST_STATUS")
    public Long getDarkhstStatus() {
        return darkhstStatus;
    }

    public void setDarkhstStatus(Long darkhstStatus) {
        this.darkhstStatus = darkhstStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DarkhastEntity that = (DarkhastEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(shakhsId, that.shakhsId) &&
                Objects.equals(darkhstType, that.darkhstType) &&
                Objects.equals(darkhstStatus, that.darkhstStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shakhsId, darkhstType, darkhstStatus);
    }
}
