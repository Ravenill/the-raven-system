/*
 * This file is generated by jOOQ.
 */
package com.kruczek.theravensystem.entity;


import com.kruczek.theravensystem.entity.tables.RssChannels;
import com.kruczek.theravensystem.entity.tables.records.RssChannelsRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RssChannelsRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<RssChannelsRecord> CONSTRAINT_7 = Internal.createUniqueKey(RssChannels.RSS_CHANNELS, "CONSTRAINT_7", new TableField[] { RssChannels.RSS_CHANNELS.ID }, true);
    }
}
