package de.wirvsvirus.heatmapressources.entity.humanresources;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import de.wirvsvirus.heatmapressources.entity.controlcenter.ControlCenter;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "HEATMAPRESSOURCES_MEDICAL_PROFESSIONALS")
@Entity(name = "heatmapressources_MedicalProfessionals")
public class MedicalProfessionals extends StandardEntity {
    private static final long serialVersionUID = 3654029687346254577L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MP_CONTROL_CENTER_ID")
    protected ControlCenter mp_ControlCenter;

    @Column(name = "MP_UNIQUE_SOCIAL_NUMBER")
    protected String mp_UniqueSocialNumber;

    @NotNull
    @Column(name = "MP_CERTIFICATION", nullable = false)
    protected String mp_Certification;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HR_IMEI_ID")
    protected Humans hr_IMEI;


    public ControlCenter getMp_ControlCenter() {
        return mp_ControlCenter;
    }


    public void setMp_ControlCenter(ControlCenter mp_ControlCenter) {
        this.mp_ControlCenter = mp_ControlCenter;
    }


    public String getMp_Certification() {
        return mp_Certification;
    }


    public void setMp_Certification(String mp_Certification) {
        this.mp_Certification = mp_Certification;
    }


    public Humans getHr_IMEI() {
        return hr_IMEI;
    }


    public void setHr_IMEI(Humans hr_IMEI) {
        this.hr_IMEI = hr_IMEI;
    }


    public String getMp_UniqueSocialNumber() {
        return mp_UniqueSocialNumber;
    }


    public void setMp_UniqueSocialNumber(String mp_UniqueSocialNumber) {
        this.mp_UniqueSocialNumber = mp_UniqueSocialNumber;
    }
}
