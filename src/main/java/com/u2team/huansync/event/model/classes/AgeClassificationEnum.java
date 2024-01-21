
package com.u2team.huansync.event.model.classes;

/**
 *
 * @Cristian Pardo
 */
public enum AgeClassificationEnum {
    FAMILY("For the whole family"), 
    YOUNGER("Only for young people"), 
    ADULT("Adults Only");
    
    private String description;

    private AgeClassificationEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
