/*
 * This file is generated by jOOQ.
 */
package com.example.banksystem.database.schema;


import com.example.banksystem.database.schema.tables.BankInfo;
import com.example.banksystem.database.schema.tables.BankType;
import com.example.banksystem.database.schema.tables.User;
import com.example.banksystem.database.schema.tables.UserInfo;
import com.example.banksystem.database.schema.tables.records.BankInfoRecord;
import com.example.banksystem.database.schema.tables.records.BankTypeRecord;
import com.example.banksystem.database.schema.tables.records.UserInfoRecord;
import com.example.banksystem.database.schema.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * bank_db.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BankInfoRecord> KEY_BANK_INFO_PRIMARY = Internal.createUniqueKey(BankInfo.BANK_INFO, DSL.name("KEY_bank_info_PRIMARY"), new TableField[] { BankInfo.BANK_INFO.ID }, true);
    public static final UniqueKey<BankTypeRecord> KEY_BANK_TYPE_PRIMARY = Internal.createUniqueKey(BankType.BANK_TYPE, DSL.name("KEY_bank_type_PRIMARY"), new TableField[] { BankType.BANK_TYPE.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserInfoRecord> KEY_USER_INFO_PRIMARY = Internal.createUniqueKey(UserInfo.USER_INFO, DSL.name("KEY_user_info_PRIMARY"), new TableField[] { UserInfo.USER_INFO.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BankInfoRecord, BankTypeRecord> BANK_INFO_IBFK_1 = Internal.createForeignKey(BankInfo.BANK_INFO, DSL.name("bank_info_ibfk_1"), new TableField[] { BankInfo.BANK_INFO.BANK_ID }, Keys.KEY_BANK_TYPE_PRIMARY, new TableField[] { BankType.BANK_TYPE.ID }, true);
    public static final ForeignKey<UserInfoRecord, BankTypeRecord> USER_INFO_IBFK_1 = Internal.createForeignKey(UserInfo.USER_INFO, DSL.name("user_info_ibfk_1"), new TableField[] { UserInfo.USER_INFO.BANK_ID }, Keys.KEY_BANK_TYPE_PRIMARY, new TableField[] { BankType.BANK_TYPE.ID }, true);
    public static final ForeignKey<UserInfoRecord, UserRecord> USER_INFO_IBFK_2 = Internal.createForeignKey(UserInfo.USER_INFO, DSL.name("user_info_ibfk_2"), new TableField[] { UserInfo.USER_INFO.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
}
