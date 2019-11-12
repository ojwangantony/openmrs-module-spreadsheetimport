package org.openmrs.module.spreadsheetimport;

import java.util.Map;

/**
 * Holder for grouped observations.
 * It is used to hold details of dataset columns that
 * should be processed into grouped observations
 */
public class GroupedObservations {
    private Integer groupConceptId;
    private Map<String, DatasetColumn> datasetColumns; // key is column name, value is DatasetColumn object

    public GroupedObservations() {
    }

    public GroupedObservations(Integer groupConceptId, Map<String, DatasetColumn> datasetColumns) {
        this.groupConceptId = groupConceptId;
        this.datasetColumns = datasetColumns;
    }

    public Integer getGroupConceptId() {
        return groupConceptId;
    }

    public void setGroupConceptId(Integer groupConceptId) {
        this.groupConceptId = groupConceptId;
    }

    public Map<String, DatasetColumn> getDatasetColumns() {
        return datasetColumns;
    }

    public void setDatasetColumns(Map<String, DatasetColumn> columnDetails) {
        this.datasetColumns = columnDetails;
    }

    public void addColumn(String key, DatasetColumn column) {
        if (!datasetColumns.containsKey(key)) {
            datasetColumns.put(key, column);
        }
    }
}
