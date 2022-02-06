/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import src.main.java.com.nokri.dao.Keys;
import src.main.java.com.nokri.dao.Public;
import src.main.java.com.nokri.dao.tables.records.ProjectRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Project extends TableImpl<ProjectRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.project</code>
     */
    public static final Project PROJECT = new Project();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectRecord> getRecordType() {
        return ProjectRecord.class;
    }

    /**
     * The column <code>public.project.project_id</code>.
     */
    public final TableField<ProjectRecord, Long> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.project.profile_id</code>.
     */
    public final TableField<ProjectRecord, Long> PROFILE_ID = createField(DSL.name("profile_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.project.descripton</code>.
     */
    public final TableField<ProjectRecord, String> DESCRIPTON = createField(DSL.name("descripton"), SQLDataType.CLOB.nullable(false), this, "");

    private Project(Name alias, Table<ProjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private Project(Name alias, Table<ProjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.project</code> table reference
     */
    public Project(String alias) {
        this(DSL.name(alias), PROJECT);
    }

    /**
     * Create an aliased <code>public.project</code> table reference
     */
    public Project(Name alias) {
        this(alias, PROJECT);
    }

    /**
     * Create a <code>public.project</code> table reference
     */
    public Project() {
        this(DSL.name("project"), null);
    }

    public <O extends Record> Project(Table<O> child, ForeignKey<O, ProjectRecord> key) {
        super(child, key, PROJECT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ProjectRecord, Long> getIdentity() {
        return (Identity<ProjectRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ProjectRecord> getPrimaryKey() {
        return Keys.PROJECT_PKEY;
    }

    @Override
    public List<ForeignKey<ProjectRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PROJECT__FK_PROFILE);
    }

    private transient Userprofile _userprofile;

    /**
     * Get the implicit join path to the <code>public.userprofile</code> table.
     */
    public Userprofile userprofile() {
        if (_userprofile == null)
            _userprofile = new Userprofile(this, Keys.PROJECT__FK_PROFILE);

        return _userprofile;
    }

    @Override
    public Project as(String alias) {
        return new Project(DSL.name(alias), this);
    }

    @Override
    public Project as(Name alias) {
        return new Project(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(String name) {
        return new Project(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(Name name) {
        return new Project(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
