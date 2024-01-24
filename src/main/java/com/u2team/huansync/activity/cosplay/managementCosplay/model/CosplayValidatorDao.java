package com.u2team.huansync.activity.cosplay.managementCosplay.model;

/**
 * Interface defining methods for validating Cosplay entities in a data access
 * object.
 */
public interface CosplayValidatorDao {
    // void validateCosplayforActPartCospl(Cosplay cosplay);

    /**
     * Validates whether the cosplay with the provided ID is active.
     *
     * @param idCosplay The ID of the cosplay to be validated.
     */
    void validateCosplayisActive(int idCosplay);

    /**
     * Validates whether the cosplay with the provided ID is deactivated.
     *
     * @param idCosplay The ID of the cosplay to be validated.
     */
    void validateCosplayisDesact(int idCosplay);

}
