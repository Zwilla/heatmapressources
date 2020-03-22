package de.wirvsvirus.heatmapressources.entity.heatmaps;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "HEATMAPRESSOURCES_LAYER_WRAPPER")
@Entity(name = "heatmapressources_LayerWrapper")
public class LayerWrapper extends BaseUuidEntity {
    private static final long serialVersionUID = 5136018962065455559L;

    @Lob
    @Column(nullable = false)
    @NotNull
    @MetaProperty(mandatory = true)
    protected String name;

    @Lob
    @Column(nullable = false)
    @NotNull
    @MetaProperty(mandatory = true)
    protected String dataContainerId;


    public String getDataContainerId() {
            return dataContainerId;
        }

        public void setDataContainerId(String dataContainerId) {
            this.dataContainerId = dataContainerId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
