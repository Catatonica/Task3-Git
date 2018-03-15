package com.epam.androidlab.task3_git;

/**
 * This class will be used to show the differences between
 * two conflicting commits. Here you'll be able to resolve them.
 *
 * @author Elizabeth Gavina
 * @since 14.03.2018
 */
class Git {

    private String mFeatureField;
    private static final String FUNNY_SMILE = ":)";
    private static final String SAD_SMILE = " :(";

    String getField() {
        return mFeatureField + FUNNY_SMILE + SAD_SMILE;
    }

    void setField(String mOriginField) {
        this.mFeatureField = mOriginField;
    }
}
