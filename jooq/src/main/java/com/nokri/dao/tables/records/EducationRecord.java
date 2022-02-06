/*
 * This file is generated by jOOQ.
 */
package src.main.java.com.nokri.dao.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import src.main.java.com.nokri.dao.tables.Education;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EducationRecord extends UpdatableRecordImpl<EducationRecord> implements Record7<Long, Long, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.education.education_id</code>.
     */
    public void setEducationId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.education.education_id</code>.
     */
    public Long getEducationId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.education.profile_id</code>.
     */
    public void setProfileId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.education.profile_id</code>.
     */
    public Long getProfileId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.education.education_level</code>.
     */
    public void setEducationLevel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.education.education_level</code>.
     */
    public String getEducationLevel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.education.university</code>.
     */
    public void setUniversity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.education.university</code>.
     */
    public String getUniversity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.education.degree</code>.
     */
    public void setDegree(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.education.degree</code>.
     */
    public String getDegree() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.education.from_date</code>.
     */
    public void setFromDate(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.education.from_date</code>.
     */
    public String getFromDate() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.education.to_date</code>.
     */
    public void setToDate(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.education.to_date</code>.
     */
    public String getToDate() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Education.EDUCATION.EDUCATION_ID;
    }

    @Override
    public Field<Long> field2() {
        return Education.EDUCATION.PROFILE_ID;
    }

    @Override
    public Field<String> field3() {
        return Education.EDUCATION.EDUCATION_LEVEL;
    }

    @Override
    public Field<String> field4() {
        return Education.EDUCATION.UNIVERSITY;
    }

    @Override
    public Field<String> field5() {
        return Education.EDUCATION.DEGREE;
    }

    @Override
    public Field<String> field6() {
        return Education.EDUCATION.FROM_DATE;
    }

    @Override
    public Field<String> field7() {
        return Education.EDUCATION.TO_DATE;
    }

    @Override
    public Long component1() {
        return getEducationId();
    }

    @Override
    public Long component2() {
        return getProfileId();
    }

    @Override
    public String component3() {
        return getEducationLevel();
    }

    @Override
    public String component4() {
        return getUniversity();
    }

    @Override
    public String component5() {
        return getDegree();
    }

    @Override
    public String component6() {
        return getFromDate();
    }

    @Override
    public String component7() {
        return getToDate();
    }

    @Override
    public Long value1() {
        return getEducationId();
    }

    @Override
    public Long value2() {
        return getProfileId();
    }

    @Override
    public String value3() {
        return getEducationLevel();
    }

    @Override
    public String value4() {
        return getUniversity();
    }

    @Override
    public String value5() {
        return getDegree();
    }

    @Override
    public String value6() {
        return getFromDate();
    }

    @Override
    public String value7() {
        return getToDate();
    }

    @Override
    public EducationRecord value1(Long value) {
        setEducationId(value);
        return this;
    }

    @Override
    public EducationRecord value2(Long value) {
        setProfileId(value);
        return this;
    }

    @Override
    public EducationRecord value3(String value) {
        setEducationLevel(value);
        return this;
    }

    @Override
    public EducationRecord value4(String value) {
        setUniversity(value);
        return this;
    }

    @Override
    public EducationRecord value5(String value) {
        setDegree(value);
        return this;
    }

    @Override
    public EducationRecord value6(String value) {
        setFromDate(value);
        return this;
    }

    @Override
    public EducationRecord value7(String value) {
        setToDate(value);
        return this;
    }

    @Override
    public EducationRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EducationRecord
     */
    public EducationRecord() {
        super(Education.EDUCATION);
    }

    /**
     * Create a detached, initialised EducationRecord
     */
    public EducationRecord(Long educationId, Long profileId, String educationLevel, String university, String degree, String fromDate, String toDate) {
        super(Education.EDUCATION);

        setEducationId(educationId);
        setProfileId(profileId);
        setEducationLevel(educationLevel);
        setUniversity(university);
        setDegree(degree);
        setFromDate(fromDate);
        setToDate(toDate);
    }
}