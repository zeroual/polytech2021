package org.polytech.shipme.buisness.tracking;

import java.util.Objects;

public class TrackingId {

    private String id;

    public TrackingId() {
    }

    public TrackingId(String id) {

        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingId that = (TrackingId) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
