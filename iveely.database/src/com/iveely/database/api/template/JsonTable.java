/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iveely.database.api.template;

/**
 * @author X1 Carbon
 */
public class JsonTable {

  private String dbName;
  private String tableName;
  private String[] columns;
  private Integer[] types;
  private boolean[] uniques;

  public JsonTable(String dbName) {
    this.dbName = dbName;
  }

  /**
   * @return the tableName
   */
  public String getTableName() {
    return tableName;
  }

  /**
   * @param tableName the tableName to set
   */
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * @return the columns
   */
  public String[] getColumns() {
    return columns;
  }

  /**
   * @param columns the columns to set
   */
  public void setColumns(String[] columns) {
    this.columns = columns;
  }

  /**
   * @return the types
   */
  public Integer[] getTypes() {
    return types;
  }

  /**
   * @param types the types to set
   */
  public void setTypes(Integer[] types) {
    this.types = types;
  }

  /**
   * @return the uniques
   */
  public boolean[] getUniques() {
    return uniques;
  }

  /**
   * @param uniques the uniques to set
   */
  public void setUniques(boolean[] uniques) {
    this.uniques = uniques;
  }

  public String toJson() {
    return com.iveely.framework.text.JSONUtil.toString(this);
  }

  /**
   * @return the dbName
   */
  public String getDbName() {
    return dbName;
  }

  /**
   * @param dbName the dbName to set
   */
  public void setDbName(String dbName) {
    this.dbName = dbName;
  }
}
