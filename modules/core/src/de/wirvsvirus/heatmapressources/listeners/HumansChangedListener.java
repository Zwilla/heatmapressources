package de.wirvsvirus.heatmapressources.listeners;

import com.haulmont.cuba.core.app.events.AttributeChanges;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.entity.contracts.Id;
import de.wirvsvirus.heatmapressources.entity.locations.Humans;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.UUID;

@Component("heatmapressources_HumansChangedListener")
public class HumansChangedListener {

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Humans, UUID> event) {

        Id<Humans, UUID> entityId = event.getEntityId();
        EntityChangedEvent.Type changeType = event.getType();

        AttributeChanges changes = event.getChanges();
        if (changes.isChanged("hr_FirstName")) {
            String oldName = changes.getOldValue("hr_FirstName");
        }

    }


    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onHeatmapressources_HumansAfterCommit(EntityChangedEvent<Humans, UUID> event) {

    }


    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void onHeatmapressources_HumansBeforeCommit(EntityChangedEvent<Humans, UUID> event) {

    }


    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    public void onHeatmapressources_HumansAfterCompletion(EntityChangedEvent<Humans, UUID> event) {

    }


    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void onHeatmapressources_HumansAfterRollback(EntityChangedEvent<Humans, UUID> event) {

    }
}
