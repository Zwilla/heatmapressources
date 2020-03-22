package de.wirvsvirus.heatmapressources.entity.heatmaps;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@NamePattern("%s %s|hm_KindOf,hm_Description")
@Table(name = "HEATMAPRESSOURCES_HEAT_MAPS_ALL", indexes = {
        @Index(name = "IDX_HEATMAPRESSOURCES_HEAT_MAPS__GLOBAL", columnList = "HM_KIND_OF_ID")
})
@Entity(name = "heatmapressources_HeatMaps_All")
public class HeatMaps_Global extends StandardEntity {
    private static final long serialVersionUID = -2170023470367533752L;


    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HM_KIND_OF_ID")
    protected HeatMapsKind hm_KindOf;

    @NotNull
    @Column(name = "HM_DESCRIPTION", nullable = false)
    protected String hm_Description;


    public String getHm_Description() {
        return hm_Description;
    }


    public void setHm_Description(String hm_Description) {
        this.hm_Description = hm_Description;
    }


    public HeatMapsKind getHm_KindOf() {
        return hm_KindOf;
    }


    public void setHm_KindOf(HeatMapsKind hm_KindOf) {
        this.hm_KindOf = hm_KindOf;
    }
}
