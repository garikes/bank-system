/*
 * This file is generated by jOOQ.
 */
package com.example.banksystem.database.schema.tables;


import com.example.banksystem.database.schema.BankDb;
import com.example.banksystem.database.schema.Keys;
import com.example.banksystem.database.schema.tables.records.BankTypeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankType extends TableImpl<BankTypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>bank_db.bank_type</code>
     */
    public static final BankType BANK_TYPE = new BankType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankTypeRecord> getRecordType() {
        return BankTypeRecord.class;
    }

    /**
     * The column <code>bank_db.bank_type.id</code>.
     */
    public final TableField<BankTypeRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bank_db.bank_type.name</code>.
     */
    public final TableField<BankTypeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    private BankType(Name alias, Table<BankTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankType(Name alias, Table<BankTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>bank_db.bank_type</code> table reference
     */
    public BankType(String alias) {
        this(DSL.name(alias), BANK_TYPE);
    }

    /**
     * Create an aliased <code>bank_db.bank_type</code> table reference
     */
    public BankType(Name alias) {
        this(alias, BANK_TYPE);
    }

    /**
     * Create a <code>bank_db.bank_type</code> table reference
     */
    public BankType() {
        this(DSL.name("bank_type"), null);
    }

    public <O extends Record> BankType(Table<O> child, ForeignKey<O, BankTypeRecord> key) {
        super(child, key, BANK_TYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : BankDb.BANK_DB;
    }

    @Override
    public Identity<BankTypeRecord, Integer> getIdentity() {
        return (Identity<BankTypeRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<BankTypeRecord> getPrimaryKey() {
        return Keys.KEY_BANK_TYPE_PRIMARY;
    }

    @Override
    public BankType as(String alias) {
        return new BankType(DSL.name(alias), this);
    }

    @Override
    public BankType as(Name alias) {
        return new BankType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankType rename(String name) {
        return new BankType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankType rename(Name name) {
        return new BankType(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
