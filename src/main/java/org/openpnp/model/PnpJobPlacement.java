package org.openpnp.model;

import org.simpleframework.xml.Attribute;

public class PnpJobPlacement extends AbstractModelObject {
    public enum Status {
        Disabled,
        Pending,
        Processing,
        Error,
        Done
    }
    
    public enum ErrorOption {
        Raise,
        Continue
    }
    
    @Attribute(required = false)
    private Status status = Status.Pending;
    
    @Attribute(required = false)
    private ErrorOption errorOption = ErrorOption.Continue;
    
    @Attribute(required = false)
    private int ordinal = 1;
    
    public Status getStatus() {
        return status;
    }
    
    public int getOrdinal() {
        return ordinal;
    }
    
    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }
}
